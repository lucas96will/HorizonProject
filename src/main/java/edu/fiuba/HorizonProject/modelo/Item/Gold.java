package edu.fiuba.HorizonProject.modelo.Item;

import edu.fiuba.HorizonProject.modelo.Player.Player;

public class Gold extends Item implements Stackable, PlayerResource {
    private int amount;

    public Gold(int anAmount){
        if(anAmount < 0){
            throw new RuntimeException("Error: less than zero gold created");
        }
        amount = anAmount;
    }


    @Override
    public void add(Item anItem) {
        if(getClass().equals(anItem.getClass())){
            amount += ((Gold) anItem).amount;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Gold another = (Gold) obj;
        return amount == another.amount;
    }
}
