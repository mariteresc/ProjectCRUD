package org.project.Burger.controller;

import java.util.List;
import java.util.Optional;

import org.project.Burger.model.Alumno;
import org.project.Burger.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(path = "{id_alumno}")
    public Optional <Alumno> getAlumno(@PathVariable("id_alumno") Long id_alumno) {
        return alumnoService.getAlumno(id_alumno);
    }
	
	@GetMapping(path = "/vermenores/")
    public Optional <Alumno> getAlumno() {
        return alumnoService.getmenores();
    }
	
	@PostMapping
	public Alumno postalumno(@RequestBody Alumno alumno){
		return alumnoService.postalumno(alumno);
	}
	
	@DeleteMapping(path = "{id_alumno}")
    public Alumno deleteAlumno(@PathVariable("id_alumno") Long id_alumno) {
        return alumnoService.deleteAlumno(id_alumno);
    }
	
	@PutMapping(path = "{id_alumno}")
    public Alumno putAlumno(@PathVariable("id_alumno") Long id_alumno,@RequestBody Alumno alumno) {
        return alumnoService.putAlumno(id_alumno, alumno);
    }
	
	

}
