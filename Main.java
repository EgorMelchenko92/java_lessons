package com.melchenko;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = null;

        try {

            scanner = new Scanner(new File("src/in.txt"));

            int countPotatos = scanner.nextInt();
            int countPackage = scanner.nextInt();
            
            int countPotatosIntoPackage = countPotatos/countPackage;

            System.out.println("Count potatos: " + countPotatos);
            System.out.println("Count package: " + countPackage);
            System.out.println("Count potatos into package: " + countPotatosIntoPackage);
            System.out.println("Reminder potatos: " + (countPotatos-(countPotatosIntoPackage*countPackage)));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

