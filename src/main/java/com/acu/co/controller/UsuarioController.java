package com.acu.co.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acu.co.controller.dto.UsuarioDto;
import com.acu.co.service.IUsuarioService;

@RestController
@RequestMapping("/user")
public class UsuarioController {
	 private IUsuarioService usuarioService;

	    public UsuarioController(IUsuarioService usuarioService) {
	        this.usuarioService = usuarioService;
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Boolean> saveUser(@RequestBody UsuarioDto usuarioDto) {
	        return new ResponseEntity<>(usuarioService.saveUser(usuarioDto), HttpStatus.OK);
	    }

	    /**
	     * @param apellido
	     * @return
	     */
	    @GetMapping("/get/{apellido}")
	    public ResponseEntity<UsuarioDto> getUser(@PathVariable String apellido) {
	        return new ResponseEntity(usuarioService.findUser(apellido), HttpStatus.OK);
	    }

}
