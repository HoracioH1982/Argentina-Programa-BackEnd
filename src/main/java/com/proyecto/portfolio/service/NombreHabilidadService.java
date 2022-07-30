
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.NombreHabilidad;
import com.proyecto.portfolio.repository.INombreHabilidadRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NombreHabilidadService implements INombreHabilidadService {
    
    @Autowired
    private INombreHabilidadRepository nomhabR;

    @Override    
    public List<NombreHabilidad> verNombreHabilidad(){
    return nomhabR.findAll();
    }

    @Override
    @Transactional
    public void saveNombreHabilidad(NombreHabilidad nomhab) {
    nomhabR.save(nomhab);
    }

    @Override
    @Transactional
    public void deleteNombreHabilidad(Long id) {
    nomhabR.deleteById(id);
    }

    @Override    
    public NombreHabilidad findNombreHabilidad(Long id) {
    return nomhabR.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void editarNombreHabilidad(NombreHabilidad nomhabi) {
        nomhabR.save(nomhabi);
    }    
}
