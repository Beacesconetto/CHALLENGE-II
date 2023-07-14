package br.com.beatriz.car2.service;

import java.util.Objects;
import br.com.beatriz.car2.dto.CarDto;
import br.com.beatriz.car2.entity.Car;
import br.com.beatriz.car2.repository.CarRepository;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CarService {
    private final CarRepository carRepository;


    public CarService(CarRepository carRepository) {

        this.carRepository = carRepository;
    }

      public boolean registerCar(CarDto carDto) {
        if (!isValidBrand(carDto.getBrand())) {
            throw new IllegalArgumentException("Invalid car brand");
        }


        Car car = new Car();
        car.setidChassi(carDto.getidChassi());
        car.setName(carDto.getName());
        car.setBrand(carDto.getBrand());
        car.setColor(carDto.getColor());
        car.setFabricationYear(carDto.getFabricationYear());

        carRepository.save(car);
        return true;
    }


    private boolean isValidBrand(String brand) {
        List<String> validBrands = Arrays.asList("Ford", "Chevrolet", "BMW", "Volvo");
        return validBrands.contains(brand);
    }

    public CarDto getCarByChassi(Long idChassi) {
        return null;
    }
}
