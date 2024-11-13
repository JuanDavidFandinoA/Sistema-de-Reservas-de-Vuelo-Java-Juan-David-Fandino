/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionreservasvuelos;

/**
 *
 * @author juand
 */

class VueloInternacional extends Vuelo {
    private static final double IMPUESTO_INTERNACIONAL = 0.15;

    public VueloInternacional(String codigo, String destino, double precioBase) {
        super(codigo, destino, precioBase);
    }

    @Override
    public double calcularCostoTotal() {
        return precioBase + (precioBase * IMPUESTO_INTERNACIONAL);
    }
}