
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.ExperienciaLaboral;
import com.proyecto.portfolio.repository.IExperienciaLaboralRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {

    @Autowired
    private IExperienciaLaboralRepository exp;
    
    @Override    
    public List<ExperienciaLaboral> verExperienciaLaboral(){
    return exp.findAll();
    }

    @Override
    @Transactional
    public void saveExperienciaLaboral(ExperienciaLaboral expl) {
    exp.save(expl);
    }

    @Override
    @Transactional
    public void deleteExperienciaLaboral(Long id) {
    exp.deleteById(id);
    }

    @Override    
    public ExperienciaLaboral findExperienciaLaboral(Long id) {
    return exp.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void editarExperienciaLaboral(ExperienciaLaboral expla) {
        exp.save(expla);
    }
}
