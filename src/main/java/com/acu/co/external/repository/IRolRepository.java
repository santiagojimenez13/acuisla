package com.acu.co.external.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acu.co.external.entity.RolEntity;

public interface IRolRepository extends JpaRepository<RolEntity, Long> {

}
