
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
@Table(name="experienciaLaboral")
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    @Column(name="id")
    private Long id;    
    @Column(name="empresa")
    private String empresa;        
    @Column(name="logoImg")
    private String logoImg;            
    @Column(name="funcion")
    private String funcion;                
    @Column(name="descripcion")
    private String descripcion;                    
    @Column(name="esTrabajoActual")
    private Boolean esTrabajoActual;
    @Column(name="url")
    private String url;
    @Column(name="inicio")
    private String inicio;
    @Column(name="fin")
    private String fin;
    
   //Mapeos Relaciones
    //Persona
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona_id; 
    //tipoEmpleo      
    @ManyToOne
    private TipoEmpleo tipoEmpleo;  

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String empresa, String logoImg, String funcion, String descripcion, Boolean esTrabajoActual, String url, String inicio, String fin, Persona persona_id, TipoEmpleo tipoEmpleo) {
        this.id = id;
        this.empresa = empresa;
        this.logoImg = logoImg;
        this.funcion = funcion;
        this.descripcion = descripcion;
        this.esTrabajoActual = esTrabajoActual;
        this.url = url;
        this.inicio = inicio;
        this.fin = fin;
        this.persona_id = persona_id;
        this.tipoEmpleo = tipoEmpleo;
    }
}
