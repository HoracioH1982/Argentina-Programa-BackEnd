
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.NombreHabilidad;
import java.util.List;

public interface INombreHabilidadService {
    
    public List <NombreHabilidad> verNombreHabilidad();
    
    public void saveNombreHabilidad(NombreHabilidad nomhab);
    
    public void deleteNombreHabilidad(Long id);
    
    public NombreHabilidad findNombreHabilidad(Long id);

    public void editarNombreHabilidad(NombreHabilidad nomhabi);   
}
