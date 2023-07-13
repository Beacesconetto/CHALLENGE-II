package br.com.beatriz.car2.service;

import br.com.beatriz.car2.dto.CarDto;
import br.com.beatriz.car2.entity.Car;
import br.com.beatriz.car2.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public void registerCar(CarDto carDto) {

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
    }
    public CarDto getCarByChassi(Long idChassi) {
        Car car = carRepository.findByidChassi(idChassi);
        if (car == null) {
            throw new NoSuchElementException("Car not found");
        }

        CarDto carDTO = new CarDto();
        carDTO.setId(car.getidChassi());
        carDTO.setName(car.getName());
        carDTO.setBrand(car.getBrand());
        carDTO.setColor(car.getColor());
        carDTO.setFabricationYear(car.getFabricationYear());

        return carDTO;

}

    private boolean isValidBrand(String brand) {
        List<String> validBrands = Arrays.asList("Ford", "Chevrolet", "BMW", "Volvo");
        return validBrands.contains(brand);
    }
    }
