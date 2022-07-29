
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.repository.IHabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService {
    
    @Autowired
    private IHabilidadesRepository habilidades;
    
}
