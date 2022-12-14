
package com.seminario.edificios.controllers;

import com.seminario.edificios.models.Edificio;
import com.seminario.edificios.services.EdificioService;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("edificio")
public class EdificioController {
    
    private static final Logger log = Logger.getLogger("");
    
   // Dependency Injection !!
    
    @Autowired
    private EdificioService edificioService; 
   
    
    
    @RequestMapping(value = "/agregar", method = RequestMethod.POST )
    @ResponseStatus(HttpStatus.CREATED)
    public String guardarEdificio(Edificio edificio, Model model )
    {
        
       edificioService.guardarEdificio(edificio);
       log.info("Va a redirigir");
       
       
       return listarEdificios(model); 
    }
    
    
    // method = RequestMethod.PUT
   @RequestMapping(value = "/editar/{id}" )
    @ResponseStatus(HttpStatus.CREATED)
    public String editarEdificio( @PathVariable("id") Integer idEdificio, Model model )
    {
        Edificio edificio = edificioService.buscarEdificio(idEdificio); 
        
        model.addAttribute("titulo", "Editar Edificio"); 
        model.addAttribute("edificio", edificio); 
        
       edificioService.editarEdificio(edificio); 
       return "agregar"; 
    }
    
    
    
    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET )
    @ResponseStatus(HttpStatus.OK)
    public String obtenerEdificio( @PathVariable Integer id )
    {
       return null; 
    }
    
    
    @RequestMapping(value = "/listar", method = RequestMethod.GET )
    @ResponseStatus(HttpStatus.OK)
    public String  listarEdificios(Model model )
    {
       model.addAttribute("titulo", "listado de edificios"); 
       model.addAttribute("edificios", edificioService.listarEdificios()); 
        return "listar"; 
    }
    
    //, method = RequestMethod.DELETE
    @RequestMapping(value = "/eliminar/{id}" )
    @ResponseStatus(HttpStatus.OK)
    public String eliminarEdificio(@PathVariable Integer id, Model model )
    {
      edificioService.eliminarEdificio(id);
        
      return listarEdificios(model); 
    }
    
    
       @RequestMapping(value = "/agregar", method = RequestMethod.GET)
      public String Crear(Model  model) {
        Edificio edificio = new Edificio();
        model.addAttribute("edificio", edificio);
        model.addAttribute("titulo", "Creacion de edificio");

        return "agregar";
    }
    
    
    
    
}
