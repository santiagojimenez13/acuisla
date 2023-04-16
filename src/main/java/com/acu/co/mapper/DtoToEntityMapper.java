package com.acu.co.mapper;

import java.util.Date;

import com.acu.co.controller.dto.FacturaDto;
import com.acu.co.controller.dto.UsuarioDto;
import com.acu.co.external.entity.ConsumoEntity;
import com.acu.co.external.entity.FacturaEntity;
import com.acu.co.external.entity.RolEntity;
import com.acu.co.external.entity.UsuarioEntity;

public class DtoToEntityMapper {

    public UsuarioEntity usuarioDtoToUsuarioEntity(UsuarioDto usuarioDto) {
    	UsuarioEntity usuarioEntity = new UsuarioEntity();
    	usuarioEntity.setNombre(usuarioDto.getNombre());
    	usuarioEntity.setApellido(usuarioDto.getApellido());
    	usuarioEntity.setDireccion(usuarioDto.getDireccion());
    	usuarioEntity.setGmail(usuarioDto.getGmail());
    	usuarioEntity.setTelefono(usuarioDto.getTelefono());
    	usuarioEntity.setRolId(new RolEntity());
    	usuarioEntity.getRolId().setIdRol(usuarioDto.getTipoRol());
    	usuarioEntity.getRolId().setRol(usuarioDto.getRol());
        return usuarioEntity;
    }

    public FacturaEntity facturaDtoToFacturaEntity(FacturaDto facturaDto) {
    	FacturaEntity facturaEntity = new FacturaEntity();
    	facturaEntity.setDescripcionFactura(facturaDto.getDescripcionFactura());
    	facturaEntity.setEstadoFactura(facturaDto.getEstadoFactura());
    	facturaEntity.setFechaFactura(new Date());
    	facturaEntity.setUsuario(new UsuarioEntity());
    	facturaEntity.getUsuario().setId(facturaDto.getIdUsuario());
    	facturaEntity.setConsumo(new ConsumoEntity());
    	facturaEntity.getConsumo().setId(facturaDto.getIdConsumo());
        return facturaEntity;
     }
}