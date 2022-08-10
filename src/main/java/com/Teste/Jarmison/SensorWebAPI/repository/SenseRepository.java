package com.Teste.Jarmison.SensorWebAPI.repository;

import com.Teste.Jarmison.SensorWebAPI.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenseRepository extends JpaRepository <Sensor,Long> {
}
