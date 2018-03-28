package com.agreotech.serviceImpl;

import java.util.List;

import com.agreotech.dao.IEnginDao;
import com.agreotech.daoImpl.EnginDao;
import com.agreotech.domaine.Engin;
import com.agreotech.service.IEnginService;

public class EnginService implements IEnginService {
	
	IEnginDao enginDao = new EnginDao();

	@Override
	public boolean ajouter(Engin t) {
		if ( (!"".equals(t.getImmatriculation())) && (!"".equals(t.getMarque())) ) {
			enginDao.save(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifier(Engin t) {
		if (enginDao.readOne(t.getId()) != null) {
			enginDao.update(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean supprimer(Integer pk) {
		if (enginDao.readOne(pk) != null) {
			enginDao.delete(pk);
			return true;
		}
		return false;
	}

	@Override
	public Engin lireUn(Integer pk) {
		Engin engin = enginDao.readOne(pk);
		return engin;
	}

	@Override
	public List<Engin> liretout() {
		// TODO Auto-generated method stub
		return enginDao.readAll();
	}

}
