package com.acu.co.external.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acu.co.external.entity.UsuarioEntity;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	 List<UsuarioEntity> findByApellido(String apellido);
}
