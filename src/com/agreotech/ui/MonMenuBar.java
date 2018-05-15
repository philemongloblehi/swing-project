package com.agreotech.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MonMenuBar extends JMenuBar {
	
	JMenu menuAutre=new JMenu("Action");
	JMenuItem itemAide=new JMenuItem("Aide");
	JMenuItem itemQuitter=new JMenuItem("Quitter");
	
	
	public MonMenuBar(JFrame frame) {
		// TODO Auto-generated constructor stub
		
		menuAutre.add(itemAide);
		menuAutre.add(itemQuitter);
		this.add(menuAutre);
		
		itemQuitter.addActionListener(e->{
				// TODO Auto-generated method stub
			frame.dispose();
		}
		);

		this.setVisible(true);
		
	}

}
