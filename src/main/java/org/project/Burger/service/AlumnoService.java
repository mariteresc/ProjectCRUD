package org.project.Burger.service;

import java.util.List;

import org.project.Burger.model.Alumno;
import org.project.Burger.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {
	
	private final AlumnoRepository alumnorepository;
	
    @Autowired
	public AlumnoService(AlumnoRepository alumnorepository) {
		this.alumnorepository = alumnorepository;
	}


	public List<Alumno> getallalumnos() {
		
		return alumnorepository.findAll();
	}

}

