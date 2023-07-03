package edu.fiuba.HorizonProject.modelo.Vocation.VocationState;

public class SimpleVocationState implements VocationState {
    @Override
    public VocationState secondPromotion() {
        return new EliteVocationState();
    }
}
