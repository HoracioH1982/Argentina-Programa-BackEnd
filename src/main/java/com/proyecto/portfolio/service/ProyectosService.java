
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Proyectos;
import com.proyecto.portfolio.repository.IProyectosRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    private IProyectosRepository proyectosR;
    
    @Override    
    public List<Proyectos> verProyectos(){
    return proyectosR.findAll();
    }

    @Override
    @Transactional
    public void saveProyectos(Proyectos proy) {
    proyectosR.save(proy);
    }

    @Override
    @Transactional
    public void deleteProyectos(Long id) {
    proyectosR.deleteById(id);
    }

    @Override    
    public Proyectos findProyectos(Long id) {
    return proyectosR.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void editarProyectos(Proyectos proye) {
        proyectosR.save(proye);
    }
}