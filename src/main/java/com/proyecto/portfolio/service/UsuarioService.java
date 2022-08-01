
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Usuario;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.portfolio.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {
 
    @Autowired
    private UsuarioRepository user;
    
    @Override
    public List<Usuario> verUsuario() {
        return user.findAll();
    }

    @Override
    @Transactional
    public void saveUsuario(Usuario usu) {
        user.save(usu);
    }

    @Override
    @Transactional
    public void deleteUsuario(Long id) {
        user.deleteById(id);    
    }

    @Override
    public Usuario findUsuario(Long id) {
    return user.findById(id).orElse(null);    
    }

    @Override
    @Transactional
    public void editarUsuario(Usuario usua) {
    user.save(usua);    
    }

 }
