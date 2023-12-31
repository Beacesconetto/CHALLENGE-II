package br.com.beatriz.car2.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CarTable")
public class Car {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idChassi;

    @NotBlank
    private String name;

    @NotBlank
    private String brand;

    @NotBlank
    private String color;

    @NotBlank
    private String fabricationYear;

    public Car() {
        this.idChassi = idChassi;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.fabricationYear = fabricationYear;
    }


    public Long getidChassi() {
        return idChassi;
    }

    public void setidChassi(Long idChassi) {
        this.idChassi = idChassi;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getFabricationYear() {

        return fabricationYear;
    }

    public void setFabricationYear(String fabricationYear) {

        this.fabricationYear = fabricationYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idChassi=" + idChassi +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", fabricationYear='" + fabricationYear + '\'' +
                '}';
    }
}
