package Clase13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SistemaDeControl sistema = new SistemaDeControl();

        int pisoUsuario;
        int pisoDestino;
        int opcion;
        int agregarMas;

        do {
            System.out.println("===== MENU PANEL DE PASILLO =====");
            System.out.println("1. Llamar y usar ascensor");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿En que piso esta usted?: ");
                    pisoUsuario = entrada.nextInt();

                    if (pisoUsuario < 1 || pisoUsuario > 4) {
                        System.out.println("Piso invalido.");
                        break;
                    }

                    int pisoAscensor = sistema.getAscensor().getPisoActual();

                    if (pisoUsuario != pisoAscensor) {
                        System.out.println("Llamando al ascensor... (El ascensor esta en el piso " + pisoAscensor + ")");
                        sistema.recibirSolicitud(pisoUsuario, Direccion.Subir);
                        System.out.println("Esperando que llegue el ascensor a tu piso...");
                        sistema.getAscensor().atenderSolicitudes();
                        System.out.println("Te subes al ascensor.");
                    } else {
                        System.out.println("El ascensor ya esta en el piso " + pisoUsuario + " con las puertas abiertas. Te subes.");
                    }

                    boolean emergenciaActivada = false;

                    do {
                        System.out.println("\n--- INTERIOR DE CABINA ---");
                        System.out.println("Marque un piso o presione 0 para BOTON DE EMERGENCIA");
                        System.out.print("Seleccione: ");
                        pisoDestino = entrada.nextInt();

                        if (pisoDestino == 0) {
                            sistema.getAscensor().activarEmergencia();
                            emergenciaActivada = true;
                            break; 
                        }

                        if (pisoDestino >= 1 && pisoDestino <= 4) {
                            if (pisoDestino == pisoUsuario) {
                                System.out.println("Ya se encuentra en ese piso.");
                            } else {
                                sistema.getAscensor().agregarSolicitud(pisoDestino);
                            }
                        } else {
                            System.out.println("Piso invalido.");
                        }

                        System.out.print("¿Otro pasajero va a marcar otro piso? (1 = Si, 2 = No): ");
                        agregarMas = entrada.nextInt();

                    } while (agregarMas == 1);

                    if (!emergenciaActivada) {
                        System.out.println("Puerta cerrandose");
                        sistema.getAscensor().atenderSolicitudes();
                    }
                    break;

                case 2:
                    System.out.println("Sistema finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
            System.out.println();

        } while (opcion != 2);

        entrada.close();
    }
}