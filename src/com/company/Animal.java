package com.company;

/**
 * Representa un Animal, con su número de patas y la onomatopeya que realiza.
 */
public class Animal {
    // Inicio atributos.
    // Representa el número de patas.
    private int legsNum;

    // Representa la onomatopeya que realiza.
    private String sound;
    // Fin atributos.

    //Inicio Getters and Setters
    // Devuelve el número de patas.
    public int getLegsNum() {
        return legsNum;
    }

    // Define el número de patas.
    public void setLegsNum(int legsNum) {
        this.legsNum = legsNum;
    }

    // Devuelve la onomatopeya.
    public String getSound() {
        return sound;
    }

    // Define la onomatopeya.
    public void setSound(String sound) {
        this.sound = sound;
    }
    //Fin Getters and Setters
}
