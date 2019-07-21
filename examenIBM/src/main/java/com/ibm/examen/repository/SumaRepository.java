package com.ibm.examen.repository;

import java.util.List;

import com.ibm.examen.model.Suma;

public interface SumaRepository{

	public void save(Suma s);
	
	public List<Suma> getSumas();
	
}
