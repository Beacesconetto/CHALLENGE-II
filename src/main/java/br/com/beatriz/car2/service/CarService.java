package br.com.beatriz.car2.service;

import br.com.beatriz.car2.dto.CarDtoRequest;
import br.com.beatriz.car2.entity.Car;
import br.com.beatriz.car2.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

       public String save(CarDtoRequest carDtoRequest) {



        Car car = new Car (null,
                           carDtoRequest.getName(),
                           carDtoRequest.getBrand(),
                           carDtoRequest.getColor(),
                           carDtoRequest.getFabricationYear());

        carRepository.save(car);
        return "The information about the car has been saved.";
    }

    public Car getById(Long id) {
        return carRepository.findById(id).orElseThrow();
    }
}
