package main.java;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        processaInputresultat(args[0]);
    }

    public static List<Pila> processaInputresultat(String navegacio) {
        Pila endevant = new Pila();
        Pila enderrera = new Pila();
        List<String> historial = new ArrayList<>();

        for (int i = 0; i < navegacio.length(); i++) {
            historial.add(String.valueOf(navegacio.charAt(i)));
        }
        System.out.println(historial);
        for (int i = 0; i < historial.size(); i++) {
            String actual = historial.get(i);
            if (actual.equals(">")) { //endevant
                if (!endevant.esBuida()) {
                    enderrera.apila(endevant.desapila());
                }
            } else if (actual.equals("<")) {
                if (!enderrera.esBuida()) {
                    endevant.apila(enderrera.desapila());
                }
            }
            else {
                enderrera.apila(actual);
                if (!endevant.esBuida()) {
                    endevant = new Pila();
                }
            }
        }

        System.out.println("endevant " + endevant.AsString());
        System.out.println("endarrera: " + enderrera.AsString());

        List<Pila> browserHistory = new ArrayList<>();
        browserHistory.add(endevant);
        browserHistory.add(enderrera);

        return browserHistory;
    }

}
