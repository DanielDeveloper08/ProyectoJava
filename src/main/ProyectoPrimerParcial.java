package main;

import Arreglos.Arreglo;
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
                sc.close();
                System.exit(0);
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
        RecursividadIteracion recursividadIteracion = new RecursividadIteracion();

        boolean retornar = recursividadIteracion.principal();
        System.out.println("retornar" + retornar);
        if (retornar) {
            ejecucionGeneral();
        }
    }

    private static void ejecutarOrdenamiento() {
        Ordenamiento ordenamiento = new Ordenamiento();

        ordenamiento.principal();
    }

    private static void ejecutarBusqueda() {
        System.out.println("Opcion 4 - Busqueda");
    }

}
