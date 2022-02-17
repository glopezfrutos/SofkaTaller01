package com.company;

import java.util.ArrayList;

/**
 *  Representa una Fruta, su nombre, su peso promedio y sus colores.
 */
public class Fruit {
    // Inicio atributos.
    // Representa el nombre de la fruta.
    public String name;

    // Representa el peso promedio de la fruta.
    private float averageWeight;

    // Representa los colores de la fruta.
    public ArrayList<String> colors;
    // Fin atributos.

    // Inicio Getters and Setters.
    // Devuelve el nombre de la fruta.
    public String getName() {
        return name;
    }

    // Define el nombre de la fruta.
    public void setName(String name) {
        this.name = name;
    }

    // Devuelve el peso promedio de la fruta.
    public float getAverageWeight() {
        return averageWeight;
    }

    // Define el peso promedio de la fruta.
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    // Devuelve los colores de la fruta.
    public ArrayList<String> getColors() {
        return colors;
    }

    // Define los colores de la fruta.
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    // Fin Getters and Setters.
}
