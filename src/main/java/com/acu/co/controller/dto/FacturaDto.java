package com.acu.co.controller.dto;

public class FacturaDto {
	    private String descripcionFactura;
	    private String estadoFactura;
	    private Long idUsuario;
	    private Long idConsumo;

	    public String getDescripcionFactura() {
	        return descripcionFactura;
	    }

	    public void setDescripcionFactura(String descripcionFactura) {
	        this.descripcionFactura = descripcionFactura;
	    }

	    public String getEstadoFactura() {
	        return estadoFactura;
	    }

	    public void setEstadoFactura(String estadoFactura) {
	        this.estadoFactura = estadoFactura;
	    }

	    public Long getIdUsuario() {
	        return idUsuario;
	    }

	    public void setIdUsuario(Long idUsuario) {
	        this.idUsuario = idUsuario;
	    }

	    public Long getIdConsumo() {
	        return idConsumo;
	    }

	    public void setIdConsumo(Long idConsumo) {
	        this.idConsumo = idConsumo;
	    }
}
