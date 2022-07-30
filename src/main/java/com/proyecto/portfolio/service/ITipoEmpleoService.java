
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.TipoEmpleo;
import java.util.List;

public interface ITipoEmpleoService {

    public List <TipoEmpleo> verTipoEmpleo();
    
    public void saveTipoEmpleo(TipoEmpleo tipoe);
    
    public void deleteTipoEmpleo(Long id);
    
    public TipoEmpleo findTipoEmpleo(Long id);

    public void editarTipoEmpleo(TipoEmpleo tipoem);

}
