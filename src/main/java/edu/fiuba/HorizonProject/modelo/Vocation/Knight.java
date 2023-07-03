package edu.fiuba.HorizonProject.modelo.Vocation;

import edu.fiuba.HorizonProject.modelo.Vocation.VocationState.SimpleVocationState;
import edu.fiuba.HorizonProject.modelo.Vocation.VocationState.VocationState;

public class Knight extends Vocation {
    public Knight() {
        super(new SimpleVocationState());
    }

    @Override
    public Vocation firstPromotion(Vocation vocation) {
        return this;
    }

    @Override
    public String toString() {
        return vocationState.toString() + "Knight";
    }

}
