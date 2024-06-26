package com.gosen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gosen.model.DeviceStatusEntity;
import com.gosen.model.EnvironmentalDataEntity;

public interface EnvironmentalDataRepository extends JpaRepository<EnvironmentalDataEntity, Long>{
	List<EnvironmentalDataEntity> findAllByStatusId(DeviceStatusEntity statusId);
}
