package com.acu.co.service;

import com.acu.co.controller.dto.FacturaDto;

public interface IFacturaService {
	 boolean saveInvoise(FacturaDto facturaDto);

	 FacturaDto fainIvoise(Long id);
}
