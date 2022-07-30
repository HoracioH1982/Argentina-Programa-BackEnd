
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List <Persona> verPersonas();
    
    public void savePersona(Persona perso);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);

    public void editarPersona(Persona per);
    
}
