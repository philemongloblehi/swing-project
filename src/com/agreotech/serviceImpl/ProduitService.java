package com.agreotech.serviceImpl;

import java.util.List;

import com.agreotech.dao.IProduitDao;
import com.agreotech.daoImpl.ProduitDao;
import com.agreotech.domaine.Produit;
import com.agreotech.service.IProduitService;

public class ProduitService implements IProduitService {
	
	IProduitDao produitDao = new ProduitDao();

	@Override
	public boolean ajouter(Produit t) {
		if ( (!"".equals(t.getDesignation())) && (!"".equals(t.getPrix())) ) {
			produitDao.save(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifier(Produit t) {
		if (produitDao.readOne(t.getId()) != null) {
			produitDao.update(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean supprimer(Integer pk) {
		if (produitDao.readOne(pk) != null) {
			produitDao.delete(pk);
			return true;
		}
		return false;
	}

	@Override
	public Produit lireUn(Integer pk) {
		Produit produit = produitDao.readOne(pk);
		return produit;
	}

	@Override
	public List<Produit> liretout() {
		// TODO Auto-generated method stub
		return produitDao.readAll();
	}

}
