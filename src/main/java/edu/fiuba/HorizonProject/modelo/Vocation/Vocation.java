package edu.fiuba.HorizonProject.modelo.Vocation;

import edu.fiuba.HorizonProject.modelo.Vocation.VocationState.VocationState;

public abstract class Vocation {

    protected VocationState vocationState;

    public Vocation(VocationState aVocationState){
        vocationState = aVocationState;
    }
    abstract public Vocation firstPromotion(Vocation vocation); // Choose first vocation (druid, paladin, etc)

    public void secondPromotion(){ // upgrade state vocation
        vocationState = vocationState.secondPromotion();
    }

    abstract public String toString();
}
