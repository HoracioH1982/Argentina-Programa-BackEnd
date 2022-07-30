
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Habilidades;
import java.util.List;

public interface IHabilidadesService {

    public List <Habilidades> verHabilidades();
    
    public void saveHabilidades(Habilidades hab);
    
    public void deleteHabilidades(Long id);
    
    public Habilidades findHabilidades(Long id);

    public void editarHabilidades(Habilidades habi);

    
}
