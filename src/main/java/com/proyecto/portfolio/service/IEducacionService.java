
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List <Educacion> verEducacion();
    
    public void saveEducacion(Educacion edu);
    
    public void deleteEducacion(Long id);
    
    public Educacion findEducacion(Long id);

    public void editarEducacion(Educacion educ);
}
