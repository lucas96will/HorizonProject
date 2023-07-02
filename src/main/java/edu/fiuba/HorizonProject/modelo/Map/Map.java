package edu.fiuba.HorizonProject.modelo.Map;

import edu.fiuba.HorizonProject.modelo.Terrain.Terrain;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private ArrayList<Terrain> terrenos;
    private List<MapElement> elementos;

    public Map() {
        this.elementos = new ArrayList<>();
        this.terrenos= new ArrayList<>();
    }

    public boolean contiene(MapElement elemento) {
        return elementos.contains(elemento);
    }

    public void agregar(MapElement elemento) {
        this.elementos.add(elemento);
    }
    public void agregarTerreno(Terrain terreno){
        this.terrenos.add(terreno);
    }

    public boolean contieneTerreno(Terrain terreno) {
        return terrenos.contains(terreno);
    }
}
