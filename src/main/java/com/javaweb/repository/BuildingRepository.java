package com.javaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository extends JpaRepository<BuildingEntity, Long>, BuildingRepositoryCustom {

}
