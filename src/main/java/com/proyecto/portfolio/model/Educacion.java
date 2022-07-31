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
@Table(name="educacion")
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;
    @Column(name="carrera")
    private String carrera;
    @Column(name="estado")
    private String estado;
    @Column(name="urlLogoInstitucion")
    private String urlLogoInstitucion;
    @Column(name="nombreInstitucion")
    private String nombreInstitucion;
    @Column(name="promedio")
    private String promedio;
    @Column(name="titulo")
    private String titulo;
    @Column(name="urlInstitucion")
    private String urlInstitucion;
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

    public Educacion() {
    }

    public Educacion(Long id, String carrera, String estado, String urlLogoInstitucion, String nombreInstitucion, String promedio, String titulo, String urlInstitucion, String inicio, String fin, Persona persona_id) {
        this.id = id;
        this.carrera = carrera;
        this.estado = estado;
        this.urlLogoInstitucion = urlLogoInstitucion;
        this.nombreInstitucion = nombreInstitucion;
        this.promedio = promedio;
        this.titulo = titulo;
        this.urlInstitucion = urlInstitucion;
        this.inicio = inicio;
        this.fin = fin;
        this.persona_id = persona_id;
    }   
}