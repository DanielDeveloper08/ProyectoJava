package Ordenamiento;

import java.util.Scanner;

import Recursividad_Iteracion.AplicacionRecursividadIteracion;
import java.util.InputMismatchException;
import main.ClaseGenerica;
import main.ProyectoPrimerParcial;

/**
 *
 * author danny
 */
public class Ordenamiento {

    private static Scanner scanner = new Scanner(System.in);
    ClaseGenerica ordenamiento = new ClaseGenerica();

    public Ordenamiento() {
        seteoData();
    }

    public void principal() {
        int opcion;
        boolean opcionValida;

        do {
            mostrarMenu();
            opcion = leerOpcion();
            opcionValida = true;

            switch (opcion) {
                case 1:
                    mostrarDefinicion();
                    break;

                case 2:
                    mostrarAlgoritmo();
                    break;

                case 3:
                    mostrarPruebaDeEscritorio();
                    break;

                case 4:
                    mostrarDescripcionDelPrograma();
                    break;

                case 5:
                    mostrarAplicacion();
                    break;

                case 0:
                    ProyectoPrimerParcial.ejecucionGeneral();
                    break;

                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    opcionValida = false;
                    break;
            }

            System.out.println();
        } while (opcion != 0 || !opcionValida);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("========================================");
        System.out.println("           MENU DE OPCIONES             ");
        System.out.println("             ORDENAMIENTO               ");
        System.out.println("========================================");
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Definicion");
        System.out.println("2. Algoritmo");
        System.out.println("3. Prueba de escritorio");
        System.out.println("4. Descripcion del programa");
        System.out.println("5. Aplicacion");
        System.out.println("0. Retornar");
        System.out.println("----------------------------------------");
    }

    private static int leerOpcion() {
        while (true) {
            try {
                System.out.print("Opcion: ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: entrada invalida. Intente nuevamente.");
                scanner.nextLine();
            }
        }
    }

    private void mostrarDefinicion() {
        System.out.println(ordenamiento.getDefinicion());
    }

    private void mostrarAlgoritmo() {
        System.out.println(ordenamiento.getAlgoritmo());
    }

    private void mostrarPruebaDeEscritorio() {
        // AGRGEAR
    }

    private void mostrarDescripcionDelPrograma() {
        System.out.println(ordenamiento.getDescripcionPrograma());
    }

    private void mostrarAplicacion() {
        AplicacionOrdenamiento app = (AplicacionOrdenamiento) ordenamiento.getAplicacion();
        app.ejecutar();
    }

    private void seteoData() {
        ordenamiento.setDefinicion(
                "Concepto de Ordenamiento:\n"
                + "El ordenamiento es un proceso que permite organizar los elementos de una colección de datos en un cierto criterio predefinido. "
                + "El objetivo principal del ordenamiento es obtener una disposición de los elementos de manera ascendente o descendente, "
                + "lo que facilita su búsqueda, recuperación y realización de operaciones sobre ellos.\n"
                + "\n"
                + "Tipos de Ordenamiento:\n"
                + "1. Ordenamiento por intercambio directo (burbuja):\n"
                + "- Consiste en comparar pares de elementos adyacentes y realizar intercambios si están en el orden incorrecto.\n"
                + "- Repite este proceso hasta que todos los elementos estén ordenados.\n"
                + "\n"
                + "2. Ordenamiento por selección:\n"
                + "- Selecciona repetidamente el elemento más pequeño (o más grande) y lo coloca en su posición correcta.\n"
                + "- Se va construyendo una sublista ordenada desde el principio hasta el final del arreglo.\n"
                + "\n"
                + "3. Ordenamiento por inserción:\n"
                + "- Recorre el arreglo desde el segundo elemento y lo compara con los elementos anteriores.\n"
                + "- Si encuentra un elemento menor, lo desplaza hacia la derecha hasta encontrar su posición correcta.\n"
                + "\n"
                + "4. Ordenamiento por Quicksort:\n"
                + "- Divide el arreglo en subarreglos más pequeños basados en un elemento llamado 'pivote'.\n"
                + "- Luego, reorganiza los elementos de manera que los elementos más pequeños que el pivote estén a su izquierda, y los elementos más grandes estén a su derecha.\n"
                + "- Repite este proceso recursivamente para los subarreglos hasta que todo el arreglo esté ordenado.");

        ordenamiento.setAlgoritmo("Algoritmo de ordenamiento por intercambio directo (burbuja):\n"
                + "1. Compara pares de elementos adyacentes.\n"
                + "2. Si están en el orden incorrecto, los intercambia.\n"
                + "3. Repite este proceso hasta que todos los elementos estén ordenados.\n"
                + "\n"
                + "Algoritmo de ordenamiento por selección:\n"
                + "1. Encuentra el elemento más pequeño (o más grande) en la lista.\n"
                + "2. Lo coloca en la posición correcta.\n"
                + "3. Repite este proceso para el resto de elementos, ubicándolos en la sublista ordenada.\n"
                + "\n"
                + "Algoritmo de ordenamiento por inserción:\n"
                + "1. Recorre el arreglo desde el segundo elemento.\n"
                + "2. Compara el elemento actual con los elementos anteriores.\n"
                + "3. Si encuentra un elemento menor, lo desplaza hacia la derecha hasta encontrar su posición correcta.\n"
                + "4. Repite este proceso hasta que todos los elementos estén en su posición correcta.\n"
                + "\n"
                + "Algoritmo de ordenamiento por Quicksort:\n"
                + "1. Elige un elemento pivote del arreglo.\n"
                + "2. Reorganiza los elementos de manera que los menores que el pivote estén a su izquierda y los mayores estén a su derecha.\n"
                + "3. Aplica recursivamente este proceso a las sublistas de elementos menores y mayores que el pivote.\n"
                + "4. Combina las sublistas ordenadas para obtener el arreglo ordenado final.");

        ordenamiento.setDescripcionPrograma(
                "\n ===== DESCRIPCION DEL PROGRAMA =====\n"
                + "El programa permite ordenar una lista de numeros ingresado por teclado por cualquier tipo de ordenamiento.");
        AplicacionOrdenamiento aplicacion = new AplicacionOrdenamiento();
        ordenamiento.setAplicacion(aplicacion);
    }
}
