package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.model.Educacion;
import com.proyecto.portfolio.model.Persona;
import com.proyecto.portfolio.model.Usuario;
import com.proyecto.portfolio.service.EducacionService;
import com.proyecto.portfolio.service.PersonaService;
import com.proyecto.portfolio.service.UsuarioService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //Controller Persona    
    @Autowired
    private PersonaService persoS;

    @GetMapping("ver/persona")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoS.verPersonas();
    }
    
    @PostMapping("new/persona")
    public void savePersona(@RequestBody Persona perso) {
        persoS.savePersona(perso);
    }

    @DeleteMapping("borrar/persona/{id}")
    public void deletePersona(@PathVariable Long id) {
        persoS.deletePersona(id);
    }

    @GetMapping("buscar/persona/{id}")
    public Persona findPersona(@PathVariable Long id) {
        return persoS.findPersona(id);
    }

    @PutMapping("editar/persona/{id}")
    public Persona editarPersona(@PathVariable Long id,
                                 @RequestBody Persona perso){
        persoS.findPersona(id);
        persoS.editarPersona(perso);
        return perso;
    }

    //Controller Educacion    
    @Autowired
    private EducacionService educaS;

    @GetMapping("ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return educaS.verEducacion();
    }
    
    @PostMapping("new/educacion")
    public void saveEducacion(@RequestBody Educacion edu) {
        educaS.saveEducacion(edu);
    }

    @DeleteMapping("borrar/educacion/{id}")
    public void deleteEducacion(@PathVariable Long id) {
        educaS.deleteEducacion(id);
    }

    @GetMapping("buscar/educacion/{id}")
    public Educacion findEducacion(@PathVariable Long id) {
        return educaS.findEducacion(id);
    }

    @PutMapping("editar/educacion/{id}")
    public Educacion editarEducacion(@PathVariable Long id,
                                 @RequestBody Educacion educ){
        educaS.findEducacion(id);
        educaS.editarEducacion(educ);
        return educ;
    }
    
    //controller Usuario
   
    @Autowired
    private UsuarioService userS;

    @PostMapping ("new/usuario")
    public void saveUsuario(@RequestBody Usuario user){
    userS.saveUsuario(user);
    }

    @GetMapping("ver/usuario")
    @ResponseBody
    public List<Usuario> verUsuario(){
    return userS.verUsuario();
    }

    @DeleteMapping("borrar/usuario/{id}")
    public void deleteUsuario(@PathVariable Long id){
    userS.deleteUsuario(id);
    }

    @GetMapping("buscar/usuario/{id}")
    public Usuario findUsuario(@PathVariable Long id) {
        return userS.findUsuario(id);
    }

    @PutMapping("editar/usuario/{id}")
    public Usuario editarUsuario(@PathVariable Long id,
                                 @RequestBody Usuario usua){
        userS.findUsuario(id);
        userS.editarUsuario(usua);
        return usua;
    }
    /*
    
    */
}
