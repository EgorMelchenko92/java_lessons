package com.melchenko;

public class Bird extends Animal{

    public Bird(int age, String color, int weight) {
        this.setAge(age);
        this.setColor(color);
        this.setWeight(weight);
    }

    @Override
    public String toString() {
        return "This is bird " + super.toString();
    }

    @Override
    public String go() {
        return super.go() + "fly";
    }

    @Override
    public String speak() {
        return super.speak() + "chirps";
    }

}
