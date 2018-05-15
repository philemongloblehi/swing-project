package com.agreotech.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.agreotech.domaine.Employe;



public class MaFenetreDeConnexion extends JFrame {

	JPanel entete = new JPanel();
	JPanel form = new JPanel();
	JPanel bouton = new JPanel();

	JLabel labLogin = new JLabel("Nom utilisateur");
	JLabel labPass = new JLabel("Mot de passe");

	JTextField txtLogin = new JTextField("");
	JTextField txtPass = new JTextField("");

	JButton bValider = new JButton("Connexion");
	JButton bReset = new JButton("Annuler");

	public MaFenetreDeConnexion() {
		
		this.setTitle("CONNEXION");
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout(0, 5));

		entete.setLayout(new BoxLayout(entete, BoxLayout.Y_AXIS));

		form.setLayout(new GridLayout(2, 4, 0, 10));
		form.setBackground(Color.WHITE);
		form.add(new JLabel());
		form.add(labLogin);
		form.add(txtLogin);
		form.add(new JLabel());
		form.add(new JLabel());
		form.add(labPass);
		form.add(txtPass);
		form.add(new JLabel());

		entete.add(form);
		bValider.setBackground(new Color(205, 255, 205));
		bReset.setBackground(new Color(205, 255, 205));
		bValider.setFont(new Font("ariel", Font.BOLD, 14));
		bReset.setFont(new Font("ariel", Font.BOLD, 14));

		bouton.add(bValider);
		bouton.add(bReset);
		bouton.setBackground(Color.WHITE);

		entete.add(bouton);
		add(entete, BorderLayout.NORTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		// action sur "bValider"
		bValider.addActionListener(e ->{
			
			
			this.viderLesChamp();
			
		});
		
		// action sur "bReset"
		bValider.addActionListener(e ->{
			
			this.viderLesChamp();
			
		});

		
	}
	
	public void viderLesChamp() {

		this.txtLogin.setText("");
		this.txtPass.setText("");
	}


}
