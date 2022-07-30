
package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.model.TipoEmpleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoEmpleoRepository extends JpaRepository <TipoEmpleo, Long> {
    
}
