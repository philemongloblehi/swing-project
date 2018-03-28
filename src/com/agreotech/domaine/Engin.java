package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette classe dénommée "Engin" permettra
 * L'enregistrement et l'affichage d'un engin mécanique
 * utilisé sur la parcelle agricole
 *
 */
public class Engin {
	
	/**
	 * Déclaration des propriétés
	 */	
	private int id;
	private String immatriculation;
	private String marque;
	private double consoEssenceJournaliere;
	
	/**
	 * Déclaration du constructeur sans paramètres
	 */
	public Engin() {
		super();
	}
	
	/**
	 * Déclaration du constructeur avec paramètres
	 * @param immatriculation
	 * @param marque
	 * @param consoEssenceJournaliere
	 */	
	public Engin(String immatriculation, String marque, double consoEssenceJournaliere) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.consoEssenceJournaliere = consoEssenceJournaliere;
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
	 * Accesseur immatriculation
	 * @return
	 */
	public String getImmatriculation() {
		return immatriculation;
	}
	/**
	 * Mutateur immatriculation
	 * @param immatriculation
	 */
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	/**
	 * Accesseur marque
	 * @return
	 */
	public String getMarque() {
		return marque;
	}
	/**
	 * Mutateur marque
	 * @param marque
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}
	/**
	 * Accesseur consoEssenceJournaliere
	 * @return
	 */
	public double getConsoEssenceJournaliere() {
		return consoEssenceJournaliere;
	}
	/**
	 * Mutateur consoEssenceJournaliere
	 * @param consoEssenceJournaliere
	 */
	public void setConsoEssenceJournaliere(double consoEssenceJournaliere) {
		this.consoEssenceJournaliere = consoEssenceJournaliere;
	}
	
	/**
	 * Rédefinition de la methode toString()
	 */
	@Override
	public String toString() {
		return "Engin [id=" + id + ", immatriculation=" + immatriculation + ", marque=" + marque
				+ ", consoEssenceJournaliere=" + consoEssenceJournaliere + "]";
	}
	
	

}
