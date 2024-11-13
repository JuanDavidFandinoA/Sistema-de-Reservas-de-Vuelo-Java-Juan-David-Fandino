/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionreservasvuelos;

/**
 *
 * @author juand
 */

class VueloNacional extends Vuelo {
    private static final double IMPUESTO_NACIONAL = 0.05; // 5% de impuestos

    public VueloNacional(String codigo, String destino, double precioBase) {
        super(codigo, destino, precioBase);
    }

    @Override
    public double calcularCostoTotal() {
        return precioBase + (precioBase * IMPUESTO_NACIONAL);
    }
}
