package com.misiontic.backend_pqrs.repositories;

import com.misiontic.backend_pqrs.models.pqrs;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface PqrsRepository extends MongoRepository <pqrs, String> {

 
    
}
