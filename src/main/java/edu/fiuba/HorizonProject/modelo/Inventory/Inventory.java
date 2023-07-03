package edu.fiuba.HorizonProject.modelo.Inventory;

import edu.fiuba.HorizonProject.modelo.Item.Gold;
import edu.fiuba.HorizonProject.modelo.Item.Item;
import edu.fiuba.HorizonProject.modelo.Item.PlayerResource;
import edu.fiuba.HorizonProject.modelo.Item.Stackable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<Item>();
    }

    public List<Item> playerResources() {
        return items.stream().filter(i -> i instanceof PlayerResource).collect(Collectors.toList());
    }

    public void add(ArrayList<Item> someItems) {

        List<Item> addedItems = new ArrayList<>();
        for(Item anItem : someItems){
            if(!items.contains(anItem)){
                items.add(anItem);
                addedItems.add(anItem);
            }
        }
        someItems.removeAll(addedItems);

        List<Item> stackableItems = items.stream().filter(i -> i instanceof Stackable).collect(Collectors.toList());
        stackableItems.forEach(i ->
                someItems.forEach(j ->
                        ((Stackable)i).add(j))
        );


        items.addAll(someItems); // add all non stackable items

    }
}
