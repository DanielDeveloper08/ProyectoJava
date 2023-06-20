package Busqueda;

import Arreglos.AplicacionArreglo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import main.ClaseGenerica;
import main.ProyectoPrimerParcial;

public class Busqueda {

    private static Scanner scanner = new Scanner(System.in);
    ClaseGenerica busqueda = new ClaseGenerica();

    public Busqueda() {
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
        System.out.println("               BUSQUEDA                 ");
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
        app.ejecutar();
    }

    private void seteoData() {
        busqueda.setDefinicion("\n*******************************************************\n"
                + "\nINFORMACION DE BUSQUEDA Y TIPOS DE BUSQUEDA\n"
                + "-------------------------------------------\n"
                + "La busqueda es un proceso utilizado para encontrar la presencia y ubicacion de un elemento especifico dentro de un conjunto de datos.\n"
                + "\n"
                + "TIPO DE BUSQUEDA SECUENCIAL\n"
                + "---------------------------\n"
                + "La busqueda secuencial, tambien conocida como busqueda lineal, consiste en recorrer secuencialmente cada elemento del conjunto de datos hasta encontrar el elemento buscado.\n"
                + "Si el elemento es encontrado, se devuelve su posicion o indice en el conjunto de datos. Si el elemento no se encuentra, se devuelve un valor especial indicando la ausencia.\n"
                + "\n"
                + "TIPO DE BUSQUEDA BINARIA\n"
                + "-------------------------\n"
                + "La busqueda binaria es un algoritmo eficiente utilizado para buscar un elemento en un conjunto de datos ordenados de forma ascendente o descendente.\n"
                + "Este algoritmo divide repetidamente el conjunto de datos a la mitad, comparando el elemento buscado con el elemento central.\n"
                + "Si el elemento central es igual al elemento buscado, se devuelve su posicion. Si el elemento central es mayor o menor al elemento buscado, la busqueda continua en la mitad correspondiente del conjunto de datos.\n"
                + "Este proceso se repite hasta encontrar el elemento buscado o determinar que no esta presente en el conjunto de datos.");

        busqueda.setAlgoritmo("\n*******************************************************\n "
                + "\nBusqueda Secuencial:\n"
                + "1. Recorrer cada elemento del arreglo uno por uno.\n"
                + "2. Comparar el elemento actual con el elemento buscado.\n"
                + "3. Si los elementos coinciden, se ha encontrado el elemento buscado.\n"
                + "   - Devolver la posicion actual del elemento (indice).\n"
                + "4. Si se ha recorrido todo el arreglo sin encontrar el elemento, el elemento no esta presente.\n"
                + "   - Devolver un valor especial (por ejemplo, -1) para indicar que no se encontro el elemento.\n\n"
                + "Busqueda Binaria (en un arreglo ordenado de forma ascendente o descendente):\n"
                + "1. Establecer el inicio y el fin del intervalo de busqueda.\n"
                + "   - Inicio = 0, Fin = longitud del arreglo - 1.\n"
                + "2. Mientras el inicio sea menor o igual al fin:\n"
                + "   - Calcular el punto medio del intervalo: Medio = (Inicio + Fin) / 2.\n"
                + "3. Comparar el elemento medio del intervalo con el elemento buscado.\n"
                + "4. Si los elementos coinciden, se ha encontrado el elemento buscado.\n"
                + "   - Devolver la posicion del elemento medio.\n"
                + "5. Si el elemento medio es menor que el elemento buscado:\n"
                + "   - El elemento esta en la mitad superior del intervalo.\n"
                + "     - Actualizar el inicio del intervalo: Inicio = Medio + 1.\n"
                + "6. Si el elemento medio es mayor que el elemento buscado:\n"
                + "   - El elemento esta en la mitad inferior del intervalo.\n"
                + "     - Actualizar el fin del intervalo: Fin = Medio - 1.\n"
                + "7. Repetir los pasos 2 a 6 hasta que el elemento sea encontrado o el intervalo se reduzca a cero.\n"
                + "8. Si se ha recorrido todo el intervalo sin encontrar el elemento, el elemento no esta presente.\n"
                + "   - Devolver un valor especial (por ejemplo, -1) para indicar que no se encontro el elemento.");

        busqueda.setDescripcionPrograma("\n ===== DESCRIPCION DEL PROGRAMA =====\n"
                + "El programa permite realizar la busqueda de una pelicula, \n"
                + "seleccionando el tipo de busqueda que queremos realizar(Secuencial o Binaria)");

        AplicacionBusqueda aplicacion = new AplicacionBusqueda();
        busqueda.setAplicacion(aplicacion);
    }
}
