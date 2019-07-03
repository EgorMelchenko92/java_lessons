package com.melchenko;

public class Main {

    public static void main(String[] args) {


        int a = 2;
        int b = 10;
        int c = 100;
        int d = 50;

        int countPotatos = a + (int) (Math.random() * b);
        int countPackage = c + (int) (Math.random() * d);

        System.out.println("Random count potatos: " + countPotatos);
        System.out.println("Random count package: " + countPackage);
        //Random number generation

        int countPotatosIntoPackage;

        countPotatosIntoPackage=countPotatos/countPackage;
        System.out.println("Count potatos into package: " + countPotatosIntoPackage);
        System.out.println("Reminder potatos: " + (countPotatos-(countPackage*countPotatosIntoPackage)));
    }
}

