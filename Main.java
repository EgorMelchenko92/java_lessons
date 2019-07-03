package com.melchenko;

public class Main {

    public static void main(String[] args) {


        int a = 100;
        int b = 50;
        int c = 2;
        int d = 10;

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

