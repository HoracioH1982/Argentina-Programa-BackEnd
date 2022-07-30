
package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.model.RedesSociales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRedesSocialesRepository extends JpaRepository <RedesSociales, Long> {
    
}
