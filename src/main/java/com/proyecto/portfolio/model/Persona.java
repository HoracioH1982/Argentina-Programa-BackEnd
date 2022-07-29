package com.proyecto.portfolio.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="id")
    private Long id;
    @Column(name="nombres")
    private String nombres;
    @Column(name="apellido")
    private String apellido;
    @Column(name="domicilio")
    private String domicilio;
    @Temporal(TemporalType.DATE)
    @Column(name="fechaNac")
    private Date fechaNac;
    @Column(name="telefono")
    private String telefono;
    @Column(name="email")
    private String email;
    @Column(name="nacionalidad")
    private String nacionalidad;
    @Column(name="sobreMi")
    private String sobreMi;
    @Column(name="urlBackground")
    private String urlBackground;
    @Column(name="urlFoto")
    private String urlFoto;    
 
    //Mapeos Relaciones
    //Redes Sociales
    @OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<RedesSociales> Redes;    

    //Experiencia Laboral
    @OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<ExperienciaLaboral> experienciaLaboralexperiencia;
    
    //Educacion
    @OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Educacion> educacion;
  
    //Habilidades
    @OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Habilidades> habilidades;

    //Proyectos
    @OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch=FetchType.LAZY)
    @JsonManagedReference
    private List<Proyectos> proyectos;    

    public Persona() {
    }

    public Persona(Long id, String nombres, String apellido, String domicilio, Date fechaNac, String telefono, String email, String nacionalidad, String sobreMi, String urlBackground, String urlFoto, List<RedesSociales> Redes, List<ExperienciaLaboral> experienciaLaboralexperiencia, List<Educacion> educacion, List<Habilidades> habilidades, List<Proyectos> proyectos) {
        this.id = id;
        this.nombres = nombres;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.sobreMi = sobreMi;
        this.urlBackground = urlBackground;
        this.urlFoto = urlFoto;
        this.Redes = Redes;
        this.experienciaLaboralexperiencia = experienciaLaboralexperiencia;
        this.educacion = educacion;
        this.habilidades = habilidades;
        this.proyectos = proyectos;
    }    
    
}