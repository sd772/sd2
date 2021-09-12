package com.suraksha.javacore2021aug.day006;

public class Conditionalstatement {

    public static void main(String[] args) {

        // Conditional (IF) Statement

        System.out.println("\nif Statement");
        String nameOfCountry = "germany";

        if (nameOfCountry == "Nepal" || nameOfCountry == "India" || nameOfCountry == "China") {
            System.out.println(nameOfCountry = "  is in Asia ");

        } else {
            System.out.println(nameOfCountry + " is not in Europe " );
        }



        //switch case statement

        System.out.println("\n Month of year : using switch case statement");

        Integer monthofyear = 3;
            switch (monthofyear) {
                case 1:
                    System.out.println("january");
                    break;
                case 2:
                    System.out.println("february");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                default:
                    System.out.println(monthofyear + "is not a valid month of a year. The valid range is from 1 to 4");


            }
    }
}
