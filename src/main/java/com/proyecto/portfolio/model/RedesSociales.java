
package com.proyecto.portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="redesSociales")
public class RedesSociales {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;
    @Column(name="urlImg")
    private String urlImg;
    @Column(name="urlRed")
    private String urlRed;
    
    //Mapeo Relaciones
    //Persona
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona_id; 
    //nombreRed      
    @ManyToOne
    private NombreRedSocial nombreRedSocial;

    public RedesSociales() {
    }

    public RedesSociales(Long id, String urlImg, String urlRed, Persona persona_id, NombreRedSocial nombreRedSocial) {
        this.id = id;
        this.urlImg = urlImg;
        this.urlRed = urlRed;
        this.persona_id = persona_id;
        this.nombreRedSocial = nombreRedSocial;
    }
    
    
}
