package edu.fiuba.HorizonProject.modelo;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private List<ElementoMapa> elementos;

    public Mapa() {
        this.elementos = new ArrayList<>();
    }

    public boolean contiene(ElementoMapa elemento) {
        return elementos.contains(elemento);
    }

    public void agregar(ElementoMapa elemento) {
        this.elementos.add(elemento);
    }
}
