package com.misiontic.backend_pqrs.exceptions;

public class NameNotFoundException extends RuntimeException {
    
    public NameNotFoundException(String message){
        super(message);
    }

}
