package com.acu.co.service.impl;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.acu.co.controller.dto.FacturaDto;
import com.acu.co.external.entity.FacturaEntity;
import com.acu.co.external.repository.IConsumoRepository;
import com.acu.co.external.repository.IFacturaRepository;
import com.acu.co.external.repository.IUsuarioRepository;
import com.acu.co.mapper.DtoToEntityMapper;

@Service
public class FacturaServiceImpl implements com.acu.co.service.IFacturaService{

	private final IFacturaRepository facturaRepository;
	private final IUsuarioRepository usuarioRepository;
	private final IConsumoRepository consumoRepository;
	
	
	private FacturaServiceImpl(IFacturaRepository facturaRepository, IUsuarioRepository usuarioRepository,
			IConsumoRepository consumoRepository) {
		super();
		this.facturaRepository = facturaRepository;
		this.usuarioRepository = usuarioRepository;
		this.consumoRepository = consumoRepository;
	}

	@Override
	public boolean saveInvoise(FacturaDto facturaDto) {
		DtoToEntityMapper mapper = new DtoToEntityMapper();
		FacturaEntity facturaEntity = mapper.facturaDtoToFacturaEntity(facturaDto);
		facturaRepository.save(facturaEntity);
		return true;
	}

	@Override
	public FacturaDto fainIvoise(Long id) {
		Optional<FacturaEntity> invoise = facturaRepository.findById(id);
		FacturaDto facturaDto = new FacturaDto();
		if (invoise.isPresent()) {
			facturaDto.setDescripcionFactura(invoise.get().getDescripcionFactura());
			facturaDto.setEstadoFactura(invoise.get().getEstadoFactura());
		}
		return facturaDto;
	}
	

}
