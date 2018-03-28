package com.agreotech.serviceImpl;

import java.util.List;

import com.agreotech.dao.IRendementDao;
import com.agreotech.daoImpl.RendementDao;
import com.agreotech.domaine.Rendement;
import com.agreotech.service.IRendementService;

public class RendementService implements IRendementService {
	
	IRendementDao rendementDao = new RendementDao();

	@Override
	public boolean ajouter(Rendement t) {
		if ( (!"".equals(t.getDesignation())) && (!"".equals(t.getAnnee())) && (!"".equals(t.getRecolte())) ) {
			rendementDao.save(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifier(Rendement t) {
		if (rendementDao.readOne(t.getId()) != null) {
			rendementDao.update(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean supprimer(Integer pk) {
		if (rendementDao.readOne(pk) != null) {
			rendementDao.delete(pk);
			return true;
		}
		return false;
	}

	@Override
	public Rendement lireUn(Integer pk) {
		// TODO Auto-generated method stub
		return rendementDao.readOne(pk);
	}

	@Override
	public List<Rendement> liretout() {
		// TODO Auto-generated method stub
		return rendementDao.readAll();
	}

}
