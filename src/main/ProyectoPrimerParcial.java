package main;

import Arreglos.AplicacionArreglo;
import Arreglos.Arreglo;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProyectoPrimerParcial {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejecucionGeneral();
    }

    private static void ejecucionGeneral() {
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
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Arreglos");
        System.out.println("2. Recursividad e Iteracion");
        System.out.println("3. Ordenamiento");
        System.out.println("4. Busqueda");
        System.out.println("0. Salir");
    }

    private static int leerOpcion() {
        System.out.print("Opcion: ");
        return sc.nextInt();
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                ejecutarArreglos();
                break;

            case 2:
                ejecutarRecursividadEIteracion();
                break;

            case 3:
                ejecutarOrdenamiento();
                break;

            case 4:
                ejecutarBusqueda();
                break;

            case 0:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opcion invalida. Intente nuevamente.");
                break;
        }
    }

    private static void ejecutarArreglos() {
        Arreglo arreglo = new Arreglo();

        boolean retornar = arreglo.principal();
        System.out.println("retornar" + retornar);
        if (retornar) {
            ejecucionGeneral();
        }
    }

    private static void ejecutarRecursividadEIteracion() {
        System.out.println("Opcion 2 - Recursividad e Iteracion");
    }

    private static void ejecutarOrdenamiento() {
        System.out.println("Opcion 3 - Ordenamiento");
    }

    private static void ejecutarBusqueda() {
        System.out.println("Opcion 4 - Busqueda");
    }

}
