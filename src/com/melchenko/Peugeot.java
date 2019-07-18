package com.melchenko;

public class Peugeot extends TruckCars {

    public Peugeot(int yearsOfIssue,String issueCountry,String color,
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
        return "Peugeot ";
    }
    public Boolean getPopular(){
        return true;
    }
}
