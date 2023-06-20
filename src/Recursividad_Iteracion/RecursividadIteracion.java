package Recursividad_Iteracion;

import java.util.InputMismatchException;
import java.util.Scanner;

import main.ClaseGenerica;
import main.ProyectoPrimerParcial;

/**
 *
 * author danny
 */
public class RecursividadIteracion {

    private static Scanner scanner = new Scanner(System.in);
    ClaseGenerica recursividad = new ClaseGenerica();

    public RecursividadIteracion() {
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
        System.out.println("       RECURSIVIDAD E ITERACION         ");
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
        System.out.println(recursividad.getDefinicion());
    }

    private void mostrarAlgoritmo() {
        System.out.println(recursividad.getAlgoritmo());
    }

    private void mostrarPruebaDeEscritorio() {
         PruebaEscritorioRecursividadIteracion app = (PruebaEscritorioRecursividadIteracion) recursividad.getPruebaEscritorio();
        app.ejecutarPrueba();
    }

    private void mostrarDescripcionDelPrograma() {
        System.out.println(recursividad.getDescripcionPrograma());
    }

    private void mostrarAplicacion() {
        AplicacionRecursividadIteracion app = (AplicacionRecursividadIteracion) recursividad.getAplicacion();
        app.ejecutar();
    }

    private void seteoData() {
        recursividad.setDefinicion(
                "La recursividad es la capacidad de una funcion o procedimiento para llamarse a si mismo dentro de su propia definicion. En otras palabras es aquella funcion que se invoca a si misma durante su ejecucion.");
        recursividad.setAlgoritmo("El algoritmo de la recursividad se puede describir en los siguientes pasos:\n"
                + "\n"
                + "1. Declaracion de la funcion: Se define la funcion recursiva, esta debera tener un caso base, que es una condicion en la cual la recursion se detiene y se devuelve un resultado o realiza otra accion especifica.\n"
                + "2. Verificar si la condicion base se cumple: debemos confirmar que la condicion aplicada detiene la recursion ya que si no es asi se producira un bucle infinito.\n"
                + "3. Volver a llamar a la funcion: si la condicion base aun no se cumple debemos llamar otra vez a la misma funcion para aplicar recursividad\n"
                + "4. Ajustar parametros: en cada llamada a la funcion recursiva debemos ajustar los parametros que reciba para que se acerque cada vez mas a la condicion base.\n"
                + "5. Devolver el resultado.\n");
        recursividad.setDescripcionPrograma(
                "\n ===== DESCRIPCION DEL PROGRAMA =====\n"
                + "El programa permite calcular el factorial de un numero usando iteracion,\n"
                +"o tambien nos permite calcular el Fibonacci de un numero por recursividad");
        
        PruebaEscritorioRecursividadIteracion test = new PruebaEscritorioRecursividadIteracion();
        recursividad.setPruebaEscritorio(test);
        AplicacionRecursividadIteracion aplicacion = new AplicacionRecursividadIteracion();
        recursividad.setAplicacion(aplicacion);
    }
}
