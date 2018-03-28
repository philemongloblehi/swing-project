package com.agreotech.serviceImpl;

import java.util.List;

import com.agreotech.dao.IEmployeDao;
import com.agreotech.daoImpl.EmployeDao;
import com.agreotech.domaine.Employe;
import com.agreotech.service.IEmployeService;

public class EmployeService implements IEmployeService {
	
	IEmployeDao employeDao = new EmployeDao();

	@Override
	public boolean ajouter(Employe t) {
		if ( (!"".equals(t.getMatricule())) && (!"".equals(t.getNom())) && (!"".equals(t.getPrenom())) ) {
			employeDao.save(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifier(Employe t) {
		if (employeDao.readOne(t.getId()) != null) {
			employeDao.update(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean supprimer(Integer pk) {
		if (employeDao.readOne(pk) != null) {
			employeDao.delete(pk);
			return true;
		}
		return false;
	}

	@Override
	public Employe lireUn(Integer pk) {
		Employe employe = employeDao.readOne(pk);
		return employe;
	}

	@Override
	public List<Employe> liretout() {
		// TODO Auto-generated method stub
		return employeDao.readAll();
	}

}
