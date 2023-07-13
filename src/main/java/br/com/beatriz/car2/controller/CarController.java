package br.com.beatriz.car2.controller;

import br.com.beatriz.car2.dto.CarDtoRequest;
import br.com.beatriz.car2.entity.Car;
import br.com.beatriz.car2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/post")
    public String post(@RequestBody CarDtoRequest carDtoRequest) {
    return carService.save(carDtoRequest); }
    @GetMapping("/get/{id}")
    public Car post(@PathVariable Long id) {
        return carService.getById(id);
    }

}
