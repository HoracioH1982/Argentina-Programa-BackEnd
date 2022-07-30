
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Persona;
import com.proyecto.portfolio.repository.PersonaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository perso;
    
    @Override    
    public List<Persona> verPersonas(){
    return perso.findAll();
    }

    @Override
    @Transactional
    public void savePersona(Persona per) {
    perso.save(per);
    }

    @Override
    @Transactional
    public void deletePersona(Long id) {
    perso.deleteById(id);
    }

    @Override    
    public Persona findPersona(Long id) {
    return perso.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void editarPersona(Persona p) {
        perso.save(p);
    }
    
    
}
