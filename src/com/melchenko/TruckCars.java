package com.melchenko;

public abstract class TruckCars extends Transport {

    private Boolean removableBody;
    private int passengerSeats;
    private int countOfDoors;
    private String fuel;
    private String gearbox;

    public Boolean getRemovableBody() {
        return removableBody;
    }

    public void setRemovableBody(Boolean removableBody) {
        this.removableBody = removableBody;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIndividual properties: " + "1) removable body - " + getRemovableBody() +
                " 2) passenger seats - " + getPassengerSeats() + " 3) count of doors - " + getCountOfDoors() +
                " 4) fuel - " + getFuel() + " 5) gear box - " + getGearbox() + "\n" ;
    }
}
