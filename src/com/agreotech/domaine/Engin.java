package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette classe d�nomm�e "Engin" permettra
 * L'enregistrement et l'affichage d'un engin m�canique
 * utilis� sur la parcelle agricole
 *
 */
public class Engin {
	
	/**
	 * D�claration des propri�t�s
	 */	
	private int id;
	private String immatriculation;
	private String marque;
	private double consoEssenceJournaliere;
	
	/**
	 * D�claration du constructeur sans param�tres
	 */
	public Engin() {
		super();
	}
	
	/**
	 * D�claration du constructeur avec param�tres
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
	 * R�definition de la methode toString()
	 */
	@Override
	public String toString() {
		return "Engin [id=" + id + ", immatriculation=" + immatriculation + ", marque=" + marque
				+ ", consoEssenceJournaliere=" + consoEssenceJournaliere + "]";
	}
	
	

}
