
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.ExperienciaLaboral;
import java.util.List;

public interface IExperienciaLaboralService {

    public List <ExperienciaLaboral> verExperienciaLaboral();
    
    public void saveExperienciaLaboral(ExperienciaLaboral exp);
    
    public void deleteExperienciaLaboral(Long id);
    
    public ExperienciaLaboral findExperienciaLaboral(Long id);

    public void editarExperienciaLaboral(ExperienciaLaboral expl);

}
