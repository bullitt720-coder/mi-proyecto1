package episs.unaj.com.crudpersona2.repository;

import episs.unaj.com.crudpersona2.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}

