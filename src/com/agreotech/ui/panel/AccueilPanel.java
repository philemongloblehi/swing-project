package com.agreotech.ui.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AccueilPanel extends JPanel {
	
	public AccueilPanel() {
		// TODO Auto-generated constructor stub
		setBackground(Color.blue);
		
		JLabel jLabel=new JLabel("ICI C'EST L'ACCEUIL AGREOTECH");
		jLabel.setFont(new Font("Courier New", Font.BOLD, 40));
		jLabel.setForeground(Color.white);
		this.add(jLabel);		
		
	}


}
