package edu.fiuba.HorizonProject.entrega_1;

import edu.fiuba.HorizonProject.modelo.Player.Player;
import edu.fiuba.HorizonProject.modelo.Map.Map;
import edu.fiuba.HorizonProject.modelo.NPC.NPC;
import edu.fiuba.HorizonProject.modelo.NPC.Oracle;
import edu.fiuba.HorizonProject.modelo.Terrain.Terrain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapaTest {

    @Test
    public void test01MapaPuedeIniciarseCorrectamente() {
        Map mapa = new Map();

        boolean contieneJugador = mapa.contiene(new Player());

        assertFalse(contieneJugador);
    }

    @Test
    public void test01MapaInicialNoTieneJugadores() {
        Map mapa = new Map();

        boolean contieneJugador = mapa.contiene(new Player());

        assertFalse(contieneJugador);
    }

    @Test
    public void test01MapaConJugadorTieneJugador() {
        Map mapa = new Map();

        Player jugador = new Player();
        mapa.agregar(jugador);

        boolean contieneJugador = mapa.contiene(jugador);

        assertTrue(contieneJugador);
    }

    @Test
    public void test01MapaConDosJugadorEsCorrecto() {
        Map mapa = new Map();

        Player jugadorUno = new Player();
        Player jugadorDos = new Player();
        mapa.agregar(jugadorUno);
        mapa.agregar(jugadorDos);

        boolean contieneJugadorUno = mapa.contiene(jugadorUno);
        boolean contieneJugadorDos = mapa.contiene(jugadorDos);

        assertTrue(contieneJugadorUno);
        assertTrue(contieneJugadorDos);

    }

    @Test
    public void test01MapaSinNpcEsCorrecto() {
        Map mapa = new Map();

        //NPC npc = new NPCGuide();
        //mapa.agregar(npc);

        boolean contieneNpc = mapa.contiene(new Oracle());

        assertFalse(contieneNpc);
    }

    @Test
    public void test01MapaConNpcEsCorrecto() {
        Map mapa = new Map();

        NPC npc = new Oracle();
        mapa.agregar(npc);

        boolean contieneNpc = mapa.contiene(npc);

        assertTrue(contieneNpc);
    }





    @Test
    public void test01MapaSinTerrenoHabitableEsCorrecto() {
        Map mapa = new Map();

        boolean contieneTerrenoHabitable = mapa.contieneTerreno(new Terrain());

        assertFalse(contieneTerrenoHabitable);
    }

    @Test
    public void test01MapaConTerrenoHabitableEsCorrecto() {
        Map mapa = new Map();

        Terrain terrenoHabitable = new Terrain();
        mapa.agregarTerreno(terrenoHabitable);

        boolean contieneTerrenoHabitable = mapa.contieneTerreno(terrenoHabitable);

        assertTrue(contieneTerrenoHabitable);
    }

    @Test
    public void test01MapaSinTerrenoNoHabitableEsCorrecto() {
        Map mapa = new Map();

        boolean contieneTerrenoNoHabitable = mapa.contieneTerreno(new Terrain());

        assertFalse(contieneTerrenoNoHabitable);
    }
}
