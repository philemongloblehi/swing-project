package com.agreotech.domaine;


/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette classe d�nomm�e "Rendement" permettra
 * L'enregistrement et l'affichage du rendement des r�coltes
 *
 */
public class Rendement {
	
	/**
	 * D�claration des propri�t�s
	 */
	private int id;
	private String designation;
	private String annee;
	private double recolte;
	
	
	/**
	 * D�claration du constructeur sans param�tre
	 */
	public Rendement() {
		super();
	}


	/**
	 * D�claration du constructeur avec param�tre
	 * @param designation
	 * @param annee
	 * @param recolte
	 */
	public Rendement(String designation, String annee, double recolte) {
		super();
		this.designation = designation;
		this.annee = annee;
		this.recolte = recolte;
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
	 * Accesseur annee
	 * @return
	 */
	public String getAnnee() {
		return annee;
	}


	/**
	 * Mutateur annee
	 * @param annee
	 */
	public void setAnnee(String annee) {
		this.annee = annee;
	}


	/**
	 * Accesseur recolte
	 * @return
	 */
	public double getRecolte() {
		return recolte;
	}


	/**
	 * Mutateur recolte
	 * @param recolte
	 */
	public void setRecolte(double recolte) {
		this.recolte = recolte;
	}


	/**
	 * Red�finition m�thode toString()
	 */
	@Override
	public String toString() {
		return "Rendement [id=" + id + ", designation=" + designation + ", annee=" + annee + ", recolte=" + recolte
				+ "]";
	}
	
	
	
	

}
