package com.melchenko;

public abstract class PassengerCars extends Transport {

    private int passengerSeats;
    private int countOfDoors;
    private String fuel;
    private int spareWheel;
    private String gearbox;

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

    public int getSpareWheel() {
        return spareWheel;
    }

    public void setSpareWheel(int spareWheel) {
        this.spareWheel = spareWheel;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIndividual properties: " + " 1) passenger seats - " + getPassengerSeats() + " 2) count of doors - " + getCountOfDoors() +
                " 3) fuel - " + getFuel() + " 4) spare wheel - " + getSpareWheel() + " 5) gear box - " + getGearbox() + "\n";
    }
}
