package com.agreotech.domaine;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette classe dénommée "Employe" permettra
 * L'enregistrement et l'affichage des coordonnées de l'employe
 * travaillant sur la parcelle agricole
 *
 */

public class Employe {

	/**
	 * Déclaration des propriétés
	 */
	private int id;
	private String matricule;
	private String nom;
	private String prenom;
	private String fonction;
	private String sexe;
	private String contact;
	private int salaire;
	
	/**
	 * Déclaration du constructeur sans paramètres
	 */
	public Employe() {
		super();
	}

	/**
	 * Déclaration du constructeur avec paramètres
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param fonction
	 * @param sexe
	 * @param contact
	 * @param salaire
	 */
	public Employe(String matricule, String nom, String prenom, String fonction, String sexe, String contact,
			int salaire) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.sexe = sexe;
		this.contact = contact;
		this.salaire = salaire;
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
	 * Accesseur matricule
	 * @return
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * Mutateur matricule
	 * @param matricule
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * Accesseur nom
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Mutateur nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Accesseur prenom
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Mutateur prenom
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Accesseur fonction
	 * @return
	 */
	public String getFonction() {
		return fonction;
	}

	/**
	 * Mutateur fonction
	 * @param fonction
	 */
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	/**
	 * Accesseur sexe
	 * @return
	 */
	public String getSexe() {
		return sexe;
	}

	/**
	 * Mutateur sexe
	 * @param sexe
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	/**
	 * Accesseur contact
	 * @return
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * Mutateur contact
	 * @param contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * Accesseur salaire
	 * @return
	 */
	public int getSalaire() {
		return salaire;
	}

	/**
	 * Mutateur salaire
	 * @param salaire
	 */
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	/**
	 * Rédefinition de la méthode toString()
	 */
	@Override
	public String toString() {
		return "Employe [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", fonction="
				+ fonction + ", sexe=" + sexe + ", contact=" + contact + ", salaire=" + salaire + "]";
	}


}
