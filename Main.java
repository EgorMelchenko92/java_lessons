package com.melchenko;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        while (true) {


            int number = 1;
            do {

                System.out.println(" ");
                System.out.println("___________________________________________________");
                System.out.println("Number iteration: " + number);
                number++;
                System.out.println("___________________________________________________");

                int maxCountPackage = 10;

                Scanner scanner = new Scanner(System.in);

                System.out.println(" ");

                System.out.println("Please enter count potatos:");
                int countPotatos = scanner.nextInt();

                if (!checkValue(countPotatos)) {
                    System.out.println("This is fiasko brother");
                } else {

                    System.out.println("Please enter size package:");
                    int sizePackage = scanner.nextInt();

                    if (!checkValue(sizePackage)) {
                        System.out.println("This is fiasko brother");
                    } else {

                        int countPackage;

                        countPackage = countPotatos / sizePackage;

                        int countNeedPackage;
                        int countLetters = 33;

                        countNeedPackage = countPackage - maxCountPackage;

                        if (countPackage > maxCountPackage) {
                            System.out.println("This is fiasco brother");
                            System.out.println("Exceeding the maximum number of bags");
                            System.out.println("You are need still package: " + countNeedPackage);
                        } else if (countPackage <= maxCountPackage) {
                            System.out.println("This is good");
                        }

                        System.out.println("Count package: " + countPackage);
                        System.out.println("Reminder potatos: " + (countPotatos - (sizePackage * countPackage)));


                        System.out.println("___________________________________________________");
                        System.out.println("Potatoes packed in the following bags:");
                        System.out.println(" ");

                        //алфавит

                        ArrayList<Character> alphabet = new ArrayList<Character>();
                        for (int i = 0; i < 33; i++) {
                            alphabet.add((char) ('а' + i));
                        }
                        int length = alphabet.size();
                        if (countPackage <= length ) {
                            for (int j = 1; j <= countPackage && j <= length; j++) {
                                System.out.print("[" + j + alphabet.get(j - 1) + "]" + " ");
                            }
                        } else if (countPackage >= length ) {
                            for (int j = 1; j <= countPackage && j <= length; j++) {
                                System.out.print("[" + j + alphabet.get(j - 1) + "]" + " ");
                            }
                            for (int j =length+1; j <= countPackage; j++) {
                                System.out.print(" " + j + "Fiasko" + " ");
                            }
                        }

                    }
                }
            } while (number <= 3);
            break;
        }
        System.out.println(" ");
        System.out.println("Completion of the iteration");
    }


    public static boolean checkValue(int inputValue) {
        return inputValue > 0 && inputValue < 1001;
    }
}