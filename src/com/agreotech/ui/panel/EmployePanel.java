package com.agreotech.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.agreotech.domaine.Employe;
import com.agreotech.ui.model.ModelEmploye;


public class EmployePanel extends JPanel {
	
	JTextField txtMatricule;
	JTextField txtNom;
	JTextField txtPrenom;
	JTextField txtFonction;
	JTextField txtContact;
	JTextField txtSalaire;
	ButtonGroup buttonGroup;
	
	public EmployePanel() {
		// TODO Auto-generated constructor stub
		JLabel labelMatricule=new JLabel("MATRICULE");	
		JLabel labelNom=new JLabel("NOM");	
		JLabel labelPrenom= new JLabel("PRENOM");
		JLabel labelFonction=new JLabel("FONCTION");
		JLabel labelSexe=new JLabel("SEXE");
		JLabel labelContact=new JLabel("CONTACT");
		JLabel labelSalaire=new JLabel("SALAIRE");
		
		//
		txtMatricule=new JTextField("");
		txtNom=new JTextField("");
		txtPrenom=new JTextField("");
		txtFonction=new JTextField("");
		txtContact=new JTextField("");
		txtSalaire=new JTextField("");
		
		JRadioButton radioH=new JRadioButton("Homme");
		JRadioButton radioF=new JRadioButton("Femme");
		buttonGroup=new ButtonGroup();
		buttonGroup.add(radioF);
		buttonGroup.add(radioH);
		radioF.setBackground(new Color(204, 204, 204));
		radioH.setBackground(new Color(204, 204, 204));
		
		JButton btnValider=new JButton("VALIDER");
		JButton btnAnnuler=new JButton("ANNULER");
		JButton btnSup=new JButton("SUPPRIMER");
		btnSup.setEnabled(false);
		JButton btnModif=new JButton("MODIFIER");
		btnModif.setEnabled(false);
		
		JOptionPane confirmationsupp = new JOptionPane();
		
//		SUR LE PANEL FORM_PANEL QUE DJE DISPOSE EN GRIDLAYOUT LES JLABEL,LES JTEXFIELD,ET LES BOUTON_RADIO
		
		JPanel formPanel=new JPanel();
		formPanel.setLayout(new GridLayout(7,2,5,5));
		
		formPanel.add(labelMatricule);
		formPanel.add(txtMatricule);

		formPanel.add(labelNom);
		formPanel.add(txtNom);
		
		formPanel.add(labelPrenom);
		formPanel.add(txtPrenom);
		
		formPanel.add(labelFonction);
		formPanel.add(txtFonction);
		
		formPanel.add(radioF);
		formPanel.add(radioH);
		
		formPanel.add(labelContact);
		formPanel.add(txtContact);

		formPanel.add(labelSalaire);
		formPanel.add(txtSalaire);

		formPanel.add(btnAnnuler);
		formPanel.add(btnValider);
		formPanel.add(btnModif);
		formPanel.add(btnSup);
		
		
		formPanel.setBackground(new Color(204, 204, 204));
		
		
		JPanel txtAndBtnPanel=new JPanel();
		txtAndBtnPanel.setLayout(new BoxLayout(txtAndBtnPanel,BoxLayout.Y_AXIS));
		txtAndBtnPanel.setBounds(3, 3, 300, 445);
		txtAndBtnPanel.setBackground(new Color(204, 204, 204));
		
		ImageIcon icon=new ImageIcon("salut.gif");
		txtAndBtnPanel.add(new JLabel(icon));
		
		txtAndBtnPanel.add(new JLabel("ZONE DE TEXTE"));
	
		txtAndBtnPanel.add(formPanel);
		
		this.setLayout(null); //absoluteLayout
		this.add(txtAndBtnPanel);
		
		JPanel tablePanel=new JPanel();
		tablePanel.setBounds(310, 3, 669, 545);
		tablePanel.setBackground(new Color(204, 204, 204));
		
		ModelEmploye modelEmploye=new ModelEmploye();
		JTable tableEmploye=new JTable(modelEmploye);
		
		JScrollPane jScrollPane=new JScrollPane(tableEmploye);
		jScrollPane.setPreferredSize(new Dimension(640, 440));
		
		tablePanel.add(jScrollPane);
		
		
		this.add(tablePanel);
		
		//this.add(tablePanel);
		
		//setBackground(new Color(204, 204, 204));
		
		// action sur "btnAnnuler"
		btnAnnuler.addActionListener(e ->{
			this.viderLesChamp();
			btnModif.setEnabled(false);
			btnSup.setEnabled(false);
			btnValider.setEnabled(true);
			btnValider.setBackground(new Color(205, 255, 205));
		});
		
		tableEmploye.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtMatricule.setText((String) modelEmploye.getValueAt(tableEmploye.getSelectedRow(), 0));
				txtNom.setText((String) modelEmploye.getValueAt(tableEmploye.getSelectedRow(), 1));
				txtPrenom.setText((String) modelEmploye.getValueAt(tableEmploye.getSelectedRow(), 2));
				txtFonction.setText((String) modelEmploye.getValueAt(tableEmploye.getSelectedRow(), 3));
				txtContact.setText((String) modelEmploye.getValueAt(tableEmploye.getSelectedRow(), 4));
				txtSalaire.setText((String) modelEmploye.getValueAt(tableEmploye.getSelectedRow(), 5));

				btnSup.setEnabled(true);
				btnSup.setBackground(new Color(205, 255, 205));
				btnModif.setEnabled(true);
				btnModif.setBackground(new Color(205, 255, 205));
				btnValider.setBackground(new Color(205, 191, 205));
				btnValider.setEnabled(false);
				btnAnnuler.setBackground(new Color(205, 255, 205));
				
				
			}
		});
		

		// action sur "btnValider"
		btnValider.addActionListener(e ->{
			
			String sexe ="";
			if (radioH.isSelected()) sexe = "HOMME";
			else if(radioF.isSelected()) sexe = "FEMME";

			int salaire = Integer.parseInt(txtSalaire.getText());
			
			Employe employe = new Employe(txtMatricule.getText(), txtNom.getText(), txtPrenom.getText(), txtFonction.getText(), sexe, txtContact.getText(), salaire);
			
			this.viderLesChamp();
			
			if(modelEmploye.ajouterEmploye(employe)) {
				JOptionPane.showMessageDialog(null, "Enregistrement effectué", "Information", JOptionPane.DEFAULT_OPTION);
				
			}
		});
		
		// action btnSup
		btnSup.addActionListener(e ->{
			
			int option = confirmationsupp.showConfirmDialog(null,
					"Voulez-vous supprimer l'employé ?",
					"Suppression de l'employé",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			
			if (option == JOptionPane.OK_OPTION) {
				
				modelEmploye.suprEmploye(tableEmploye.getSelectedRow());
				this.viderLesChamp();
				JOptionPane.showMessageDialog(null, "Suppression effectuée", "Information", JOptionPane.DEFAULT_OPTION);
			}
			
			btnSup.setEnabled(false);
			btnModif.setEnabled(false);
			btnValider.setEnabled(true);
			btnValider.setBackground(new Color(205, 255, 205));
			
			
		});
		
		// action btnModif
		btnModif.addActionListener(e ->{
			
			String sexe ="";
			if (radioH.isSelected()) sexe = "HOMME";
			else if(radioF.isSelected()) sexe = "FEMME";

			int salaire = Integer.parseInt(txtSalaire.getText());
			
				modelEmploye.ModifEmploye(tableEmploye.getSelectedRow(), txtMatricule.getText(), txtNom.getText(), txtPrenom.getText(), txtFonction.getText(), sexe, txtContact.getText(), salaire);
			
				this.viderLesChamp();
				JOptionPane.showMessageDialog(null, "Modification effectué", "Information", JOptionPane.DEFAULT_OPTION);
				
				btnSup.setEnabled(false);
				btnModif.setEnabled(false);
				btnValider.setEnabled(true);
				btnValider.setBackground(new Color(205, 255, 205));
		});
		
		
	}
	
	public void viderLesChamp() {

		this.txtMatricule.setText("");
		this.txtNom.setText("");
		this.txtPrenom.setText("");
		this.txtFonction.setText("");
		this.buttonGroup.clearSelection();
		this.txtContact.setText("");
		this.txtSalaire.setText("");
	}

}
