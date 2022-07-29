package com.proyecto.portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="habilidades")
public class Habilidades {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    @Column(name="id")
    private Long id;
    @Column(name="imgHabilidad")
    private String imgHabilidad;
    @Column(name="nombre")
    private String nombre;
    @Column(name="aplicable")
    private String aplicable;
    @Column(name="porcentaje")
    private String porcentaje;
    @Column(name="nivel")
    private String nivel;
  
    //Mapeos Relaciones
    //Persona
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona_id; 
    //nombreHabilidad
    @ManyToOne
    private NombreHabilidad nombreHabilidad;

    public Habilidades() {
    }

    public Habilidades(Long id, String imgHabilidad, String nombre, String aplicable, String porcentaje, String nivel, Persona persona_id, NombreHabilidad nombreHabilidad) {
        this.id = id;
        this.imgHabilidad = imgHabilidad;
        this.nombre = nombre;
        this.aplicable = aplicable;
        this.porcentaje = porcentaje;
        this.nivel = nivel;
        this.persona_id = persona_id;
        this.nombreHabilidad = nombreHabilidad;
    }
    
    
}
