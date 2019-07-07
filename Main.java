package com.melchenko;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[] {"a","б","в","г","д","е","ё","ж","з","и",
                "й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ъ","ы","ь","э","ю","я"};
        int length = array.length;


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

                                if (countPackage<=length) {
                                    for (int i = 1; i <= countPackage && i <= length; i++) {
                                        System.out.print(i + array[i - 1] + " " );
                                    }
                                } else if ( countPackage>=34 ){
                                    for ( int i = 1; i <= countPackage && i <= length; i++ ){
                                        System.out.print( i + array[i - 1] + " " );
                                    } for (int j =34; j <= countPackage; j++) {
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