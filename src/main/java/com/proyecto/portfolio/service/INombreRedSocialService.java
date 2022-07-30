
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.NombreRedSocial;
import java.util.List;

public interface INombreRedSocialService {

    public List <NombreRedSocial> verNombreRedSocial();
    
    public void saveNombreRedSocial(NombreRedSocial nomred);
    
    public void deleteNombreRedSocial(Long id);
    
    public NombreRedSocial findNombreRedSocial(Long id);

    public void editarNombreRedSocial(NombreRedSocial nomreds);
    
}
