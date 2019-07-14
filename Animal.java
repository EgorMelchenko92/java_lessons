package com.melchenko;

public class Animal {

    private int age;
    private String color;
    private int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String go() {
        return " Go: ";
    }

    public String speak() {
        return " Speak: ";
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}'+go()+speak();
    }
}
