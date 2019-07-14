package com.melchenko;

public class Cat extends Animal{

    public Cat(int age, String color, int weight) {
        this.setAge(age);
        this.setColor(color);
        this.setWeight(weight);
    }

    @Override
    public String toString() {
        return "This is cat " + super.toString();
    }

    @Override
    public String go() {
        return super.go() + "jump";
    }

    @Override
    public String speak() {
        return super.speak() + "meows";
    }

}
