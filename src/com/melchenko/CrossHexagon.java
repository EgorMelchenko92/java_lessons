package com.melchenko;

public class CrossHexagon extends Bicycles {

    public CrossHexagon(int yearsOfIssue,String issueCountry,String color,
                     int count,int countOfWheels,int speed, int costOf,boolean handbrake,
                        int spareWheel) {
        setYearsOfIssue(yearsOfIssue);
        setIssueCountry(issueCountry);
        setColor(color);
        setCount(count);
        setCountOfWheels(countOfWheels);
        setSpeed(speed);
        setCostOf(costOf);
        setHandbrake(handbrake);
        setSpareWheel(spareWheel);
    }
    public String getName(){
        return "Cross Hexagon ";
    }
    public Boolean getPopular(){
        return true;
    }
}
