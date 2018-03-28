package com.agreotech.serviceImpl;

import java.util.List;

import com.agreotech.dao.IParcelleDao;
import com.agreotech.daoImpl.ParcelleDao;
import com.agreotech.domaine.Parcelle;
import com.agreotech.service.IParcelleService;

public class ParcelleService implements IParcelleService {
	
	IParcelleDao parcelleDao = new ParcelleDao();

	@Override
	public boolean ajouter(Parcelle t) {
		if (!"".equals(t.getCulture())) {
			parcelleDao.save(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifier(Parcelle t) {
		if (parcelleDao.readOne(t.getId()) != null) {
			parcelleDao.update(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean supprimer(Integer pk) {
		if (parcelleDao.readOne(pk) != null) {
			parcelleDao.delete(pk);
			return true;
		}
		return false;
	}

	@Override
	public Parcelle lireUn(Integer pk) {
		Parcelle parcelle = parcelleDao.readOne(pk);
		return parcelle;
	}

	@Override
	public List<Parcelle> liretout() {
		// TODO Auto-generated method stub
		return parcelleDao.readAll();
	}

}
