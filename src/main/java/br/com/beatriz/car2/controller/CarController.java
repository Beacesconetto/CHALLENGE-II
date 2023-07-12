package br.com.beatriz.car2.controller;

import br.com.beatriz.car2.entity.Car;
import br.com.beatriz.car2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    CarService carService;
    @GetMapping("/get/{idChassi}")
    public String vamos() {
        return carService.getString();
    }

    @PostMapping("/post")
    public String post(@RequestBody Car car) {
        return carService.save(car);
    }
    @GetMapping("/get2/{id}")
    public Car post(@PathVariable Long id) {
        return carService.getById(id);
    }

}
