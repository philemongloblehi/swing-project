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

import com.agreotech.domaine.Produit;
import com.agreotech.ui.model.ModelProduit;


public class ProduitPanel extends JPanel {
	
	JTextField txtDesignation;
	JTextField txtPrix;
	
	public ProduitPanel() {
		// TODO Auto-generated constructor stub
		JLabel labelDesignation=new JLabel("DESIGNATION");
		JLabel labelPrix=new JLabel("PRIX");
		
		//
		txtDesignation=new JTextField("");
		txtPrix=new JTextField("");
		
		
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
		
		formPanel.add(labelDesignation);
		formPanel.add(txtDesignation);

		formPanel.add(labelPrix);
		formPanel.add(txtPrix);
		
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
		
		ModelProduit modelProduit=new ModelProduit();
		JTable tableProduit=new JTable(modelProduit);
		
		JScrollPane jScrollPane=new JScrollPane(tableProduit);
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
		
		tableProduit.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtDesignation.setText((String) modelProduit.getValueAt(tableProduit.getSelectedRow(), 0));
				txtPrix.setText((String) modelProduit.getValueAt(tableProduit.getSelectedRow(), 1));

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
			Produit produit = new Produit(txtDesignation.getText(), (int)txtPrix.getText());
			
			this.viderLesChamp();
			
			if(modelProduit.ajouterProduit(produit)) {
				JOptionPane.showMessageDialog(null, "Enregistrement effectué", "Information", JOptionPane.DEFAULT_OPTION);
				
			}
		});
		
		// action btnSup
		btnSup.addActionListener(e ->{
			
			int option = confirmationsupp.showConfirmDialog(null,
					"Voulez-vous supprimer le produit ?",
					"Suppression du produit",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			
			if (option == JOptionPane.OK_OPTION) {
				
				modelProduit.suprProduit(tableProduit.getSelectedRow());
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
				modelProduit.ModifProduit(tableProduit.getSelectedRow(), txtDesignation.getText(), (int)txtPrix.getText());
			
				this.viderLesChamp();
				JOptionPane.showMessageDialog(null, "Modification effectuée", "Information", JOptionPane.DEFAULT_OPTION);
				
				btnSup.setEnabled(false);
				btnModif.setEnabled(false);
				btnValider.setEnabled(true);
				btnValider.setBackground(new Color(205, 255, 205));
		});
		
		
	}
	
	public void viderLesChamp() {

		this.txtDesignation.setText("");
		this.txtPrix.setText("");
	}

}
