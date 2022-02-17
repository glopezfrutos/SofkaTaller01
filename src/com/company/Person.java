package com.company;

import java.util.Date;

/**
 *  Representa una Persona, con su nombre, edad y peso.
 */
public class Person {
    // Inicio atributos.
    // Representa el nombre de la persona.
    public String name;

    // Representa el primer apellido de la persona.
    public String lastName1;

    // Representa el segundo apellido de la persona.
    public String lastName2;

    // Representa la fecha de nacimiento de la persona.
    public Date dateBirth;

    // Representa el peso de la persona.
    public float height;
    // Fin atributos.


    // Inicio Getters and Setters.
    // Devuelve el nombre de la persona.
    public String getName() {
        return name;
    }

    // Define el nombre de la persona.
    public void setName(String name) {
        this.name = name;
    }

    // Devuelve el primer apellido de la persona.
    public String getLastName1() {
        return lastName1;
    }

    // Define el primer apellido de la persona.
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    // Devuelve el segundo apellido de la persona.
    public String getLastName2() {
        return lastName2;
    }

    // Define el segundo apellido de la persona.
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    // Devuelve la fecha de nacimiento de la persona.
    public Date getDateBirth() {
        return dateBirth;
    }

    // Define la fecha de nacimiento de la persona.
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    // Devuelve el peso de la persona.
    public float getHeight() {
        return height;
    }

    // Define el peso de la persona.
    public void setHeight(float height) {
        this.height = height;
    }
    // Fin Getters and Setters.

    // Método que devuelve el nombre completo de la persona.
    public void getCompleteName() {
        System.out.println(name + " " + lastName1 + " " + lastName2);
    }
}