package com.melchenko;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static int countPackage;

    public static void main(String[] args) {

        int number = 1;

        while (true) {
            do {
                System.out.println("\n___________________________________________________");
                System.out.println("Iteration number:\t" + number);
                number++;
                System.out.println("___________________________________________________");
                dataInput();
            }
            while (number <= 3);//счетчик итерации
            break;
        }
        System.out.println("\n\nCompletion of the iteration");
    }

    private static void dataInput() {

        int maxCountPackage = 33;

        try {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPlease enter the quantity of potatoes:\t");
        int countPotatos = scanner.nextInt();

        if (!(countPotatos > 0 && countPotatos < 1000)) {//проверка валидности вводимого значения
            System.out.print("This is a brother fiasco, enter a valid amount of potatoes\n");
        } else {

            System.out.print("Please enter package size:\t");
            int sizePackage = scanner.nextInt();

            if (!(sizePackage > 0 && sizePackage < 1000)) {//проверка валидности вводимого значения
                System.out.println("This is fiasko brother,  enter a valid amount of packages");
            } else {

                countPackage = countPotatos / sizePackage;

                int countNeedPackage;
                int countLetters = 33;

                countNeedPackage = countPackage - maxCountPackage;

                if (countPackage > maxCountPackage) {
                    System.out.println("This is fiasco brother");
                    System.out.println("Exceeding the maximum amount of packages");
                    System.out.println("You are need still packages:\t" + countNeedPackage);
                    System.out.println("You are need more letters:\t" + (countPackage - countLetters));
                } else if (countPackage <= maxCountPackage) {
                    System.out.println("This is good");
                }

                System.out.println("Number of packages:\t" + countPackage);
                System.out.println("Potato residue:\t" + (countPotatos - (sizePackage * countPackage)));


                System.out.println("___________________________________________________");
                System.out.println("Potatoes packed in the following packages:\n");
                WorkWhithArray();
            }
        }
        } catch (InputMismatchException ime){
            System.out.println("Check input!");//проверка вводимых данных(только цифры)
        }
        catch (ArithmeticException e){//арифметическая проверка(деление на 0 и т.д.)
            System.out.println("Arithmetic check!");
        }
    }

    private static void WorkWhithArray() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < 33; i++) { //инициализация алфавита
            alphabet.add((char) ('а' + i));
        }
        int length = alphabet.size();
        if (countPackage <= length) {
            for (int j = 1; j <= countPackage && j <= length; j++) {
                System.out.print("[" + j + alphabet.get(j - 1) + "]\t");
            }
        } else if (countPackage >= length) {
            for (int j = 1; j <= countPackage && j <= length; j++) {
                System.out.print("[" + j + alphabet.get(j - 1) + "]\t");
            }
            for (int j = length + 1; j <= countPackage; j++) {
                System.out.print("[" + j + "Fiasko" + "]\t");
            }
        }
    }
}






