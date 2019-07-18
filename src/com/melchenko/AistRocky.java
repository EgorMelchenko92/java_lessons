package com.melchenko;

public class AistRocky extends Bicycles {

    public AistRocky(int yearsOfIssue,String issueCountry,String color,
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
        return "Aist Rocky ";
    }
    public Boolean getPopular(){
        return true;
    }

}
