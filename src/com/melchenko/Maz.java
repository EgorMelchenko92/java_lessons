package com.melchenko;

public class Maz extends TruckCars {

    public Maz(int yearsOfIssue,String issueCountry,String color,
                     int count,int countOfWheels,int speed, int costOf,boolean removableBody,int passengerSeats,
               int countOfDoors,String fuel,String gearbox) {
        setYearsOfIssue(yearsOfIssue);
        setIssueCountry(issueCountry);
        setColor(color);
        setCount(count);
        setCountOfWheels(countOfWheels);
        setSpeed(speed);
        setCostOf(costOf);
        setRemovableBody(removableBody);
        setPassengerSeats(passengerSeats);
        setCountOfDoors(countOfDoors);
        setFuel(fuel);
        setGearbox(gearbox);
    }
    public String getName(){
        return "Maz ";
    }
    public Boolean getPopular(){
        return true;
    }
}
