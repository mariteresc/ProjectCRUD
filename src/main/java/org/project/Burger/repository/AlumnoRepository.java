package org.project.Burger.repository;

import java.util.Optional;

import org.project.Burger.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository <Alumno, Long>{

	@Query("SELECT a FROM Alumno a WHERE a.edad < 18")
    Optional<Alumno> findMenoresDeEdad();
	
}
