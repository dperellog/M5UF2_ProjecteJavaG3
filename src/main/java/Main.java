package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static Pila historial;
    private static Pila eliminades;

    private static ArrayList<String> navegacio = new ArrayList<>();

    public static void input() {
        navegacio.addAll(Arrays.asList("a", "b", "<", "c", "d","<",">"));
    }

    public static void main(String[] args) {
        input();

        processaInput();
        
        
    }

    public static String processaInput() {
        String resultat = "";
        String paginaActual = "";

        for (String elemento : navegacio) {
            if (elemento.equals("<")) {
                if (!historial.esBuida()) {
                    paginaActual = historial.desapila();
                } else {
                    System.out.println("No se puede retroceder más en el historial.");
                }
            } else if (elemento.equals(">")) {
                if (!paginaActual.isEmpty()) {
                    historial.apila(paginaActual);
                    paginaActual = "";
                }
            } else {
                historial.apila(paginaActual);
                paginaActual = elemento;
            }
        }

        return paginaActual;
    }

}
