package com.acu.co.controller.dto;

public class ConsumoDto {
	    private double consumo;
	    private String descripcion;
	    private Integer numeroCasa;

	    public double getConsumo() {
	        return consumo;
	    }

	    public void setConsumo(double consumo) {
	        this.consumo = consumo;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public Integer getNumeroCasa() {
	        return numeroCasa;
	    }

	    public void setNumeroCasa(Integer numeroCasa) {
	        this.numeroCasa = numeroCasa;
	    }
}
