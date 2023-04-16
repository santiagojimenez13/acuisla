package com.acu.co.external.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Builder;

@Builder
@Entity
@Table(name = "factura")
public class FacturaEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date fechaFactura;

	    @Column(nullable = false)
	    private String descripcionFactura;

	    @Column(nullable = false)
	    private String estadoFactura;

	    @PrePersist
	    public void prepersist() {
	        fechaFactura = new Date();
	    }

	    @ManyToOne
	    @JoinColumn(name = "usuario_id", nullable = false)
	    private UsuarioEntity usuario;

	    @ManyToOne(cascade = CascadeType.MERGE)
	    @JoinColumn(name = "consumo_id", referencedColumnName = "id")
	    private ConsumoEntity consumo;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Date getFechaFactura() {
	        return fechaFactura;
	    }

	    public void setFechaFactura(Date fechaFactura) {
	        this.fechaFactura = fechaFactura;
	    }

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

	    public UsuarioEntity getUsuario() {
	        return usuario;
	    }

	    public void setUsuario(UsuarioEntity usuario) {
	        this.usuario = usuario;
	    }

	    public ConsumoEntity getConsumo() {
	        return consumo;
	    }

	    public void setConsumo(ConsumoEntity consumo) {
	        this.consumo = consumo;
	    }
}
