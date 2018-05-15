package com.agreotech.ui.panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuDeNavigationPanel extends JPanel {
	

	public MenuDeNavigationPanel(AccueilPanel accueilPanel, EmployePanel employePanel, EnginPanel enginPanel, ParcellePanel parcellePanel, ProduitPanel produitPanel, RendementPanel rendementPanel) {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.CYAN);
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.add(new JLabel(new ImageIcon("noBack.png")));
		
		this.add(new JLabel("AGREO-TECH ..."));
		
		Button btnAccueil=new Button("ACCUEIL");
		btnAccueil.setBackground(new Color(0, 162, 232));
		btnAccueil.setForeground(Color.white);
		
		Button btnEmploye=new Button("EMPLOYE");
		btnEmploye.setBackground(Color.cyan);
		
		Button btnEngin=new Button("ENGIN");
		btnEngin.setBackground(Color.CYAN);
		
		Button btnParcelle=new Button("PARCELLE");
		btnParcelle.setBackground(Color.CYAN);

		Button btnProduit=new Button("PRODUIT");
		btnProduit.setBackground(Color.CYAN);

		Button btnRendement=new Button("RENDEMENT");
		btnRendement.setBackground(Color.CYAN);

		this.add(btnAccueil);
		this.add(btnEmploye);
		this.add(btnEngin);
		this.add(btnParcelle);
		this.add(btnProduit);
		this.add(btnRendement);

		btnAccueil.addMouseListener( new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				btnEmploye.setBackground(Color.CYAN);
				btnEngin.setBackground(Color.CYAN);
				btnParcelle.setBackground(Color.CYAN);
				btnProduit.setBackground(Color.CYAN);
				btnRendement.setBackground(Color.CYAN);

				btnAccueil.setBackground(new Color(0, 162, 232));
				
				accueilPanel.setVisible(true);
				employePanel.setVisible(false);
				enginPanel.setVisible(false);
				parcellePanel.setVisible(false);
				produitPanel.setVisible(false);
				rendementPanel.setVisible(false);


			}
			
		});

		btnEmploye.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				btnEmploye.setBackground(new Color(204, 204, 204));
				btnEngin.setBackground(new Color(204, 204, 204));
				btnParcelle.setBackground(new Color(204, 204, 204));
				btnProduit.setBackground(new Color(204, 204, 204));
				btnRendement.setBackground(new Color(204, 204, 204));

				btnAccueil.setBackground(new Color(0, 162, 232));
				
				accueilPanel.setVisible(false);
				employePanel.setVisible(true);
				enginPanel.setVisible(false);
				parcellePanel.setVisible(false);
				produitPanel.setVisible(false);
				rendementPanel.setVisible(false);
			}
			
		});
		
		
		btnEngin.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				btnEmploye.setBackground(new Color(204, 204, 204));
				btnEngin.setBackground(new Color(204, 204, 204));
				btnParcelle.setBackground(new Color(204, 204, 204));
				btnProduit.setBackground(new Color(204, 204, 204));
				btnRendement.setBackground(new Color(204, 204, 204));

				btnAccueil.setBackground(new Color(0, 162, 232));
				
				accueilPanel.setVisible(false);
				employePanel.setVisible(false);
				enginPanel.setVisible(true);
				parcellePanel.setVisible(false);
				produitPanel.setVisible(false);
				rendementPanel.setVisible(false);
			}
			
		});
		
		btnParcelle.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				btnEmploye.setBackground(new Color(204, 204, 204));
				btnEngin.setBackground(new Color(204, 204, 204));
				btnParcelle.setBackground(new Color(204, 204, 204));
				btnProduit.setBackground(new Color(204, 204, 204));
				btnRendement.setBackground(new Color(204, 204, 204));

				btnAccueil.setBackground(new Color(0, 162, 232));
				
				accueilPanel.setVisible(false);
				employePanel.setVisible(false);
				enginPanel.setVisible(false);
				parcellePanel.setVisible(true);
				produitPanel.setVisible(false);
				rendementPanel.setVisible(false);
			}
			
		});
		
		btnProduit.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				btnEmploye.setBackground(new Color(204, 204, 204));
				btnEngin.setBackground(new Color(204, 204, 204));
				btnParcelle.setBackground(new Color(204, 204, 204));
				btnProduit.setBackground(new Color(204, 204, 204));
				btnRendement.setBackground(new Color(204, 204, 204));

				btnAccueil.setBackground(new Color(0, 162, 232));
				
				accueilPanel.setVisible(false);
				employePanel.setVisible(false);
				enginPanel.setVisible(false);
				parcellePanel.setVisible(false);
				produitPanel.setVisible(true);
				rendementPanel.setVisible(false);
			}
			
		});
		
		btnRendement.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				btnEmploye.setBackground(new Color(204, 204, 204));
				btnEngin.setBackground(new Color(204, 204, 204));
				btnParcelle.setBackground(new Color(204, 204, 204));
				btnProduit.setBackground(new Color(204, 204, 204));
				btnRendement.setBackground(new Color(204, 204, 204));

				btnAccueil.setBackground(new Color(0, 162, 232));
				
				accueilPanel.setVisible(false);
				employePanel.setVisible(false);
				enginPanel.setVisible(false);
				parcellePanel.setVisible(false);
				produitPanel.setVisible(false);
				rendementPanel.setVisible(true);
			}
			
		});
		
	
		
		
		
	}

}
