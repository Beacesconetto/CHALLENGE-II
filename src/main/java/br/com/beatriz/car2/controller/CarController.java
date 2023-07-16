package br.com.beatriz.car2.controller;

import br.com.beatriz.car2.dto.CarDto;
import br.com.beatriz.car2.entity.Car;
import br.com.beatriz.car2.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService
                = carService;
    }

    @PostMapping("/post")
    public ResponseEntity<String> registerCar(@Valid @RequestBody CarDto carDto) {
        boolean registrationSuccess = carService.registerCar(carDto);
        if (registrationSuccess) {
            return ResponseEntity.ok("Car registered successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to register car.");
        }
    }


    @GetMapping("/get/{idChassi}")
    public ResponseEntity<Car> getCarByChassi(@PathVariable Long idChassi) {
        Car carDto = carService.getCarByChassi(idChassi);
               return ResponseEntity.ok(carDto);
    }
}
