package com.melchenko;

public abstract class Transport {

    private int yearsOfIssue;
    private String issueCountry;
    private String color;
    private int count;
    private int countOfWheels;
    private int speed;
    private int costOf;

    public int getYearsOfIssue() {
        return yearsOfIssue;
    }

    public void setYearsOfIssue(int yearsOfIssue) {
        this.yearsOfIssue = yearsOfIssue;
    }

    public String getIssueCountry() {
        return issueCountry;
    }

    public void setIssueCountry(String issueCountry) {
        this.issueCountry = issueCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCostOf() {
        return costOf;
    }

    public void setCostOf(int costOf) {
        this.costOf = costOf;
    }

    public abstract String getName();
    public abstract Boolean getPopular();

    public String getStatus(){
        return " Ready for sale! ";
    }



    @Override
    public String toString() {
        return getName()+" {" +
                "yearsOfIssue=" + yearsOfIssue +
                ", issueCountry='" + issueCountry + '\'' +
                ", color='" + color + '\'' +
                ", count=" + count +
                ", countOfWheels=" + countOfWheels +
                ", speed=" + speed +
                ", costOf=" + costOf +
                "} "+" Popularity: " + getPopular() + ". Status: " + getStatus();
    }
}
