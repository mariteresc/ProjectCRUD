package org.project.Burger.service;

import java.util.List;
import java.util.Optional;

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


	public Optional <Alumno> getAlumno(Long id_alumno) {
		return alumnorepository.findById(id_alumno);
	}


	public Optional<Alumno> getmenores() {
		return alumnorepository.findMenoresDeEdad();
	}


	public Alumno postalumno(Alumno alumno) {
		return alumnorepository.save(alumno);
	}


	public Alumno deleteAlumno(Long id) {
		Alumno alumnoTmp = null;
		if(alumnorepository.existsById(id)) {
			alumnoTmp=alumnorepository.findById(id).get();
			alumnorepository.deleteById(id);
		}
		return alumnoTmp;
	}


	public Alumno putAlumno(Long id_alumno, Alumno alumno) {
		Alumno alumnoTmp = null;
		if(alumnorepository.existsById(id_alumno)) {
			alumnoTmp = alumnorepository.findById(id_alumno).get();
			  if(alumno.getNombre() != null) alumnoTmp.setNombre(alumno.getNombre());
			  if(alumno.getApellido_mat() !=null) alumnoTmp.setApellido_mat(alumno.getApellido_mat());
			  if(alumno.getApellido_pat() !=null) alumnoTmp.setApellido_pat(alumno.getApellido_pat());
			  if(alumno.getEdad()!=0) alumnoTmp.setEdad(alumno.getEdad());
			  alumnorepository.save(alumnoTmp);
		}else {
			System.out.println("Este usuario no existe");
		}
		return alumnoTmp;
	}

	
}

