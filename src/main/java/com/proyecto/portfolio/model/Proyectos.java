
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
@Table(name="proyectos")
public class Proyectos {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;    
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="inicio")
    private String inicio;
     @Column(name="fin")
    private String fin;
    @Column(name="urlRepo")
    private String urlRepo;
    @Column(name="urlSitio")
    private String urlSitio;
     @Column(name="urlImg1")
    private String urlImg1;
     @Column(name="urlImg2")
    private String urlImg2;
     @Column(name="urlImg3")
    private String urlImg3;
    
    //Mapeos Relaciones
    //Persona
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona_id; 

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String descripcion, String inicio, String fin, String urlRepo, String urlSitio, String urlImg1, String urlImg2, String urlImg3, Persona persona_id) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
        this.urlRepo = urlRepo;
        this.urlSitio = urlSitio;
        this.urlImg1 = urlImg1;
        this.urlImg2 = urlImg2;
        this.urlImg3 = urlImg3;
        this.persona_id = persona_id;
    }
    
}
