
package com.seminario.edificios.repositories;

import com.seminario.edificios.models.Edificio; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer> {

  
    
}
