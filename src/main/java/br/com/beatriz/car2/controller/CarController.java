package br.com.beatriz.car2.controller;

import br.com.beatriz.car2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

    @Autowired
    CarService carService;
    @GetMapping("/get/{idChassi}")
    public String vamos() {
        return carService.getString();
    }
}
