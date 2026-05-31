package episs.unaj.com.crudpersona2.service;

import episs.unaj.com.crudpersona2.entity.Persona;

import java.util.List;

public interface PersonaService {
    public List<Persona> obtenerTodasLasPersonas();
    public Persona guardarPersona(Persona persona);
    public Persona obtenerPersonaPorId(Long id);
    public Persona actualizarPersona(Persona persona);
    public void eliminarPersona(Long id);
}
