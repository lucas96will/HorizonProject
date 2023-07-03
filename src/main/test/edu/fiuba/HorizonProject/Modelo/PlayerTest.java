package edu.fiuba.HorizonProject.Modelo;

import edu.fiuba.HorizonProject.modelo.Item.Gold;
import edu.fiuba.HorizonProject.modelo.Item.Item;
import edu.fiuba.HorizonProject.modelo.Monster.Monster;
import edu.fiuba.HorizonProject.modelo.Monster.Skeleton;
import edu.fiuba.HorizonProject.modelo.Player.Player;
import edu.fiuba.HorizonProject.modelo.Vocation.NoVocation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void test01PlayerStartsWithNoVocationCorrectly() {
        Player aPlayer = new Player("Lucas");

        assertEquals(new NoVocation(), aPlayer.getVocation());
    }

    @Test
    public void test02PlayerStartsWithNoGoldCorrectly() {
        Player aPlayer = new Player("Lucas");

        List<Item> playerResources = aPlayer.getResources();

        List<Item> availablePlayerResources = new ArrayList<>(
                Arrays.asList(
                        new Gold(0)
                )
        );

        for(Item aResource : availablePlayerResources){
            assertFalse(playerResources.contains(aResource));
        }
    }

    @Test
    public void test03PlayerKillsSkeletonAndGainsResourcesCorrectly() {
        Player aPlayer = new Player("Lucas");
        Monster aSkeleton = new Skeleton();

        aPlayer.attack(aSkeleton);

        List<Item> playerResources = aPlayer.getResources();

        assertFalse(playerResources.isEmpty());
        assertTrue(playerResources.contains(new Gold(100)));
    }

}
