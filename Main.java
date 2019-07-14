package com.melchenko;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nGood day! This is homework number four.\n");

        Dog myDog = new Dog(10, "Black",15);
        System.out.println(myDog.toString());
        Cat myCat = new Cat(5,"White",3);
        System.out.println(myCat.toString());
        Snake mySnake = new Snake(2,"Grey",5);
        System.out.println(mySnake.toString());
        Bird myBird = new Bird(3,"Blue",2);
        System.out.println(myBird.toString());

    }
}
