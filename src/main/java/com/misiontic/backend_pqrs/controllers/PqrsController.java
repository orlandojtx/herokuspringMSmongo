package com.misiontic.backend_pqrs.controllers;

import com.misiontic.backend_pqrs.models.pqrs;
import com.misiontic.backend_pqrs.repositories.PqrsRepository;

import java.util.List;

import com.misiontic.backend_pqrs.exceptions.NameNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PqrsController {
    private final PqrsRepository pqrsRepository;

    public PqrsController(PqrsRepository pqrsRepository){
        this.pqrsRepository = pqrsRepository;



    }
   
    @GetMapping("/")
    String messageRoot(){
        return "Bienvenido a PqrsMS";
    }

    @GetMapping("/nombre/{nombre}")
    pqrs getNombre(@PathVariable String nombre){
        return pqrsRepository.findById(nombre)
                .orElseThrow(()-> new NameNotFoundException("no se encontro el nombre del usuario" +
                    nombre + "solicitado.")
                );
        
    }


   


    @PostMapping("/nombre")
    pqrs newName(@RequestBody pqrs pq){
        return pqrsRepository.insert( pq );

    }
    @GetMapping("/all")
    public List<pqrs> getNombre(){
        return pqrsRepository.findAll();
    }

   @PutMapping("/update/{nombre}")
   public pqrs update(@RequestBody pqrs pq, @PathVariable String nombre){

       pqrs pqrsactual = pqrsRepository.findById(nombre).orElse(null);
       if(pq == null)
           throw new NameNotFoundException("Nombre incorrecto");
       pqrsRepository.delete(pq);
       
       pqrsactual.setNombre(pq.getNombre());
       pqrsactual.setFecha(pq.getFecha());
       pqrsactual.setEmail(pq.getEmail());
       pqrsactual.setVentajas(pq.getVentajas());
       pqrsactual.setNegativo(pq.getNegativo());
       pqrsactual.setTerapias(pq.getTerapias());
       pqrsactual.setSugerencia(pq.getSugerencia());
    

       return pqrsRepository.save(pqrsactual);

    
   }
    

    //public pqrs update(@PathVariable String nombre,@RequestBody pqrs p){
    //    return pqrsRepository.save(p);
    //}

    @DeleteMapping("/nombre/delete/{nombre}")
    String deletePqrs(@PathVariable String nombre){
        pqrs pq = pqrsRepository.findById(nombre).orElse(null);
        if(pq == null)
            throw new NameNotFoundException("Nombre incorrecto");
        pqrsRepository.delete(pq);
        return "Borrado exitoso";
    }
    
    
    
    //public void delete(@PathVariable String nombre){
    //    pqrsRepository.deleteById(nombre);
    //}
}
