package com.agreotech.dao;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette interface dénommée "IProduitDao" hérite de l'interface "IDao" et permettra
 * La déclaration des signatures des méthodes spécifique a l'entité "Produit"
 *
 */
import com.agreotech.domaine.Produit;

public interface IProduitDao extends IDao<Produit, Integer> {

}
