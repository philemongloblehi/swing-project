package com.agreotech.ui.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.agreotech.domaine.Parcelle;
import com.agreotech.service.IParcelleService;
import com.agreotech.serviceImpl.ParcelleService;

@SuppressWarnings("serial")
public class ModelParcelle extends AbstractTableModel {
	
	private IParcelleService parcelleService;
	protected List<Parcelle> listParcelle;
	private String[] entete = { "CULTURE", "OBSERVATION" };
	
	public ModelParcelle() {
		parcelleService = new ParcelleService();
		listParcelle = parcelleService.liretout();
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
		return listParcelle.size();
	}

	@Override
	public Object getValueAt(int rowSelected, int columSelected) {
		switch (columSelected) {
		   case 0:
			   return listParcelle.get(rowSelected).getCulture();
		   case 1:
			   return listParcelle.get(rowSelected).getObservation();			
		}
		return null;

	}
	
	public boolean ajouterParcelle(Parcelle parcelle) {
		if (parcelleService.ajouter(parcelle)) {
			this.fireTableRowsInserted(listParcelle.size(), listParcelle.size());
			return true;
		}
		return false;
	}
	
	public void suprParcelle(int rowSelected) {
		if (parcelleService.supprimer((listParcelle.get(rowSelected).getId()))) {
			listParcelle.remove(rowSelected);
			fireTableRowsDeleted(rowSelected, rowSelected);
		}
	}
	
	public void ModifEngin(int rowSelected, String strCulture, String strObservation) {
		listParcelle.get(rowSelected).setCulture(strCulture);
		listParcelle.get(rowSelected).setObservation(strObservation);
		parcelleService.modifier(listParcelle.get(rowSelected));
		fireTableRowsUpdated(rowSelected, rowSelected);
	}

	
}
