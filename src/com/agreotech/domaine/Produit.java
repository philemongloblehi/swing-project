package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette classe d�nomm�e "Produit" permettra
 * L'enregistrement et l'affichage du produit agricole utilis�
 * sur la parcelle agricole
 *
 */
public class Produit {
	
	/**
	 * D�claration des propri�t�s
	 */
	private int id;
	private String designation;
	private int prix;
	
	
	/**
	 * D�claration du constructeur sans param�tre
	 */
	public Produit() {
		super();
	}


	/**
	 * D�claration du constructeur avec param�tres
	 * @param designation
	 * @param prix
	 */
	public Produit(String designation, int prix) {
		super();
		this.designation = designation;
		this.prix = prix;
	}


	/**
	 * Accesseur id
	 * @return
	 */
	public int getId() {
		return id;
	}


	/**
	 * Mutateur id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * Accesseur designation
	 * @return
	 */
	public String getDesignation() {
		return designation;
	}


	/**
	 * Mutateur designation
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}


	/**
	 * Accesseur prix
	 * @return
	 */
	public int getPrix() {
		return prix;
	}


	/**
	 * Mutateur prix
	 * @param prix
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}


	/**
	 * Red�finition de la m�thode toString()
	 */
	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", prix=" + prix + "]";
	}
	
	
}
