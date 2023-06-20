package Busqueda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacionBusqueda {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        List<String> peliculas = new ArrayList<>();
        peliculas.add("El Padrino");
        peliculas.add("Pulp Fiction");
        peliculas.add("El Senor de los Anillos");
        peliculas.add("La La Land");
        peliculas.add("Titanic");
        
        System.out.println("\n***********************************\n");
        System.out.println("Lista de peliculas: " + peliculas);

        // Solicitar la pelicula a buscar
        System.out.print("Ingrese el nombre de la pelicula a buscar: ");
        String peliculaBuscada = scanner.nextLine();

        // Solicitar el metodo de busqueda
        System.out.print("Seleccione el metodo de busqueda (1: Secuencial, 2: Binaria): ");
        int metodo = scanner.nextInt();

        int resultado = -1; // Variable para almacenar el resultado de la busqueda

        switch (metodo) {
            case 1:
                resultado = busquedaSecuencial(peliculas, peliculaBuscada);
                break;
            case 2:
                resultado = busquedaBinaria(peliculas, peliculaBuscada);
                break;
            default:
                System.out.println("Opcion invalida. El metodo de busqueda seleccionado no es valido.\n");
        }

        if (resultado == -1) {
            System.out.println("\nLa pelicula '" + peliculaBuscada + "' no se encuentra en la lista.\n");
        } else {
            System.out.println("\nLa pelicula '" + peliculaBuscada + "' se encuentra en la posicion " + resultado + ".\n");
        }
    }

    // Metodo de busqueda secuencial
    public static int busquedaSecuencial(List<String> lista, String elemento) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1; // Elemento no encontrado
    }

    // Metodo de busqueda binaria
    public static int busquedaBinaria(List<String> lista, String elemento) {
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            int comparacion = lista.get(medio).compareToIgnoreCase(elemento);
            if (comparacion == 0) {
                return medio;
            } else if (comparacion < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1; // Elemento no encontrado
    }
}
