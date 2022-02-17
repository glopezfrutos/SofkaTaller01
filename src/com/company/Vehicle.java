package com.company;
/**
 * Representa un Vehículo, con su tipo y su cantidad de ruedas.
 */
public class Vehicle {
    // Inicio atributos.
    // Representa el tipo de vehículo.
    private String type;

    // Representa el número de ruedas del vehículo.
    private int wheelsNum;
    // Fin atributos.


    // Inicio Getters and Setters
    // Devuelve el tipo de vehículo.
    public String getType() {
        return type;
    }

    // Define el tipo de vehículo.
    public void setType(String type) {
        this.type = type;
    }

    // Devuelve el número de ruedas del vehículo.
    public int getWheelsNum() {
        return wheelsNum;
    }

    // Define el número de ruedas del vehículo.
    public void setWheelsNum(int wheelsNum) {
        this.wheelsNum = wheelsNum;
    }
    // Fin Getters and Setters
}
