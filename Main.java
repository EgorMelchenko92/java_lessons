package com.melchenko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter count potatos:");
        int countPotatos = scanner.nextInt();

        System.out.println("Please enter count package:");
        int countPackage = scanner.nextInt();

        int countPotatosIntoPackage;

        countPotatosIntoPackage=countPotatos/countPackage;
        System.out.println("Count potatos into package: " + countPotatosIntoPackage);
        System.out.println("Reminder potatos: " + (countPotatos-(countPackage*countPotatosIntoPackage)));
    }
}

