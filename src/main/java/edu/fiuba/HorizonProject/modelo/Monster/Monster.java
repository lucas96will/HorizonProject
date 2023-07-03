package edu.fiuba.HorizonProject.modelo.Monster;

import edu.fiuba.HorizonProject.modelo.Inventory.Inventory;
import edu.fiuba.HorizonProject.modelo.Item.Item;
import edu.fiuba.HorizonProject.modelo.Map.MapElement;
import edu.fiuba.HorizonProject.modelo.NPC.NPC;

import java.util.List;

public interface Monster extends MapElement, NPC {
    void receiveDamage(int aDamage, Inventory aPlayerInventory);
}
