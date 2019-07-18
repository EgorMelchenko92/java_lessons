package com.melchenko;

public class Renault extends TruckCars {

    public Renault(int yearsOfIssue,String issueCountry,String color,
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
        return "Renault ";
    }
    public Boolean getPopular(){
        return false;
    }
}
