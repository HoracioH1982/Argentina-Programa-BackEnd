
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.NombreRedSocial;
import com.proyecto.portfolio.repository.INombreRedSocialRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NombreRedSocialService implements INombreRedSocialService {

    @Autowired
    private INombreRedSocialRepository nomr;
    
    @Override    
    public List<NombreRedSocial> verNombreRedSocial(){
    return nomr.findAll();
    }

    @Override
    @Transactional
    public void saveNombreRedSocial(NombreRedSocial nomrs) {
    nomr.save(nomrs);
    }

    @Override
    @Transactional
    public void deleteNombreRedSocial(Long id) {
    nomr.deleteById(id);
    }

    @Override    
    public NombreRedSocial findNombreRedSocial(Long id) {
    return nomr.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void editarNombreRedSocial(NombreRedSocial nrs) {
        nomr.save(nrs);
    }
}
