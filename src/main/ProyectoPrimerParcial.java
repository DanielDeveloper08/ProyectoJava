package main;

import Arreglos.Arreglo;
import Busqueda.Busqueda;
import Ordenamiento.Ordenamiento;
import Recursividad_Iteracion.RecursividadIteracion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProyectoPrimerParcial {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejecucionGeneral();
    }

    public static void ejecucionGeneral() {
        try {
            int opcion;
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        } catch (InputMismatchException e) {
            System.out.println("Error: entrada invalida. Intente nuevamente.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }
    }

    private static void mostrarMenu() {
        System.out.println("================================");
        System.out.println("|        Menu de opciones       |");
        System.out.println("================================");
        System.out.println("|   1. Arreglos                 |");
        System.out.println("|   2. Recursividad e Iteracion |");
        System.out.println("|   3. Ordenamiento             |");
        System.out.println("|   4. Busqueda                 |");
        System.out.println("|   0. Salir                    |");
        System.out.println("================================");

    }

    private static int leerOpcion() {
        while (true) {
            try {
                System.out.print("Opcion: ");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: entrada invalida. Intente nuevamente.");
                sc.nextLine();
            }
        }
    }

    private static void ejecutarOpcion(int opcion) {
        boolean opcionValida = false;

        while (!opcionValida) {
            switch (opcion) {
                case 1:
                    ejecutarArreglos();
                    opcionValida = true;
                    break;

                case 2:
                    ejecutarRecursividadEIteracion();
                    opcionValida = true;
                    break;

                case 3:
                    ejecutarOrdenamiento();
                    opcionValida = true;
                    break;

                case 4:
                    ejecutarBusqueda();
                    opcionValida = true;
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    opcion = leerOpcion();
                    break;
            }
        }
    }

    private static void ejecutarArreglos() {
        Arreglo arreglo = new Arreglo();
        arreglo.principal();
    }

    private static void ejecutarRecursividadEIteracion() {
        RecursividadIteracion recursividadIteracion = new RecursividadIteracion();
        recursividadIteracion.principal();
    }

    private static void ejecutarOrdenamiento() {
        Ordenamiento ordenamiento = new Ordenamiento();
        ordenamiento.principal();
    }

    private static void ejecutarBusqueda() {
        Busqueda busqueda = new Busqueda();
        busqueda.principal();
    }

}
