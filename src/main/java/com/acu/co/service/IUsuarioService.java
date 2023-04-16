package com.acu.co.service;

import java.util.List;

import com.acu.co.controller.dto.UsuarioDto;

public interface IUsuarioService {
	Boolean saveUser(UsuarioDto usuarioDto);

    List<UsuarioDto> findUser(String apellido);
}
