
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.repository.INombreHabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NombreHabilidadService {
    
    @Autowired
    private INombreHabilidadRepository nombreHabilidad;
    
}
