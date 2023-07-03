package edu.fiuba.HorizonProject.modelo.Monster;

import edu.fiuba.HorizonProject.modelo.Inventory.Inventory;
import edu.fiuba.HorizonProject.modelo.Item.Gold;
import edu.fiuba.HorizonProject.modelo.Item.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Skeleton implements Monster {

    private ArrayList<Item> items;
    private int hitPoints;

    public Skeleton() {
        hitPoints = 30;
        items = new ArrayList<Item>(Arrays.asList(new Gold(100)));
    }

    @Override
    public void receiveDamage(int aDamage, Inventory aPlayerInventory) {
        if(hitPoints <= 0){
            return; //already dead beforehand
        }
        hitPoints -= aDamage;
        if(hitPoints <= 0) {
            aPlayerInventory.add(items);
        }
    }
}
