package edu.fiuba.HorizonProject.modelo.Vocation;

import edu.fiuba.HorizonProject.modelo.Vocation.VocationState.SimpleVocationState;

public class Druid extends Vocation {

    public Druid(){
        super(new SimpleVocationState());
    }
    @Override
    public Vocation firstPromotion(Vocation vocation) {
        return this;
    }

    @Override
    public String toString() {
        return vocationState.toString() + "Druid";
    }

}
