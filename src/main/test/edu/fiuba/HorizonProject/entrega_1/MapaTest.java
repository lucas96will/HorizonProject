package edu.fiuba.HorizonProject.entrega_1;

import edu.fiuba.HorizonProject.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapaTest {

    @Test
    public void test01MapaPuedeIniciarseCorrectamente() {
        Mapa mapa = new Mapa();

        boolean contieneJugador = mapa.contiene(new Jugador());

        assertFalse(contieneJugador);
    }

    @Test
    public void test01MapaInicialNoTieneJugadores() {
        Mapa mapa = new Mapa();

        boolean contieneJugador = mapa.contiene(new Jugador());

        assertFalse(contieneJugador);
    }

    @Test
    public void test01MapaConJugadorTieneJugador() {
        Mapa mapa = new Mapa();

        Jugador jugador = new Jugador();
        mapa.agregar(jugador);

        boolean contieneJugador = mapa.contiene(jugador);

        assertTrue(contieneJugador);
    }

    @Test
    public void test01MapaConDosJugadorEsCorrecto() {
        Mapa mapa = new Mapa();

        Jugador jugadorUno = new Jugador();
        Jugador jugadorDos = new Jugador();
        mapa.agregar(jugadorUno);
        mapa.agregar(jugadorDos);

        boolean contieneJugadorUno = mapa.contiene(jugadorUno);
        boolean contieneJugadorDos = mapa.contiene(jugadorDos);

        assertTrue(contieneJugadorUno);
        assertTrue(contieneJugadorDos);

    }

    @Test
    public void test01MapaSinNpcEsCorrecto() {
        Mapa mapa = new Mapa();

        //NPC npc = new NPCGuide();
        //mapa.agregar(npc);

        boolean contieneNpc = mapa.contiene(new NPCGuide());

        assertFalse(contieneNpc);
    }

    @Test
    public void test01MapaConNpcEsCorrecto() {
        Mapa mapa = new Mapa();

        NPC npc = new NPCGuide();
        mapa.agregar(npc);

        boolean contieneNpc = mapa.contiene(npc);

        assertTrue(contieneNpc);
    }

    @Test
    public void test01MapaSinMonstersEsCorrecto() {
        Mapa mapa = new Mapa();

        boolean contieneNpc = mapa.contiene(new Monster());

        assertFalse(contieneNpc);
    }

    @Test
    public void test01MapaConVariosMonstersEsCorrecto() {
        Mapa mapa = new Mapa();

        NPC barbarian = new Monster();
        NPC skeleton = new Monster();
        NPC ghost = new Monster();

        mapa.agregar(barbarian);
        mapa.agregar(skeleton);
        mapa.agregar(ghost);

        boolean contieneBarbarian = mapa.contiene(barbarian);
        boolean contieneSkeleton = mapa.contiene(skeleton);
        boolean contieneGhost = mapa.contiene(ghost);


        assertTrue(contieneBarbarian);
        assertTrue(contieneSkeleton);
        assertTrue(contieneGhost);

    }

    @Test
    public void test01MapaSinTerrenoHabitableEsCorrecto() {
        Mapa mapa = new Mapa();

        boolean contieneTerrenoHabitable = mapa.contieneTerreno(new TerrenoHabitable());

        assertFalse(contieneTerrenoHabitable);
    }

    @Test
    public void test01MapaConTerrenoHabitableEsCorrecto() {
        Mapa mapa = new Mapa();

        Terreno terrenoHabitable = new TerrenoHabitable();
        mapa.agregarTerreno(terrenoHabitable);

        boolean contieneTerrenoHabitable = mapa.contieneTerreno(terrenoHabitable);

        assertTrue(contieneTerrenoHabitable);
    }

    @Test
    public void test01MapaSinTerrenoNoHabitableEsCorrecto() {
        Mapa mapa = new Mapa();

        boolean contieneTerrenoNoHabitable = mapa.contieneTerreno(new TerrenoNoHabitable());

        assertFalse(contieneTerrenoNoHabitable);
    }

    
}
