package com.company;

import java.util.Date;

/**
 *  Representa una Persona, con su nombre, edad y peso.
 */
public class Person {
    private String name;

    private String lastName1;

    private String lastName2;

    private Date dateBirth;

    private float height;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public void getCompleteName() {
        System.out.println(name + " " + lastName1 + " " + lastName2);
    }
}