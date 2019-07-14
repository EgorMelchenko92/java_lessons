package com.melchenko;

public class Dog extends Animal{

    public Dog(int age, String color, int weight) {
        this.setAge(age);
        this.setColor(color);
        this.setWeight(weight);
    }

    @Override
    public String toString() {
        return "This is dog " + super.toString();
    }

    @Override
    public String go() {
        return super.go() + "run";
    }

    @Override
    public String speak() {
        return super.speak() + "barks";
    }

}
