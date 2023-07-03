package edu.fiuba.HorizonProject.modelo.Vocation;

import edu.fiuba.HorizonProject.modelo.Vocation.VocationState.NoVocationState;

public class NoVocation extends Vocation {

    public NoVocation(){
        super(new NoVocationState());
    }

    @Override
    public Vocation firstPromotion(Vocation vocation) {
        if(!vocation.equals(this)){
            return vocation;
        }
        return this;
    }

    @Override
    public String toString() {
        return vocationState.toString() + "No Vocation";
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }
}
