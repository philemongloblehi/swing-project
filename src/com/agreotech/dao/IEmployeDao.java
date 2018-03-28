package com.agreotech.dao;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette interface d�nomm�e "IEmployeDao" h�rite de l'interface "IDao" et permettra
 * La d�claration des signatures des m�thodes sp�cifique a l'entit� "Employe"
 *
 */
import com.agreotech.domaine.Employe;

public interface IEmployeDao extends IDao<Employe, Integer> {

}
