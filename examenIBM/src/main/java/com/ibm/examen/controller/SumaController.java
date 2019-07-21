package com.ibm.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.examen.model.Suma;
import com.ibm.examen.repository.SumaRepository;
import com.ibm.examen.repository.SumaRepositoryImpl;



@RestController
@RequestMapping("/operaciones")
public class SumaController {

	@Autowired
	private SumaRepository repository;
	
	@PostMapping(value="/sumar/{n1}/{n2}")
	public List<Suma> getSuma(@PathVariable("n1") int n1, @PathVariable("n2") int n2 ) {
		
		Suma s = new Suma();
		s.setSumando01(n1);
		s.setSumando02(n2);
		s.setResultado(n1+n2);		
		repository.save(s);
		return repository.getSumas();		
	}
		
	
//	@GetMapping(value="/Sumas")
//	public Iterable<Suma> getAll() {
//		return sumImp.findAll();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

