
package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.model.NombreRedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INombreRedSocialRepository extends JpaRepository <NombreRedSocial, Long> {
    
}
