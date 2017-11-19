package com.example.state_example;


public class ContextState {
    private StateElement stateElement = new FluidStateElement();
    private int cycleCounter = 1;

    public void getState() {
        System.out.println(stateElement.getState());
        changeStateOfElement();
    }

    private void changeStateOfElement() {
        if (stateElement instanceof FluidStateElement) {
            stateElement = new GasStateElement();
        } else if (stateElement instanceof GasStateElement && cycleCounter%2==1) {
            stateElement = new SolidStateElement();
        } else if(stateElement instanceof GasStateElement && cycleCounter%2==0){
            stateElement = new PlasmaStateElement();
        } else if (stateElement instanceof SolidStateElement) {
            stateElement = new PlasmaStateElement();
        } else {
            stateElement = new FluidStateElement();
            cycleCounter++;
        }

    }


}
