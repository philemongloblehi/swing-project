package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2017
 * @version 1.1
 * 
 * Cette classe d�nomm�e "Parcelle" permettra
 * L'enregistrement et l'affichage la parcelle agricole
 *
 */
public class Parcelle {
	
	/**
	 * D�claration des propri�t�s
	 */
	private int id;
	private String culture;
	private String observation;
	
	
	/**
	 * D�claration du constructeur sans param�tres
	 */
	public Parcelle() {
		super();
	}


	/**
	 * D�claration du constructeur avec param�tres
	 * @param culture
	 * @param observation
	 */
	public Parcelle(String culture, String observation) {
		super();
		this.culture = culture;
		this.observation = observation;
	}


	/**
	 * Accesseur propri�t� id
	 * @return
	 */
	public int getId() {
		return id;
	}


	/**
	 * Mutateur propri�t� id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * Accesseur propri�t� culture
	 * @return
	 */
	public String getCulture() {
		return culture;
	}


	/**
	 * Mutateur propri�t� culture
	 * @param culture
	 */
	public void setCulture(String culture) {
		this.culture = culture;
	}


	/**
	 * Accesseur propri�t� observation
	 * @return
	 */
	public String getObservation() {
		return observation;
	}


	/**
	 * Mutateur propri�t� observation
	 * @param observation
	 */
	public void setObservation(String observation) {
		this.observation = observation;
	}


	/**
	 * Red�finition m�thode toString()
	 */
	@Override
	public String toString() {
		return "Parcelle [id=" + id + ", culture=" + culture + ", observation=" + observation + "]";
	}
	
	

}
