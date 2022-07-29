
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.repository.IEducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {
    
    @Autowired
    private IEducacionRepository educacion;
}
