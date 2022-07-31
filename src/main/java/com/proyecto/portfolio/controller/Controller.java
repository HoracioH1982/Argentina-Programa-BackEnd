package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.model.Educacion;
import com.proyecto.portfolio.model.ExperienciaLaboral;
import com.proyecto.portfolio.model.Habilidades;
import com.proyecto.portfolio.model.NombreHabilidad;
import com.proyecto.portfolio.model.NombreRedSocial;
import com.proyecto.portfolio.model.Persona;
import com.proyecto.portfolio.model.Proyectos;
import com.proyecto.portfolio.model.RedesSociales;
import com.proyecto.portfolio.model.TipoEmpleo;
import com.proyecto.portfolio.model.Usuario;
import com.proyecto.portfolio.service.EducacionService;
import com.proyecto.portfolio.service.ExperienciaLaboralService;
import com.proyecto.portfolio.service.HabilidadesService;
import com.proyecto.portfolio.service.NombreHabilidadService;
import com.proyecto.portfolio.service.NombreRedSocialService;
import com.proyecto.portfolio.service.PersonaService;
import com.proyecto.portfolio.service.ProyectosService;
import com.proyecto.portfolio.service.RedesSocialesService;
import com.proyecto.portfolio.service.TipoEmpleoService;
import com.proyecto.portfolio.service.UsuarioService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datos/")
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

    //Controller Habilidades    
    @Autowired
    private HabilidadesService habiS;

    @GetMapping("ver/habilidades")
    @ResponseBody
    public List<Habilidades> verHabilidades() {
        return habiS.verHabilidades();
    }
    
    @PostMapping("new/habilidad")
    public void saveHabilidades(@RequestBody Habilidades hab) {
        habiS.saveHabilidades(hab);
    }

    @DeleteMapping("borrar/habilidad/{id}")
    public void deleteHabilidades(@PathVariable Long id) {
        habiS.deleteHabilidades(id);
    }

    @GetMapping("buscar/habilidad/{id}")
    public Habilidades findHabilidades(@PathVariable Long id) {
        return habiS.findHabilidades(id);
    }

    @PutMapping("editar/habilidad/{id}")
    public Habilidades editarHabilidades(@PathVariable Long id,
                                 @RequestBody Habilidades habil){
        habiS.findHabilidades(id);
        habiS.editarHabilidades(habil);
        return habil;
    }

    //Controller NombreHabilidad    
    @Autowired
    private NombreHabilidadService nhabS;

    @GetMapping("ver/nombrehab")
    @ResponseBody
    public List<NombreHabilidad> verNombreHabilidad() {
        return nhabS.verNombreHabilidad();
    }
    
    @PostMapping("new/nombrehab")
    public void saveNombreHabilidad(@RequestBody NombreHabilidad nhab) {
        nhabS.saveNombreHabilidad(nhab);
    }

    @DeleteMapping("borrar/nombrehab/{id}")
    public void deleteNombreHabilidad(@PathVariable Long id) {
        nhabS.deleteNombreHabilidad(id);
    }

    @GetMapping("buscar/nombrehab/{id}")
    public NombreHabilidad findNombreHabilidad(@PathVariable Long id) {
        return nhabS.findNombreHabilidad(id);
    }

    @PutMapping("editar/nombrehab/{id}")
    public NombreHabilidad editarNombreHabilidad(@PathVariable Long id,
                                 @RequestBody NombreHabilidad nhabi){
        nhabS.findNombreHabilidad(id);
        nhabS.editarNombreHabilidad(nhabi);
        return nhabi;
    } 

    //Controller Proyectos    
    @Autowired
    private ProyectosService proyS;

    @GetMapping("ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proyS.verProyectos();
    }
    
    @PostMapping("new/proyecto")
    public void saveProyectos(@RequestBody Proyectos proy) {
        proyS.saveProyectos(proy);
    }

    @DeleteMapping("borrar/proyectos/{id}")
    public void deleteProyectos(@PathVariable Long id) {
        proyS.deleteProyectos(id);
    }

    @GetMapping("buscar/proyectos/{id}")
    public Proyectos findProyectos(@PathVariable Long id) {
        return proyS.findProyectos(id);
    }

    @PutMapping("editar/proyectos/{id}")
    public Proyectos editarProyectos(@PathVariable Long id,
                                 @RequestBody Proyectos proye){
        proyS.findProyectos(id);
        proyS.editarProyectos(proye);
        return proye;
    }

    //Controller Redes Sociales    
    @Autowired
    private RedesSocialesService redS;

    @GetMapping("ver/redes")
    @ResponseBody
    public List<RedesSociales> verRedesSociales() {
        return redS.verRedesSociales();
    }
    
    @PostMapping("new/red")
    public void saveRedesSociales(@RequestBody RedesSociales reds) {
        redS.saveRedesSociales(reds);
    }

    @DeleteMapping("borrar/red/{id}")
    public void deleteRedesSociales(@PathVariable Long id) {
        redS.deleteRedesSociales(id);
    }

    @GetMapping("buscar/red/{id}")
    public RedesSociales findRedesSociales(@PathVariable Long id) {
        return redS.findRedesSociales(id);
    }

    @PutMapping("editar/red/{id}")
    public RedesSociales editarRedesSociales(@PathVariable Long id,
                                 @RequestBody RedesSociales redso){
        redS.findRedesSociales(id);
        redS.editarRedesSociales(redso);
        return redso;
    }

    //Controller NombreRedSocial   
    @Autowired
    private NombreRedSocialService nredS;

    @GetMapping("ver/nombrered")
    @ResponseBody
    public List<NombreRedSocial> verNombreRedSocial() {
        return nredS.verNombreRedSocial();
    }
    
    @PostMapping("new/nombrered")
    public void saveNombreRedSocial(@RequestBody NombreRedSocial nrs) {
        nredS.saveNombreRedSocial(nrs);
    }

    @DeleteMapping("borrar/nombrered/{id}")
    public void deleteNombreRedSocial(@PathVariable Long id) {
       nredS.deleteNombreRedSocial(id);
    }

    @GetMapping("buscar/nombrered/{id}")
    public NombreRedSocial findNombreRedSocial(@PathVariable Long id) {
        return nredS.findNombreRedSocial(id);
    }

    @PutMapping("editar/nombrered/{id}")
    public NombreRedSocial editarNombreRedSocial(@PathVariable Long id,
                                 @RequestBody NombreRedSocial redso){
        nredS.findNombreRedSocial(id);
        nredS.editarNombreRedSocial(redso);
        return redso;
    }

    //Controller ExperienciaLaboral   
    @Autowired
    private ExperienciaLaboralService expS;

    @GetMapping("ver/experiencia")
    @ResponseBody
    public List<ExperienciaLaboral> verExperienciaLaboral() {
        return expS.verExperienciaLaboral();
    }
    
    @PostMapping("new/experiencia")
    public void saveExperienciaLaboral(@RequestBody ExperienciaLaboral exp) {
        expS.saveExperienciaLaboral(exp);
    }

    @DeleteMapping("borrar/experiencia/{id}")
    public void deleteExperienciaLaboral(@PathVariable Long id) {
        expS.deleteExperienciaLaboral(id);
    }

    @GetMapping("buscar/experiencia/{id}")
    public ExperienciaLaboral findExperienciaLaboral(@PathVariable Long id) {
        return expS.findExperienciaLaboral(id);
    }

    @PutMapping("editar/experiencia/{id}")
    public ExperienciaLaboral editarExperienciaLaboral(@PathVariable Long id,
                                 @RequestBody ExperienciaLaboral expl){
        expS.findExperienciaLaboral(id);
        expS.editarExperienciaLaboral(expl);
        return expl;
    }

    //Controller TipoEmpleo    
    @Autowired
    private TipoEmpleoService tipoeS;

    @GetMapping("ver/tipoempleo")
    @ResponseBody
    public List<TipoEmpleo> verTipoEmpleo() {
        return tipoeS.verTipoEmpleo();
    }
    
    @PostMapping("new/tipoempleo")
    public void saveTipoEmpleo(@RequestBody TipoEmpleo tipo) {
        tipoeS.saveTipoEmpleo(tipo);
    }

    @DeleteMapping("borrar/tipoempleo/{id}")
    public void deleteTipoEmpleo(@PathVariable Long id) {
        tipoeS.deleteTipoEmpleo(id);
    }

    @GetMapping("buscar/tipoempleo/{id}")
    public TipoEmpleo findTipoEmpleo(@PathVariable Long id) {
        return tipoeS.findTipoEmpleo(id);
    }

    @PutMapping("editar/tipoempleo/{id}")
    public TipoEmpleo editarTipoEmpleo(@PathVariable Long id,
                                 @RequestBody TipoEmpleo tipoe){
        tipoeS.findTipoEmpleo(id);
        tipoeS.editarTipoEmpleo(tipoe);
        return tipoe;
    }
}
