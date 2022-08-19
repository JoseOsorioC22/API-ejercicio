
package com.seminario.edificios.services;


import com.seminario.edificios.models.Edificio;
import com.seminario.edificios.repositories.EdificioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EdificioService")
public class EdificioService {
    
    
    // Dependency Injection !! 
    
    @Autowired
    private EdificioRepository edificioRepository; 
    
    
   
   
    // Este metodo guarda un edificio
    public Edificio guardarEdificio(Edificio edificio)
    {
       return edificioRepository.save(edificio);
    }
    
    // Este metodo edita un edificio
    public Edificio editarEdificio(Edificio edificio)
    {
        Edificio edificioAEditar = edificioRepository.findById(edificio.getIdEdificio()).get(); 
        
        edificioAEditar.setClave(edificio.getClave());
        edificioAEditar.setNombre(edificio.getNombre());
        edificioAEditar.setMetrosCuadrados(edificio.getMetrosCuadrados());
        edificioAEditar.setAltura(edificio.getAltura());
        edificioAEditar.setNumeroPisos(edificio.getNumeroPisos());
        edificioAEditar.setNumeroApartamentos(edificio.getNumeroApartamentos());
        edificioAEditar.setNumeroOficinas(edificio.getNumeroOficinas());
        edificioAEditar.setNombreParqueadero(edificio.getNombreParqueadero());
        edificioAEditar.setNumeroPiscinas(edificio.getNumeroPiscinas());
        edificioAEditar.setPais(edificio.getPais());
        edificioAEditar.setDepartamento(edificio.getDepartamento());
        edificioAEditar.setCiudad(edificio.getCiudad());
        edificioAEditar.setTieneAsensor(edificio.getTieneAsensor());
        edificioAEditar.setValorAdministracion(edificio.getValorAdministracion());
        edificioAEditar.setTieneZonaSocial(edificio.getTieneZonaSocial());
        
      
        return   edificioRepository.save(edificioAEditar); 
    }
    
    // Este metodo nos busca un edificio; 
    
    public Edificio buscarEdificio(Integer id)
    {
        return edificioRepository.findById(id).get(); 
    }
    
    
    // Listar Edificios
    
    public List<Edificio> listarEdificios()
    {
        return edificioRepository.findAll(); 
    }
    
    // Eliminar edificio
    
    public String eliminarEdificio(Integer id)
    {
        
        edificioRepository.deleteById(id);
        return "OK"; 
    }
    
    
    
}
