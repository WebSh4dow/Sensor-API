package com.Teste.Jarmison.SensorWebAPI.controller;

import com.Teste.Jarmison.SensorWebAPI.entity.Sensor;
import com.Teste.Jarmison.SensorWebAPI.service.SenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Sensor")
public class SenseController {
    @Autowired
    private SenseService senseService;

    @PostMapping("/sensors")
    @ResponseStatus(HttpStatus.CREATED)
    public Sensor addSensores(@RequestBody Sensor sensor){
        return senseService.addSense(sensor);
    }
    @GetMapping
    public List<Sensor> listAllSensors(){
        return senseService.listAll();
    }
    @GetMapping("/sensors/{id}")
    public ResponseEntity <Sensor> getBySensorid(@PathVariable (value = "id")  Long id){
    return senseService.findSensorById(id);
    }
    @DeleteMapping("/sensors/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity <Object> deleteSensorbyId(@PathVariable (value = "id") Long id){
        return senseService.deleteSensorById(id);
    }
    @PutMapping("/sensors/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity <Sensor> updateSensorById(@PathVariable (value = "id") Long id,@RequestBody Sensor sensor){
        return senseService.updateSensorById(sensor,id);
    }

}
