package com.acu.co.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acu.co.controller.dto.FacturaDto;
import com.acu.co.service.IFacturaService;

@RestController
@RequestMapping("/invoise")
public class FacturaController {
	 private IFacturaService facturaService;

	    public FacturaController(IFacturaService facturaService) {
	        this.facturaService = facturaService;
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Boolean> saveInvoise(@RequestBody FacturaDto facturaDto) {
	        return new ResponseEntity<Boolean>(facturaService.saveInvoise(facturaDto), HttpStatus.OK);
	    }

	    @GetMapping("/get/{id}")
	    public ResponseEntity<FacturaDto> GetInvoise(@PathVariable Long id) {
	        return new ResponseEntity<>(facturaService.fainIvoise(id), HttpStatus.OK);
	    }
}
