package com.Teste.Jarmison.SensorWebAPI.service;

import com.Teste.Jarmison.SensorWebAPI.entity.Sensor;
import com.Teste.Jarmison.SensorWebAPI.repository.SenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SenseService {
    @Autowired
    private SenseRepository senseRepository;

    public List <Sensor> listAll(){
        return senseRepository.findAll();
    }
    public Sensor addSense(Sensor sensor){
        return senseRepository.save(sensor);

    }
    public ResponseEntity <Sensor> findSensorById(Long id){
        return senseRepository.findById(id)
                .map(sensor ->ResponseEntity.ok().body(sensor) )
                .orElse(ResponseEntity.notFound().build());
    }
    public ResponseEntity <Sensor> updateSensorById(Sensor sensor, Long id){
        return senseRepository.findById(id)
                .map(updateSensor -> {
                    updateSensor.setNomePonto(sensor.getNomePonto());
                    updateSensor.setTemperatura(sensor.getTemperatura());
                    updateSensor.setDeadLine(sensor.getDeadLine());
                    Sensor update = senseRepository.save(updateSensor);
                    return ResponseEntity.ok().body(update);
                }).orElse(ResponseEntity.notFound().build());
    }
    public ResponseEntity <Object> deleteSensorById(Long id){
        return senseRepository.findById(id)
                .map(deleteSensor ->{
                    senseRepository.deleteById(id);
                    return ResponseEntity.noContent().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
