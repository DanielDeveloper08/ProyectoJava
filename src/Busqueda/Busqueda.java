
package Busqueda;

import Arreglos.AplicacionArreglo;
import java.util.Scanner;
import main.ClaseGenerica;

public class Busqueda {
    
    private static Scanner scanner = new Scanner(System.in);
    ClaseGenerica busqueda = new ClaseGenerica();

    public Busqueda() {
        seteoData();
    }

    public boolean principal() {
        boolean retornar = false;

        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();

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
                    retornar = retornar();
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);

        scanner.close();

        return retornar;
    }

    private static void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Definición");
        System.out.println("2. Algoritmo");
        System.out.println("3. Prueba de escritorio");
        System.out.println("4. Descripción del programa");
        System.out.println("5. Aplicación");
        System.out.println("0. Retornar");
    }

    private static int leerOpcion() {
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    private void mostrarDefinicion() {
        System.out.println(busqueda.getDefinicion());
    }

    private void mostrarAlgoritmo() {
        System.out.println(busqueda.getAlgoritmo());
    }

    private void mostrarPruebaDeEscritorio() {
        // AGRGEAR
    }

    private void mostrarDescripcionDelPrograma() {
        System.out.println(busqueda.getDescripcionPrograma());
    }

    private void mostrarAplicacion() {
        AplicacionBusqueda app = (AplicacionBusqueda) busqueda.getAplicacion();
        /*boolean retornar = app.ejecutar();
        if (retornar) {
            principal();
        }*/
    }

    private void seteoData() {
        busqueda.setDefinicion(
        "Concepto de Ordenamiento:\n" +
        "El ordenamiento es un proceso que permite organizar los elementos de una colección de datos en un cierto criterio predefinido. " +
        "El objetivo principal del ordenamiento es obtener una disposición de los elementos de manera ascendente o descendente, " +
        "lo que facilita su búsqueda, recuperación y realización de operaciones sobre ellos.\n" +
        "\n" +
        "Tipos de Ordenamiento:\n" +
        "1. Ordenamiento por intercambio directo (burbuja):\n" +
        "- Consiste en comparar pares de elementos adyacentes y realizar intercambios si están en el orden incorrecto.\n" +
        "- Repite este proceso hasta que todos los elementos estén ordenados.\n" +
        "\n" +
        "2. Ordenamiento por selección:\n" +
        "- Selecciona repetidamente el elemento más pequeño (o más grande) y lo coloca en su posición correcta.\n" +
        "- Se va construyendo una sublista ordenada desde el principio hasta el final del arreglo.\n" +
        "\n" +
        "3. Ordenamiento por inserción:\n" +
        "- Recorre el arreglo desde el segundo elemento y lo compara con los elementos anteriores.\n" +
        "- Si encuentra un elemento menor, lo desplaza hacia la derecha hasta encontrar su posición correcta.\n" +
        "\n" +
        "4. Ordenamiento por Quicksort:\n" +
        "- Divide el arreglo en subarreglos más pequeños basados en un elemento llamado 'pivote'.\n" +
        "- Luego, reorganiza los elementos de manera que los elementos más pequeños que el pivote estén a su izquierda, y los elementos más grandes estén a su derecha.\n" +
        "- Repite este proceso recursivamente para los subarreglos hasta que todo el arreglo esté ordenado.");
        
        
        busqueda.setAlgoritmo("Algoritmo de ordenamiento por intercambio directo (burbuja):\n" +
        "1. Compara pares de elementos adyacentes.\n" +
        "2. Si están en el orden incorrecto, los intercambia.\n" +
        "3. Repite este proceso hasta que todos los elementos estén ordenados.\n" +
        "\n" +
        "Algoritmo de ordenamiento por selección:\n" +
        "1. Encuentra el elemento más pequeño (o más grande) en la lista.\n" +
        "2. Lo coloca en la posición correcta.\n" +
        "3. Repite este proceso para el resto de elementos, ubicándolos en la sublista ordenada.\n" +
        "\n" +
        "Algoritmo de ordenamiento por inserción:\n" +
        "1. Recorre el arreglo desde el segundo elemento.\n" +
        "2. Compara el elemento actual con los elementos anteriores.\n" +
        "3. Si encuentra un elemento menor, lo desplaza hacia la derecha hasta encontrar su posición correcta.\n" +
        "4. Repite este proceso hasta que todos los elementos estén en su posición correcta.\n" +
        "\n" +
        "Algoritmo de ordenamiento por Quicksort:\n" +
        "1. Elige un elemento pivote del arreglo.\n" +
        "2. Reorganiza los elementos de manera que los menores que el pivote estén a su izquierda y los mayores estén a su derecha.\n" +
        "3. Aplica recursivamente este proceso a las sublistas de elementos menores y mayores que el pivote.\n" +
        "4. Combina las sublistas ordenadas para obtener el arreglo ordenado final.");
        
        busqueda.setDescripcionPrograma(
                "El programa permite agregar nombres de mascotas, dandonos la opcion de consultar mascotas /n"
                        + "eliminar mascotas y actualizar.");
        AplicacionArreglo aplicacion = new AplicacionArreglo(5);
        busqueda.setAplicacion(aplicacion);
    }

    public boolean retornar() {
        return true;
    }

}
