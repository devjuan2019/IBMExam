package com.ibm.examen.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.examen.model.Suma;

@Service
public class SumaRepositoryImpl implements SumaRepository {
	
	
	@Autowired
	private sumaDao suma;

	@Override
	@Transactional
	public void save(Suma s) {
		Suma sum = new Suma();
		sum.setSumando01(s.getSumando01());
		sum.setSumando02(s.getSumando02());
		sum.setResultado(s.getResultado());
		suma.save(sum);		
	}

	@Override
	public List<Suma> getSumas() {		
		return (List<Suma>) suma.findAll();
	}
	
	
	
	
	

//	@Override
//	public Suma suma(int n1, int n2) {
//		Suma sum = new Suma();
//		sum.setSumando01(n1);
//		sum.setSumando02(n2);
//		sum.setResultado(n1 + n2);
//		return sum;
//	}
}
