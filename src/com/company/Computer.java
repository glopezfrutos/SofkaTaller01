package com.company;

/**
 * Representa una Computadora, con el tipo, el tamaño de su memoria y el tipo de la misma,
 * el tamaño de su disco y el tipo del mismo, y si sigue funcionando.
 */
public class Computer {
    // Inicio atributos.
    // Representa el tipo de computadora.
    private String type;

    // Representa el tipo de memoria.
    private String memType;

    // Representa el tamaño de la memoria.
    private int memSize;

    // Representa el tipo de disco.
    private String discType;

    // Representa el tamaño del disco.
    private int discSize;

    // Representa el estado de la computadora, si aun funciona.
    private boolean stillWorks;
    // Fin atributos.

    // Inicio Getters and Setters
    // Devuelve el tipo de computadora.
    public String getType() {
        return type;
    }

    // Define el tipo de computadora.
    public void setType(String type) {
        this.type = type;
    }

    // Devuelve el tipo de memoria.
    public String getMemType() {
        return memType;
    }

    // Define el tipo de memoria.
    public void setMemType(String memType) {
        this.memType = memType;
    }

    // Devuelve el tamaño de la memoria.
    public int getMemSize() {
        return memSize;
    }

    // Define el tamaño de la memoria.
    public void setMemSize(int memSize) {
        this.memSize = memSize;
    }

    // Devuelve el tipo de disco.
    public String getDiscType() {
        return discType;
    }

    // Define el tipo de disco
    public void setDiscType(String discType) {
        this.discType = discType;
    }

    // Devuelve el tamaño del disco.
    public int getDiscSize() {
        return discSize;
    }

    // Define el tamaño del disco.
    public void setDiscSize(int discSize) {
        this.discSize = discSize;
    }

    // Devuelve si la computadora todavía funciona.
    public boolean isStillWorks() {
        return stillWorks;
    }

    // Define si la computadora todavía funciona.
    public void setStillWorks(boolean stillWorks) {
        this.stillWorks = stillWorks;
    }
    // Fin Getters and Setters
}