package Arreglos;

import java.util.Scanner;
import main.ClaseGenerica;

public class Arreglo {

    private static Scanner scanner = new Scanner(System.in);
    ClaseGenerica arreglo = new ClaseGenerica();

    public Arreglo() {
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
        System.out.println(arreglo.getDefinicion());
    }

    private void mostrarAlgoritmo() {
        System.out.println(arreglo.getAlgoritmo());
    }

    private void mostrarPruebaDeEscritorio() {
        // AGRGEAR
    }

    private void mostrarDescripcionDelPrograma() {
        System.out.println(arreglo.getDescripcionPrograma());
    }

    private void mostrarAplicacion() {
        AplicacionArreglo app = (AplicacionArreglo) arreglo.getAplicacion();
        boolean retornar = app.ejecutar();
        if (retornar) {
            principal();
        }
    }

    private void seteoData() {
        arreglo.setDefinicion(
                "Un arreglo es una estructura de datos que almacena elementos del mismo tipo en una secuencia contigua. Los elementos se acceden mediante un índice.");
        arreglo.setAlgoritmo("El algoritmo de los arreglos se puede describir en los siguientes pasos:\n"
                + "\n"
                + "1. Declaración del arreglo: Se define el tipo de datos que contendrá el arreglo y se declara su tamaño.\n"
                + "2. Inicialización del arreglo: Se asignan valores iniciales a los elementos del arreglo.\n"
                + "3. Acceso a los elementos del arreglo: Se pueden acceder a los elementos individuales del arreglo utilizando su índice.\n"
                + "4. Modificación de elementos del arreglo: Se pueden modificar los valores de los elementos del arreglo mediante asignación directa.\n"
                + "5. Recorrido del arreglo: Se puede recorrer el arreglo utilizando bucles para realizar operaciones en cada elemento.\n"
                + "6. Inserción de elementos: Se pueden insertar nuevos elementos en el arreglo, desplazando los elementos existentes si es necesario.\n"
                + "7. Eliminación de elementos: Se pueden eliminar elementos del arreglo, desplazando los elementos restantes para llenar el espacio vacío.\n"
                + "8. Consulta de elementos: Se pueden consultar los valores de los elementos individuales del arreglo.\n"
                + "9. Actualización de elementos: Se pueden actualizar los valores de los elementos del arreglo mediante asignación directa.");
        arreglo.setDescripcionPrograma(
                "El programa permite agregar nombres de mascotas, dandonos la opcion de consultar mascotas /n"
                        + "eliminar mascotas y actualizar.");
        AplicacionArreglo aplicacion = new AplicacionArreglo(5);
        arreglo.setAplicacion(aplicacion);
    }

    public boolean retornar() {
        return true;
    }

}
