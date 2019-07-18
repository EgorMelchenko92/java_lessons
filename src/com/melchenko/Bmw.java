package com.melchenko;

public class Bmw extends PassengerCars {

    public Bmw  (int yearsOfIssue,String issueCountry,String color,
                     int count,int countOfWheels,int speed, int costOf,int passengerSeats,
                 int countOfDoors,String fuel,int spareWheel,String gearbox) {
        setYearsOfIssue(yearsOfIssue);
        setIssueCountry(issueCountry);
        setColor(color);
        setCount(count);
        setCountOfWheels(countOfWheels);
        setSpeed(speed);
        setCostOf(costOf);
        setPassengerSeats(passengerSeats);
        setCountOfDoors(countOfDoors);
        setFuel(fuel);
        setSpareWheel(spareWheel);
        setGearbox(gearbox);
    }
    public String getName(){
        return "BMW ";
    }
    public Boolean getPopular(){
        return true;
    }
}
