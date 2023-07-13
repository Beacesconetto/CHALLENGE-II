package br.com.beatriz.car2.controller;

import br.com.beatriz.car2.dto.CarDto;
import br.com.beatriz.car2.entity.Car;
import br.com.beatriz.car2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/post")
    public ResponseEntity registerCar(@RequestBody CarDto carDto) {
        carService.registerCar(carDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get/{idChassi}")
    public ResponseEntity<CarDto> getCarByChassi(@PathVariable Long idChassi) {
        CarDto carDto = carService.getCarByChassi(idChassi);
        return ResponseEntity.ok(carDto);
    }
}
