package com.agreotech.domaine;


/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette classe dénommée "Rendement" permettra
 * L'enregistrement et l'affichage du rendement des récoltes
 *
 */
public class Rendement {
	
	/**
	 * Déclaration des propriétés
	 */
	private int id;
	private String designation;
	private String annee;
	private double recolte;
	
	
	/**
	 * Déclaration du constructeur sans paramètre
	 */
	public Rendement() {
		super();
	}


	/**
	 * Déclaration du constructeur avec paramètre
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
	 * Redéfinition méthode toString()
	 */
	@Override
	public String toString() {
		return "Rendement [id=" + id + ", designation=" + designation + ", annee=" + annee + ", recolte=" + recolte
				+ "]";
	}
	
	
	
	

}
