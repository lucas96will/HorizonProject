package edu.fiuba.HorizonProject.modelo.Player;

import edu.fiuba.HorizonProject.modelo.Inventory.Inventory;

import edu.fiuba.HorizonProject.modelo.Item.Item;
import edu.fiuba.HorizonProject.modelo.Item.PlayerResource;
import edu.fiuba.HorizonProject.modelo.Map.MapElement;
import edu.fiuba.HorizonProject.modelo.Monster.Monster;
import edu.fiuba.HorizonProject.modelo.Vocation.NoVocation;
import edu.fiuba.HorizonProject.modelo.Vocation.Vocation;

import java.util.List;


public class Player implements MapElement{
    private String name;
    private Vocation vocation;
    private Inventory inventory;
    private int damage;

    public Player(String aName){
        name = aName;
        vocation = new NoVocation();
        inventory = new Inventory();
        damage = 50;
    }

    public void firstPromotion(Vocation aVocation){
        vocation = vocation.firstPromotion(vocation);
    }

    public void secondPromotion(){
        vocation.secondPromotion();
    }

    public Vocation getVocation(){
        return vocation;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", vocation=" + vocation +
                '}';
    }

    public void attack(Monster aMonster){
        aMonster.receiveDamage(damage, inventory);
    }

    public List<Item> getResources(){
        return inventory.playerResources();
    }
}
