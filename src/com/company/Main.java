package com.company;

public class Main {
    public static void main(String[] args) {
        // Se instancia una Persona y se llama a varios de sus métodos como prueba.
        Person person1 = new Person();
        person1.setName("Juan");
        person1.setLastName1("De Los");
        person1.setLastName2("Palotes");
        person1.getCompleteName();
    }
}