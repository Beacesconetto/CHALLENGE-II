package br.com.beatriz.car2.repository;

import br.com.beatriz.car2.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository <Car, Long> {
    Car findByidChassi(Long idChassi);
}
