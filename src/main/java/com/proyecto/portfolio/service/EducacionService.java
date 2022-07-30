
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Educacion;
import com.proyecto.portfolio.repository.IEducacionRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
  
    @Autowired
    private IEducacionRepository educacion;
     
    @Override
    public List<Educacion> verEducacion() {
        return educacion.findAll();
    }

    @Override
    @Transactional
    public void saveEducacion(Educacion edu) {
        educacion.save(edu);
    }

    @Override
    @Transactional
    public void deleteEducacion(Long id) {
    educacion.deleteById(id);    
    }

    @Override
    public Educacion findEducacion(Long id) {
    return educacion.findById(id).orElse(null);    
    }

    @Override
    @Transactional
    public void editarEducacion(Educacion educ) {
    educacion.save(educ);    
    }
}
