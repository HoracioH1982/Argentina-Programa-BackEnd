
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.RedesSociales;
import java.util.List;

public interface IRedesSocialesService {

    public List <RedesSociales> verRedesSociales();
    
    public void saveRedesSociales(RedesSociales red);
    
    public void deleteRedesSociales(Long id);
    
    public RedesSociales findRedesSociales(Long id);

    public void editarRedesSociales(RedesSociales reds);
}
