
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Habilidades;
import com.proyecto.portfolio.repository.IHabilidadesRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService {
    
    @Autowired
    private IHabilidadesRepository habilidades;

     @Override
    public List<Habilidades> verHabilidades() {
        return habilidades.findAll();
    }

    @Override
    @Transactional
    public void saveHabilidades(Habilidades hab) {
        habilidades.save(hab);
    }

    @Override
    @Transactional
    public void deleteHabilidades(Long id) {
    habilidades.deleteById(id);    
    }

    @Override
    public Habilidades findHabilidades(Long id) {
    return habilidades.findById(id).orElse(null);    
    }

    @Override
    @Transactional
    public void editarHabilidades(Habilidades habi) {
    habilidades.save(habi);    
    }

}
