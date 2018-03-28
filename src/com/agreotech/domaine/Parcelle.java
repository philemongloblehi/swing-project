package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2017
 * @version 1.1
 * 
 * Cette classe dénommée "Parcelle" permettra
 * L'enregistrement et l'affichage la parcelle agricole
 *
 */
public class Parcelle {
	
	/**
	 * Déclaration des propriétés
	 */
	private int id;
	private String culture;
	private String observation;
	
	
	/**
	 * Déclaration du constructeur sans paramètres
	 */
	public Parcelle() {
		super();
	}


	/**
	 * Déclaration du constructeur avec paramètres
	 * @param culture
	 * @param observation
	 */
	public Parcelle(String culture, String observation) {
		super();
		this.culture = culture;
		this.observation = observation;
	}


	/**
	 * Accesseur propriété id
	 * @return
	 */
	public int getId() {
		return id;
	}


	/**
	 * Mutateur propriété id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * Accesseur propriété culture
	 * @return
	 */
	public String getCulture() {
		return culture;
	}


	/**
	 * Mutateur propriété culture
	 * @param culture
	 */
	public void setCulture(String culture) {
		this.culture = culture;
	}


	/**
	 * Accesseur propriété observation
	 * @return
	 */
	public String getObservation() {
		return observation;
	}


	/**
	 * Mutateur propriété observation
	 * @param observation
	 */
	public void setObservation(String observation) {
		this.observation = observation;
	}


	/**
	 * Redéfinition méthode toString()
	 */
	@Override
	public String toString() {
		return "Parcelle [id=" + id + ", culture=" + culture + ", observation=" + observation + "]";
	}
	
	

}
