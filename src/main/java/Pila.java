package main.java;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

class Pila {
    
    private List<String> pila;

    public Pila() {
        pila = new ArrayList<>();
    }

    public void apila(String elemento) {
        pila.add(elemento);
    }

    public String desapila() {
        if (pila.isEmpty()) {
            throw new EmptyStackException();
        }
        int indexUltimElement = pila.size() - 1;
        String ultimElement = pila.get(indexUltimElement);
        pila.remove(indexUltimElement);
        return ultimElement;
    }

    public boolean esBuida() {
        return pila.isEmpty();
    }

    public int mida() {
        return pila.size();
    }

    public String AsString() {
        String listAsString = pila.toString();
        return listAsString;
    }
}
