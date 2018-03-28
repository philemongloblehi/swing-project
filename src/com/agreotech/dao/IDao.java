package com.agreotech.dao;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette interface dénommée "IDao" permettra
 * La déclaration des signatures des méthodes pour
 * L'enregistrement
 * La modification
 * La suppression
 * La lecture d'un enregistrement
 * La liste de tous les enregistrements
 *
 */

import java.util.List;

public interface IDao<T, PK> {
	
	public boolean save(T t);
	public boolean update(T t);
	public boolean delete(PK id);
	public T readOne(PK id);
	public List<T> readAll();

}
