
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Proyectos;
import java.util.List;

public interface IProyectosService {

    public List <Proyectos> verProyectos();
    
    public void saveProyectos(Proyectos proy);
    
    public void deleteProyectos(Long id);
    
    public Proyectos findProyectos(Long id);

    public void editarProyectos(Proyectos proye);   
    
}
