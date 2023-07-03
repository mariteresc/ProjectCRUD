package org.project.Burger.controller;

import java.util.List;

import org.project.Burger.model.Alumno;
import org.project.Burger.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/alumno/")
public class AlumnoController {
	private final AlumnoService alumnoService;

	@Autowired
	public AlumnoController(AlumnoService alumnoService) {
		this.alumnoService = alumnoService;
	}
	
	@GetMapping
	public List<Alumno>getallalumnos(){
		return alumnoService.getallalumnos();
	}

}
