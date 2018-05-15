package com.agreotech.ui;

import java.awt.Container;

import javax.swing.JFrame;

import com.agreotech.ui.panel.AccueilPanel;
import com.agreotech.ui.panel.EmployePanel;
import com.agreotech.ui.panel.EnginPanel;
import com.agreotech.ui.panel.MenuDeNavigationPanel;
import com.agreotech.ui.panel.ParcellePanel;
import com.agreotech.ui.panel.ProduitPanel;
import com.agreotech.ui.panel.RendementPanel;



public class MaFenetrePrincipale extends JFrame {
	
	public MaFenetrePrincipale() {
		this.setJMenuBar(new MonMenuBar(this));
		this.setTitle("Accueil");
		this.setSize(1150, 525);
		this.setResizable(false);
		this.setAlwaysOnTop(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container container=this.getContentPane();
		container.setLayout(null);
		
		AccueilPanel accueilPanel=new AccueilPanel();
		accueilPanel.setBounds(163, 1, 972, 452);
		container.add(accueilPanel);
		accueilPanel.setVisible(true);
		
		EmployePanel employePanel=new EmployePanel();
		employePanel.setBounds(163, 1, 972, 452);
		container.add(employePanel);
		employePanel.setVisible(false);
		
		EnginPanel enginPanel=new EnginPanel();
		enginPanel.setBounds(163, 1, 972, 452);
		enginPanel.setVisible(false);

		ParcellePanel parcellePanel=new ParcellePanel();
		parcellePanel.setBounds(163, 1, 972, 452);
		parcellePanel.setVisible(false);
		
		ProduitPanel produitPanel=new ProduitPanel();
		produitPanel.setBounds(163, 1, 972, 452);
		produitPanel.setVisible(false);

		RendementPanel rendementPanel=new RendementPanel();
		rendementPanel.setBounds(163, 1, 972, 452);
		rendementPanel.setVisible(false);

		
		MenuDeNavigationPanel menuDeNavigationPanel= new MenuDeNavigationPanel(accueilPanel, employePanel, enginPanel, parcellePanel, produitPanel, rendementPanel );
		//il permet de deposer le composant o� tu veux
		
		menuDeNavigationPanel.setBounds(1, 1, 160, 260);
		
		this.add(menuDeNavigationPanel);
		this.add(employePanel);
		this.add(enginPanel);
		this.add(parcellePanel);
		this.add(produitPanel);
		this.add(rendementPanel);
		
		this.setVisible(true);
	}

}
