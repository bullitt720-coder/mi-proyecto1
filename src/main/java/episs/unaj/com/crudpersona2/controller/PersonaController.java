package episs.unaj.com.crudpersona2.controller;

import episs.unaj.com.crudpersona2.entity.Persona;
import episs.unaj.com.crudpersona2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    @GetMapping
    public List<Persona> listarPersonas() {
        return personaService.obtenerTodasLasPersonas() ;
    }
    @GetMapping("/{id}")
    public Persona obtenerPorId(@PathVariable Long id){
        return personaService.obtenerPersonaPorId(id);
    }
    @PostMapping
    public Persona guardarPersona(@RequestBody Persona persona) {
        return personaService.guardarPersona(persona);
    }
    @PutMapping("/{id}")
    public Persona actualizarPersona(@PathVariable Long id, @RequestBody Persona persona) {
        return personaService.obtenerPersonaPorId(id);
    }
    @DeleteMapping("/{id}")
    public String eliminarPersona(@PathVariable Long id) {
        personaService.eliminarPersona(id);
        return "Persona eliminada con id: " ;
    }
}
