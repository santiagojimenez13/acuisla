package com.acu.co.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.acu.co.controller.dto.ConsumoDto;
import com.acu.co.external.entity.ConsumoEntity;
import com.acu.co.external.repository.IConsumoRepository;
import com.acu.co.external.repository.IFacturaRepository;
import com.acu.co.service.IConsumoService;

@Service
public class ConsumoServiceImpl implements IConsumoService {
	
	private final IConsumoRepository consumoRepository;
	private final IFacturaRepository facturaRepository;
	
	

	private ConsumoServiceImpl(IConsumoRepository consumoRepository, IFacturaRepository facturaRepository) {
		super();
		this.consumoRepository = consumoRepository;
		this.facturaRepository = facturaRepository;
	}

	@Override
	public boolean saveConsumo(ConsumoDto consumoDto) {
		ConsumoEntity consumoEntity = new ConsumoEntity();
		consumoEntity.setConsumo(consumoDto.getConsumo());
		consumoEntity.setDescripcion(consumoDto.getDescripcion());
		consumoEntity.setNumeroCasa(consumoDto.getNumeroCasa());
        consumoRepository.save(consumoEntity);
        return true;
	}

	@Override
	public List<ConsumoDto> findNumeroCasa(Integer numeroCasa) {
		List<ConsumoDto> consumo = new ArrayList<ConsumoDto>();
        List<ConsumoEntity> listconsumo = consumoRepository.findByNumeroCasa(numeroCasa);
        ConsumoDto consumoDto = new ConsumoDto();
        listconsumo.forEach(dato -> {
            consumoDto.setConsumo(dato.getConsumo());
            consumoDto.setDescripcion(dato.getDescripcion());
            consumoDto.setNumeroCasa(dato.getNumeroCasa());
        });
        consumo.add(consumoDto);

        return consumo;
	}

}
