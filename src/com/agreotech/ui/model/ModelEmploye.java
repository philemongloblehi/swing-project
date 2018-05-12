package com.agreotech.ui.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.agreotech.domaine.Employe;
import com.agreotech.service.IEmployeService;
import com.agreotech.serviceImpl.EmployeService;

@SuppressWarnings("serial")
public class ModelEmploye extends AbstractTableModel {
	
	private IEmployeService employeService;
	protected List<Employe> listEmploye;
	private String[] entete = { "MATRICULE", "NOM", "PRENOMS", "FONCTION", "SEXE", "CONTACT", "SALAIRE" };
	
	public ModelEmploye() {
		employeService = new EmployeService();
		listEmploye = employeService.liretout();
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
		return listEmploye.size();
	}

	@Override
	public Object getValueAt(int rowSelected, int columSelected) {
		switch (columSelected) {
		   case 0:
			   return listEmploye.get(rowSelected).getMatricule();
		   case 1:
			   return listEmploye.get(rowSelected).getNom();
		   case 2:
			   return listEmploye.get(rowSelected).getPrenom();
		   case 3:
			   return listEmploye.get(rowSelected).getFonction();
		   case 4:
			   return listEmploye.get(rowSelected).getSexe();
		   case 5:
			   return listEmploye.get(rowSelected).getContact();
		   case 6:
			   return listEmploye.get(rowSelected).getSalaire();
			
		}
		return null;

	}
	
	public boolean ajouterEmploye(Employe employe) {
		if (employeService.ajouter(employe)) {
			this.fireTableRowsInserted(listEmploye.size(), listEmploye.size());
			return true;
		}
		return false;
	}
	
	public void suprEmploye(int rowSelected) {
		if (employeService.supprimer((listEmploye.get(rowSelected).getId()))) {
			listEmploye.remove(rowSelected);
			fireTableRowsDeleted(rowSelected, rowSelected);
		}
	}
	
	public void ModifEmploye(int rowSelected, String strMatricule, String strNom, String strPrenom, String strFonction, String strSexe, String strContact, int intSalaire) {
		listEmploye.get(rowSelected).setMatricule(strMatricule);
		listEmploye.get(rowSelected).setNom(strNom);
		listEmploye.get(rowSelected).setPrenom(strPrenom);
		listEmploye.get(rowSelected).setFonction(strFonction);
		listEmploye.get(rowSelected).setSexe(strSexe);
		listEmploye.get(rowSelected).setContact(strContact);
		listEmploye.get(rowSelected).setSalaire(intSalaire);
		employeService.modifier(listEmploye.get(rowSelected));
		fireTableRowsUpdated(rowSelected, rowSelected);
	}

	
}
