package com.acu.co.external.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acu.co.external.entity.ConsumoEntity;





public interface IConsumoRepository extends JpaRepository<ConsumoEntity
, Long> {
	 List<ConsumoEntity> findByNumeroCasa(Integer numeroCasa);
}
