package com.agreotech.ui.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.agreotech.domaine.Rendement;
import com.agreotech.service.IRendementService;
import com.agreotech.serviceImpl.RendementService;

@SuppressWarnings("serial")
public class ModelRendement extends AbstractTableModel {
	
	private IRendementService rendementService;
	protected List<Rendement> listRendement;
	private String[] entete = { "DESIGNATION", "ANNEE", "RECOLTE" };
	
	public ModelRendement() {
		rendementService = new RendementService();
		listRendement = rendementService.liretout();
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
		return listRendement.size();
	}

	@Override
	public Object getValueAt(int rowSelected, int columSelected) {
		switch (columSelected) {
		   case 0:
			   return listRendement.get(rowSelected).getDesignation();
		   case 1:
			   return listRendement.get(rowSelected).getAnnee();
		   case 2:
			   return listRendement.get(rowSelected).getRecolte();			

		}
		return null;

	}
	
	public boolean ajouterRendement(Rendement rendement) {
		if (rendementService.ajouter(rendement)) {
			this.fireTableRowsInserted(listRendement.size(), listRendement.size());
			return true;
		}
		return false;
	}
	
	public void suprRendement(int rowSelected) {
		if (rendementService.supprimer((listRendement.get(rowSelected).getId()))) {
			listRendement.remove(rowSelected);
			fireTableRowsDeleted(rowSelected, rowSelected);
		}
	}
	
	public void ModifRendement(int rowSelected, String strDesignation, String strAnnee, double doubleRecolte) {
		listRendement.get(rowSelected).setDesignation(strDesignation);
		listRendement.get(rowSelected).setAnnee(strAnnee);
		listRendement.get(rowSelected).setRecolte(doubleRecolte);
		rendementService.modifier(listRendement.get(rowSelected));
		fireTableRowsUpdated(rowSelected, rowSelected);
	}

	
}
