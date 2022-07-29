
package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.model.NombreHabilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INombreHabilidadRepository extends JpaRepository<NombreHabilidad, Long> {
    
}
