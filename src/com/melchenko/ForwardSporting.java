package com.melchenko;

public class ForwardSporting extends Bicycles {

    public ForwardSporting(int yearsOfIssue,String issueCountry,String color,
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
        return "Forward Sporting ";
    }
    public Boolean getPopular(){
        return false;
    }
}
