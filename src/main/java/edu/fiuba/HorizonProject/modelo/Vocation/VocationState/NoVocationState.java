package edu.fiuba.HorizonProject.modelo.Vocation.VocationState;

public class NoVocationState implements VocationState {
    @Override
    public VocationState secondPromotion() {
        return this;
    }
}
