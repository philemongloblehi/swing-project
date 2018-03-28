package com.agreotech.dao;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette interface dénommée "IEmployeDao" hérite de l'interface "IDao" et permettra
 * La déclaration des signatures des méthodes spécifique a l'entité "Employe"
 *
 */
import com.agreotech.domaine.Employe;

public interface IEmployeDao extends IDao<Employe, Integer> {

}
