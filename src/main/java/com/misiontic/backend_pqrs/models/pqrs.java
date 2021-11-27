package com.misiontic.backend_pqrs.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class pqrs {
    
    @Id
    private String nombre;
    private Date fecha;
    private String email;
    private String ventajas;
    private String negativo;
    private String terapias;
    private String sugerencia;


    
    
    public pqrs(String nombre, Date fecha, String email, String ventajas, String negativo, String terapias, String sugerencia ){

        this.nombre = nombre;
        this.fecha = fecha;
        this.email = email;
        this.ventajas = ventajas;
        this.negativo = negativo;
        this.terapias = terapias;
        this.sugerencia = sugerencia;
    }

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVentajas() {
		return this.ventajas;
	}

	public void setVentajas(String ventajas) {
		this.ventajas = ventajas;
	}

	public String getNegativo() {
		return this.negativo;
	}

	public void setNegativo(String negativo) {
		this.negativo = negativo;
	}

	public String getTerapias() {
		return this.terapias;
	}

	public void setTerapias(String terapias) {
		this.terapias = terapias;
	}

	public String getSugerencia() {
		return this.sugerencia;
	}

	public void setSugerencia(String sugerencia) {
		this.sugerencia = sugerencia;
	}

    




    }
	
    
    


