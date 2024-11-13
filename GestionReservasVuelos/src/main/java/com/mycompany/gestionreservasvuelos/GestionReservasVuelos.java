/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionreservasvuelos;

/**
 *
 * @author juand
 */


public class GestionReservasVuelos {
    public static void main(String[] args) {
        Vuelo vuelo1 = new VueloNacional("A123", "Medellín", 500000);
        Vuelo vuelo2 = new VueloInternacional("B456", "Miami", 1500000);

        Asiento asientoEconomico = new Asiento("Economica", 0);
        Asiento asientoEjecutivo = new Asiento("Ejecutiva", 300000);

        boolean continuar = true;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (continuar) {
            System.out.println("\nSistema de gestion de reservas de vuelo");
            System.out.println("1. Reservar vuelo nacional");
            System.out.println("2. Reservar vuelo internacional");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Costo total (Económica): " + vuelo1.calcularCostoTotal());
                    System.out.println("Costo total (Ejecutiva): " + (vuelo1.calcularCostoTotal() + asientoEjecutivo.getRecargo()));
                    vuelo1.reservarAsiento();
                    break;
                case 2:
                    System.out.println("Costo total (Económica): " + vuelo2.calcularCostoTotal());
                    System.out.println("Costo total (Ejecutiva): " + (vuelo2.calcularCostoTotal() + asientoEjecutivo.getRecargo()));
                    vuelo2.reservarAsiento();
                    break;
                case 3:
                    System.out.print("Ingrese el codigo de vuelo a cancelar: ");
                    String codigo = scanner.next();
                    if (codigo.equals(vuelo1.getCodigo())) {
                        vuelo1.cancelarReserva();
                    } else if (codigo.equals(vuelo2.getCodigo())) {
                        vuelo2.cancelarReserva();
                    } else {
                        System.out.println("Codigo de vuelo no encontrado.");
                    }
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}
