package episs.unaj.com.crudpersona2.service.impl;

import episs.unaj.com.crudpersona2.entity.Persona;
import episs.unaj.com.crudpersona2.repository.PersonaRepository;
import episs.unaj.com.crudpersona2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Persona> obtenerTodasLasPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona obtenerPersonaPorId(Long id) {
        return personaRepository.getReferenceById(id);
    }

    @Override
    public Persona actualizarPersona(Persona persona) {
        Long id = persona.getId();
        persona.setId(id);
        return personaRepository.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);

    }
}
