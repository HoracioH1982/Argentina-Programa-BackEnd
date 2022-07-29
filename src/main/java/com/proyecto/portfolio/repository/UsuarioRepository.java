
package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    //Usuario findByEmail(String email);
    //Usuario findByEmailAndContrasenia(String email, Long password);
    
    
}
