package com.company;

/**
 *  Representa una Cuenta bancaria, su número y si está activa.
 */
public class BankAccount {
    // Inicio atributos.
    // Representa el número de la cuenta bancaria.
    private int accountNumber;

    // Representa si la cuenta está activa.
    protected boolean activated;
    // Fin de atributos.

    // Inicio Getters and Setters.
    // Devuelve el número de la cuenta bancaria.
    public int getAccountNumber() {
        return accountNumber;
    }

    // Define el número de la cuenta bancaria.
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Devuelve si la cuenta está activa.
    public boolean isActivated() {
        return activated;
    }

    // Define si la cuenta está activa.
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    // Fin Getters and Setters.
}
