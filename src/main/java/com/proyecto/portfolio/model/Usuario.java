
package com.proyecto.portfolio.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    @Column(name="id")
    private Long id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="deviceInfo")
    private String deviceInfo;
    @Column(name="deviceType")
    private String deviceType;
    @Column(name="notificationToken")
    private String notificationToken;
    
    //Mapeo Relaciones
    //Persona
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="persona_id")
    private Persona persona_id;

    public Usuario() {
    }

    public Usuario(Long id, String email, String password, String deviceInfo, String deviceType, String notificationToken, Persona persona_id) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.deviceInfo = deviceInfo;
        this.deviceType = deviceType;
        this.notificationToken = notificationToken;
        this.persona_id = persona_id;
    }

    
    
}
