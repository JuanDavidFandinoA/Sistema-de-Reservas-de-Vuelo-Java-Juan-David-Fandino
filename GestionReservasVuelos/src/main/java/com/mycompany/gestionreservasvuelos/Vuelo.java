/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionreservasvuelos;

/**
 *
 * @author juand
 */

abstract class Vuelo {
    protected String codigo;
    protected String destino;
    protected double precioBase;

    public Vuelo(String codigo, String destino, double precioBase) {
        this.codigo = codigo;
        this.destino = destino;
        this.precioBase = precioBase;
    }

    public abstract double calcularCostoTotal();

    public String getCodigo() {
        return codigo;
    }

    public void reservarAsiento() {
        System.out.println("Reserva realizada para el vuelo: " + codigo);
    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para el vuelo: " + codigo);
    }
}
