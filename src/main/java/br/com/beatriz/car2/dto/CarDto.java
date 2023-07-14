package br.com.beatriz.car2.dto;


import javax.validation.constraints.NotBlank;


public class CarDto {


    private Long idChassi;

    @NotBlank
    private String name;

    @NotBlank
    private String brand;

    @NotBlank
    private String color;

    @NotBlank
    private String fabricationYear;

    public CarDto(Long idChassi, String name, String brand, String color, String fabricationYear) {
    }

    public CarDto() {

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

}
