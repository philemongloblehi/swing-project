package com.agreotech.ui.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.agreotech.domaine.Engin;
import com.agreotech.service.IEnginService;
import com.agreotech.serviceImpl.EnginService;

@SuppressWarnings("serial")
public class ModelEngin extends AbstractTableModel {
	
	private IEnginService enginService;
	protected List<Engin> listEngin;
	private String[] entete = { "IMMATRICULATION", "MARQUE", "CONSOMMATION" };
	
	public ModelEngin() {
		enginService = new EnginService();
		listEngin = enginService.liretout();
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
		return listEngin.size();
	}

	@Override
	public Object getValueAt(int rowSelected, int columSelected) {
		switch (columSelected) {
		   case 0:
			   return listEngin.get(rowSelected).getImmatriculation();
		   case 1:
			   return listEngin.get(rowSelected).getMarque();
		   case 2:
			   return listEngin.get(rowSelected).getConsoEssenceJournaliere();
			
		}
		return null;

	}
	
	public boolean ajouterEngin(Engin engin) {
		if (enginService.ajouter(engin)) {
			this.fireTableRowsInserted(listEngin.size(), listEngin.size());
			return true;
		}
		return false;
	}
	
	public void suprEngin(int rowSelected) {
		if (enginService.supprimer((listEngin.get(rowSelected).getId()))) {
			listEngin.remove(rowSelected);
			fireTableRowsDeleted(rowSelected, rowSelected);
		}
	}
	
	public void ModifEngin(int rowSelected, String strImmatriculation, String strMarque, double doubleConso) {
		listEngin.get(rowSelected).setImmatriculation(strImmatriculation);
		listEngin.get(rowSelected).setMarque(strMarque);
		listEngin.get(rowSelected).setConsoEssenceJournaliere(doubleConso);
		enginService.modifier(listEngin.get(rowSelected));
		fireTableRowsUpdated(rowSelected, rowSelected);
	}

	
}
