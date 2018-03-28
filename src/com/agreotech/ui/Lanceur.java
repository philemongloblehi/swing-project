package com.agreotech.ui;

import java.util.Scanner;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 26/03/2018
 * @version 1.1
 * 
 * APPLICATION DE GESTION DE PARCELLE AGRICOLE
 * 
 * Cette application permettra:
 * 		1- l'enregistrement, la modification, la suppression et la consultation des employés
 * 		2- l'enregistrement, la modification, la suppression et la consultation des engins
 * 		3- l'enregistrement, la modification, la suppression et la consultation des parcelles
 * 		4- l'enregistrement, la modification, la suppression et la consultation des produits
 * 		5- l'enregistrement, la modification, la suppression et la consultation des récoltes
 *
 */
public class Lanceur {

	public static void main(String[] args) {
		
		
		/**
		 * Instantion de l'objet sc de la classe Scanner
		 */
		Scanner sc = new Scanner(System.in);
		
		
		/**
		 * Déclaration propriétés
		 * Entité "Employé"
		 */
		int idEmploye;
		String matriculeEmploye;
		String nomEmploye;
		String prenomEmploye;
		String fonctionEpmloye;
		String sexeEmploye;
		String contactEmploye;
		int salaireEmploye;
		
		/**
		 * Déclaration propriétés
		 * Entité "Engin"
		 */
		int idEngin;
		String immatriculationEngin;
		String marqueEngin;
		double consoEssenceJournaliereEngin;
		
		/**
		 * Déclaration propriétés
		 * Entité "Parcelle"
		 */
		int idParcelle;
		String culture;
		String observation;
		
		/**
		 * Déclaration propriétés
		 * Entité "Produit"
		 */
		int idProduit;
		String designationProduit;
		int prixProduit;
		
		/**
		 * Déclaration propriétés
		 * Entité "Rendement"
		 */
		int idRendement;
		String designationRendement;
		String anneeRendement;
		double recolteRendement;
		
		/**
		 * Propriétés des menus et boucles
		 */
		int choixMenuPrincipal;
		int choixMenuParcelle;
		int choixMenuProduit;
		int choixMenuEmploye;
		int choixMenuEngin;
		int choixMenuRendement;
		
		
		System.out.println("          *************************************");
		System.out.println("          *                                   *");
		System.out.println("          *          AGREO-TECH               *");
		System.out.println("          *                                   *");
		System.out.println("          * L'APPLICATION DE GESTION AGRICOLE *");
		System.out.println("          *                                   *");
		System.out.println("          *                                   *");
		System.out.println("          *************************************\n\n");

		
		System.out.println("                <---------| MENU |----------->\n");
		System.out.println("                       1- Parcelle");
		System.out.println("                       2- Produit");
		System.out.println("                       3- Employé");
		System.out.println("                       4- Engin");
		System.out.println("                       5- Rendement");
		System.out.println("                       6- Quitter\n");
		
		do {
			
			System.out.println("Veuillez saisir votre choix svp");
			choixMenuPrincipal = sc.nextInt();
			sc.nextLine();
			
		} while (choixMenuPrincipal != 1 && choixMenuPrincipal != 2 && choixMenuPrincipal != 3 && choixMenuPrincipal != 4 && choixMenuPrincipal != 5 && choixMenuPrincipal != 6);
		
		
		switch (choixMenuPrincipal) {
		
		case 1:
			
			do {
				
				// CODE PARCELLE...
				System.out.println("                (*******| MENU GESTION PARCELLE |********\n)");
				System.out.println("                       1- Enregistrer");
				System.out.println("                       2- Modifier");
				System.out.println("                       3- Supprimer");
				System.out.println("                       4- Afficher une parcelle");
				System.out.println("                       5- Afficher toutes les parcelles");
				System.out.println("                       6- Menu principal");
				
				System.out.println("Entrer votre sous rubrique ");
				choixMenuParcelle = sc.nextInt();
				sc.nextLine();
				
			} while (choixMenuParcelle != 1 && choixMenuParcelle != 2 && choixMenuParcelle != 3 && choixMenuParcelle != 4 && choixMenuParcelle != 5 && choixMenuParcelle != 6);
			
			break;
			
			// CODE PRODUIT...
		
		case 2:
			
			break;

		case 3:
			
			// CODE EMPLOYE...
			
			break;

		case 4:
			
			// CODE MENU ENGIN...
			
			break;

		case 5:
			
			// CODE MENU RENDEMENT...
			
			break;


		default:
			
			// CODE MENU QUITTER...
			break;
		}
		
		
		
		
		

	}

}
