
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.RedesSociales;
import com.proyecto.portfolio.repository.IRedesSocialesRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedesSocialesService implements IRedesSocialesService {

    @Autowired
    private IRedesSocialesRepository redes;
    
    @Override    
    public List<RedesSociales> verRedesSociales(){
    return redes.findAll();
    }

    @Override
    @Transactional
    public void saveRedesSociales(RedesSociales red) {
    redes.save(red);
    }

    @Override
    @Transactional
    public void deleteRedesSociales(Long id) {
    redes.deleteById(id);
    }

    @Override    
    public RedesSociales findRedesSociales(Long id) {
    return redes.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void editarRedesSociales(RedesSociales reds) {
        redes.save(reds);
    }
}
