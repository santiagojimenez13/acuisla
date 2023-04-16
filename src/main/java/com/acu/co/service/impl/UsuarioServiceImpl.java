package com.acu.co.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.acu.co.controller.dto.UsuarioDto;
import com.acu.co.external.entity.UsuarioEntity;
import com.acu.co.external.repository.IRolRepository;
import com.acu.co.external.repository.IUsuarioRepository;
import com.acu.co.mapper.DtoToEntityMapper;
import com.acu.co.service.IUsuarioService;
@Service
public class UsuarioServiceImpl implements IUsuarioService{
	 private final IUsuarioRepository usuarioRepository;

	    private final IRolRepository RolRepository;

	    public UsuarioServiceImpl(IUsuarioRepository usuarioRepository,
	            IRolRepository RolRepository) {
	        this.usuarioRepository = usuarioRepository;
	        this.RolRepository = RolRepository;
	    }

	@Override
	public Boolean saveUser(UsuarioDto usuarioDto) {
		
		
		 DtoToEntityMapper mapper = new DtoToEntityMapper();
	        UsuarioEntity usuarioEntity = mapper.usuarioDtoToUsuarioEntity(usuarioDto);
	        RolRepository.save(usuarioEntity.getRolId());
	        usuarioRepository.save(usuarioEntity);
	        return true;
	}

	@Override
	public List<UsuarioDto> findUser(String apellido) {
		List<UsuarioDto> responseList = new ArrayList<>();
	        List<UsuarioEntity> listUser = usuarioRepository.findByApellido(apellido);
	        UsuarioDto usuarioDto = new UsuarioDto();
	        listUser.forEach(user -> {
	            usuarioDto.setNombre(user.getNombre());
	            usuarioDto.setApellido(user.getApellido());
	            usuarioDto.setDireccion(user.getDireccion());
	            usuarioDto.setGmail(user.getGmail());
	            usuarioDto.setTelefono(user.getTelefono());
	        });
	        responseList.add(usuarioDto);
	        return responseList;
	}

}
