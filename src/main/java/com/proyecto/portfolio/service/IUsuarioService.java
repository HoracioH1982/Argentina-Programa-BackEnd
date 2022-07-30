
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Usuario;
import java.util.List;

public interface IUsuarioService {

     public List <Usuario> verUsuario();
    
     public void saveUsuario(Usuario user);
    
     public void deleteUsuario(Long id);
    
     public Usuario findUsuario(Long id);

     public void editarUsuario(Usuario usuario);   
    
}
