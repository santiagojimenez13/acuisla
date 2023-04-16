package com.acu.co.external.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acu.co.external.entity.FacturaEntity;

public interface IFacturaRepository extends JpaRepository<FacturaEntity, Long> {
	Optional<FacturaEntity> findById(Long id);
}
