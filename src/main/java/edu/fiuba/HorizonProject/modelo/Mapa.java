package edu.fiuba.HorizonProject.modelo;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private ArrayList<Terreno> terrenos;
    private List<ElementoMapa> elementos;

    public Mapa() {
        this.elementos = new ArrayList<>();
        this.terrenos= new ArrayList<>();
    }

    public boolean contiene(ElementoMapa elemento) {
        return elementos.contains(elemento);
    }

    public void agregar(ElementoMapa elemento) {
        this.elementos.add(elemento);
    }
    public void agregarTerreno(Terreno terreno){
        this.terrenos.add(terreno);
    }

    public boolean contieneTerreno(Terreno terreno) {
        return terrenos.contains(terreno);
    }
}
