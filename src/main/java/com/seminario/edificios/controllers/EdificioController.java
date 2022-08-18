
package com.seminario.edificios.controllers;

import com.seminario.edificios.models.Edificio;
import com.seminario.edificios.services.EdificioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/edificio") // 
public class EdificioController {
    
   // Dependency Injection !!
    
    @Autowired
    private EdificioService edificioService; 
   
    
    
    @RequestMapping(value = "/guardar", method = RequestMethod.POST )
    @ResponseStatus(HttpStatus.CREATED)
    public Edificio guardarEdificio( @RequestBody Edificio edificio)
    {
       return edificioService.guardarEdificio(edificio); 
    }
    
    
    
   @RequestMapping(value = "/editar", method = RequestMethod.PUT )
    @ResponseStatus(HttpStatus.CREATED)
    public Edificio editarEdificio( @RequestBody Edificio edificio)
    {
       return edificioService.editarEdificio(edificio); 
    }
    
    
    
    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET )
    @ResponseStatus(HttpStatus.OK)
    public Edificio obtenerEdificio( @PathVariable Integer id )
    {
       return edificioService.buscarEdificio(id); 
    }
    
    
    @RequestMapping(value = "/listar", method = RequestMethod.GET )
    @ResponseStatus(HttpStatus.OK)
    public List<Edificio> listarEdificios()
    {
       return edificioService.listarEdificios(); 
    }
    
    
    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE )
    @ResponseStatus(HttpStatus.OK)
    public String eliminarEdificio(@PathVariable Integer id)
    {
       return edificioService.eliminarEdificio(id);
    }
    
    
    
    
}
