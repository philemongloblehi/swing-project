package com.agreotech.ui.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.agreotech.domaine.Produit;
import com.agreotech.service.IParcelleService;
import com.agreotech.serviceImpl.ProduitService;

@SuppressWarnings("serial")
public class ModelProduit extends AbstractTableModel {
	
	private ProduitService produitService;
	protected List<Produit> listProduit;
	private String[] entete = { "DESIGNATION", "PRIX" };
	
	public ModelProduit() {
		produitService = new ProduitService();
		listProduit = produitService.liretout();
	}
	
	@Override
	public String getColumnName(int colum) {
		// TODO Auto-generated method stub
		return entete[colum];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return entete.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listProduit.size();
	}

	@Override
	public Object getValueAt(int rowSelected, int columSelected) {
		switch (columSelected) {
		   case 0:
			   return listProduit.get(rowSelected).getDesignation();
		   case 1:
			   return listProduit.get(rowSelected).getPrix();			
		}
		return null;

	}
	
	public boolean ajouterProduit(Produit produit) {
		if (produitService.ajouter(produit)) {
			this.fireTableRowsInserted(listProduit.size(), listProduit.size());
			return true;
		}
		return false;
	}
	
	public void suprProduit(int rowSelected) {
		if (produitService.supprimer((listProduit.get(rowSelected).getId()))) {
			listProduit.remove(rowSelected);
			fireTableRowsDeleted(rowSelected, rowSelected);
		}
	}
	
	public void ModifProduit(int rowSelected, String strDesignation, int intPrix) {
		listProduit.get(rowSelected).setDesignation(strDesignation);
		listProduit.get(rowSelected).setPrix(intPrix);
		produitService.modifier(listProduit.get(rowSelected));
		fireTableRowsUpdated(rowSelected, rowSelected);
	}

	
}
