/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionreservasvuelos;

/**
 *
 * @author juand
 */

class Asiento {
    private String clase;
    private double recargo;

    public Asiento(String clase, double recargo) {
        this.clase = clase;
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    public String getClase() {
        return clase;
    }
}