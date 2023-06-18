
package main;

public class ClaseGenerica<T> {
     private String definicion;
    private String algoritmo;
    private String pruebaEscritorio;
    private String descripcionPrograma;
    private T aplicacion;

    public ClaseGenerica(String definicion, String algoritmo, String pruebaEscritorio, String descripcionPrograma, T aplicacion) {
        this.definicion = definicion;
        this.algoritmo = algoritmo;
        this.pruebaEscritorio = pruebaEscritorio;
        this.descripcionPrograma = descripcionPrograma;
        this.aplicacion = aplicacion;
    }
    
    public ClaseGenerica(){}

     public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public String getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(String algoritmo) {
        this.algoritmo = algoritmo;
    }

    public String getPruebaEscritorio() {
        return pruebaEscritorio;
    }

    public void setPruebaEscritorio(String pruebaEscritorio) {
        this.pruebaEscritorio = pruebaEscritorio;
    }

    public String getDescripcionPrograma() {
        return descripcionPrograma;
    }

    public void setDescripcionPrograma(String descripcionPrograma) {
        this.descripcionPrograma = descripcionPrograma;
    }

    public T getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(T aplicacion) {
        this.aplicacion = aplicacion;
    }
}
