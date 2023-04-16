package com.acu.co.service;

import java.util.List;

import com.acu.co.controller.dto.ConsumoDto;

public interface IConsumoService {
	 boolean saveConsumo(ConsumoDto consumoDto);

	    List<ConsumoDto> findNumeroCasa(Integer numeroCasa);
}
