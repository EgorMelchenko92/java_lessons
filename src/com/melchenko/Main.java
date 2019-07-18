package com.melchenko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease, select a mode of transport:\n\n"
                + "1 - Truck cars\t"
                + "2 - Passenger cars\t"
                + "3 - Bicycle\n");

        System.out.print("------------Enter number here-----------------\n");

        int selection = 0;
        int i = 0;
        while (i < 10) {
            selection = scanner.nextInt();


            switch (selection) {
                case 1: {
                    if (selection == 1) {
                        System.out.println("\nList of trucks:\n");
                        Maz maz = new Maz(2015, "Germany", "Blue", 10, 4, 130, 30000,
                                false, 2, 2, "Diesel", "Mechanical");
                        System.out.println(maz.toString());
                        Renault renault = new Renault(2014, "French", "Green", 15, 4, 120,
                                27000, true, 1, 2, "Petrol", "Mechanical");
                        System.out.println(renault.toString());
                        Peugeot peugeot = new Peugeot(2013, "Italy", "Yellow", 7, 4, 100,
                                21000, true, 1, 2, "Diesel", "Mechanical");
                        System.out.println(peugeot.toString());
                    }
                }
                case 2: {
                    if (selection == 2) {
                        System.out.println("\nList of passenger cars:\n");
                        Mercedes mercedes = new Mercedes(2017, "Germany", "Black", 5, 4, 200,
                                93000, 3, 4, "Petrol", 1, "Auto");
                        System.out.println(mercedes.toString());
                        Bmw bmw = new Bmw(2018, "Germany", "Gray", 7, 4, 210, 95000,
                                4, 4, "Petrol", 1, "Auto");
                        System.out.println(bmw.toString());
                        Nissan nissan = new Nissan(2016, "Greece", "Red", 9, 4, 180, 64000,
                                3, 4, "Diesel", 0, "Mechanical");
                        System.out.println(nissan.toString());
                    }
                }
                case 3: {
                    if (selection == 3) {
                        System.out.println("\nList of bicycles:\n");
                        AistRocky aistRocky = new AistRocky(2017, "Belarus", "Black", 5, 2, 100,
                                1500, true, 0);
                        System.out.println(aistRocky.toString());
                        CrossHexagon crossHexagon = new CrossHexagon(2019, "Germany", "Gray", 4, 2,
                                130, 3000, true, 2);
                        System.out.println(crossHexagon.toString());
                        ForwardSporting forwardSporting = new ForwardSporting(2018, "Belgium", "Blue", 8,
                                2, 110, 2500, false, 2);
                        System.out.println(forwardSporting.toString());
                    }
                }
                default: {
                    if (selection != 1 && selection != 2 && selection != 3) {
                        System.out.println("Input error, please, try again!\n");
                    }
                }
            }
            System.out.println("________________________________________________________________________________________" +
                    "________________________________________________________________________________");
            System.out.println("\nPlease, select a mode of transport:\n\n"
                    + "1 - Truck cars\t"
                    + "2 - Passenger cars\t"
                    + "3 - Bicycle\n");

            System.out.print("------------Enter number here-----------------\n");
        }
    }
    }

