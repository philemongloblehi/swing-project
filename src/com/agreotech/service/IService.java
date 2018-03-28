package com.agreotech.service;

import java.util.List;

public interface IService<T, PK> {
	
	public boolean ajouter(T t);
	public boolean modifier(T t);
	public boolean supprimer(PK pk);
	public T lireUn(PK pk);
	public List<T> liretout();

}
