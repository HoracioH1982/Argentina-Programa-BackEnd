
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.repository.INombreRedSocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NombreRedSocialService {
    
    @Autowired
    private INombreRedSocialRepository nombreRed;
    
}
