package com.melchenko;

public abstract class Bicycles extends Transport{

    private Boolean handbrake;
    private int spareWheel;

    public Boolean getHandbrake() {
        return handbrake;
    }

    public void setHandbrake(Boolean handbrake) {
        this.handbrake = handbrake;
    }

    public int getSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(int spareWheel) {
        this.spareWheel = spareWheel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIndividual properties: " + "1) handbrake - " + getHandbrake() +
                " 2) spare wheel - " + getSpareWheel() + "\n";
    }
}
