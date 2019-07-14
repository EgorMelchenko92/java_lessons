package com.melchenko;

public class Snake extends Animal {

    public Snake(int age, String color, int weight) {
        this.setAge(age);
        this.setColor(color);
        this.setWeight(weight);
    }

    @Override
    public String toString() {
        return "This is snake " + super.toString();
    }

    @Override
    public String go() {
        return super.go() + "crowl";
    }

    @Override
    public String speak() {
        return super.speak() + "hissing";
    }

}
