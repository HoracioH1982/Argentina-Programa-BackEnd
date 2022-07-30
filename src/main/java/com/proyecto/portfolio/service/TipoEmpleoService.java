
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.TipoEmpleo;
import com.proyecto.portfolio.repository.ITipoEmpleoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleoService implements ITipoEmpleoService {

    @Autowired
    private ITipoEmpleoRepository tipoe;
    
    @Override    
    public List<TipoEmpleo> verTipoEmpleo(){
    return tipoe.findAll();
    }

    @Override
    @Transactional
    public void saveTipoEmpleo(TipoEmpleo tipoem) {
    tipoe.save(tipoem);
    }

    @Override
    @Transactional
    public void deleteTipoEmpleo(Long id) {
    tipoe.deleteById(id);
    }

    @Override    
    public TipoEmpleo findTipoEmpleo(Long id) {
    return tipoe.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void editarTipoEmpleo(TipoEmpleo tipoemp) {
        tipoe.save(tipoemp);
    }
}
