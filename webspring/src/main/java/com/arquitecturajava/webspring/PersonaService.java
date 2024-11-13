package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
	@Autowired
	private PersonaRepository repository;

	public void add(Persona persona) {
		repository.add(persona);
	}

	public List<Persona> buscarTodos() {
		return repository.buscarTodos();
	}
		
	
}
