
package com.proyecto.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="tipoEmpleo")
public class TipoEmpleo {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    @Column(name="id")
    private Long id;
    @Column(name="nombre")
    private String nombre;

    public TipoEmpleo() {
    }

    public TipoEmpleo(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
