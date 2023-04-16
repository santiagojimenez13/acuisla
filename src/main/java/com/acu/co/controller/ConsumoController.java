package com.acu.co.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acu.co.controller.dto.ConsumoDto;
import com.acu.co.service.IConsumoService;

@RestController
@RequestMapping("/consumo")
public class ConsumoController {
	private IConsumoService consumoService;

	private ConsumoController(IConsumoService consumoService) {
		super();
		this.consumoService = consumoService;
	}
	@PostMapping("/save")
	public ResponseEntity<Boolean> saveConsumo(@RequestBody ConsumoDto consumoDto){
		return new ResponseEntity<Boolean>(consumoService.saveConsumo(consumoDto),HttpStatus.OK);
	}
	@GetMapping("/get/{numeroCasa}")
	public ResponseEntity<ConsumoDto> getConsumo(@PathVariable Integer numeroCasa){
		return new ResponseEntity(consumoService.findNumeroCasa(numeroCasa), HttpStatus.OK);
	}

}
