package com.suraksha.javacore2021aug.day006;

import java .util.Scanner;

public class operatorintro {
    public static void main(String[] args) {

        Integer firstNum = 25;
        Integer secondNum =4;
        // Arithmetic Operators : +, -, *, % (mod)

        System.out.println("\n Arithmetic Operators");
        Integer sum = firstNum + secondNum;    // Operands = firstNum and SecondNum
        System.out.println(firstNum + " + " + secondNum + " = " + sum);

        Integer difference = firstNum - secondNum;
        System.out.println(firstNum + " - " + secondNum + " = " + difference);

        Integer product = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + product);

        Integer quotient = firstNum / secondNum;
        System.out.println(firstNum + " / " + secondNum + " = " + quotient);

        Integer remainder = firstNum % secondNum;  // mod or module
        System.out.println(firstNum + " % " + secondNum + " = " + remainder);



        // unary operators : ++ , __
        System.out.println("\nunary operation");
        Integer regularNumber = 100;
        System.out.println("Number = " + regularNumber);

        regularNumber++;
        System.out.println("Number = " + regularNumber);

        regularNumber++;
        System.out.println("Number = " + regularNumber);

        regularNumber--;
        System.out.println("Number = " + regularNumber);

        regularNumber--;
        System.out.println("Number = " + regularNumber);

        //Assignment Operators +=, -=
        System.out.println("\nAssignment Operator");

        Integer thirdNum = 101;
        Integer fourthNum = 25;

        System.out.println("Third Number = " + thirdNum);
        System.out.println("fourth Number = " + fourthNum);

        thirdNum += 20;
        fourthNum -= 5;

        System.out.println("Third Number += 20 : " + thirdNum);
        System.out.println("fourth Number -= 5 : " + fourthNum);


        //Relational Operator : !=, <, >, <=, >= : Output is always boolen
        System.out.println("\nRelational Operator");

        Boolean isEqual = thirdNum == fourthNum;
        System.out.println("Is " + thirdNum + " = " + fourthNum + " ? " + isEqual);

        Boolean isNotEqual = thirdNum != fourthNum;
        System.out.println("Is " + firstNum + " not equal to " + thirdNum + " ? " + isNotEqual);


        //Ternary Operator = Condition ? if true : if false
        System.out.println("/nTernary Operator");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter first Number : ");
        Integer firstIpNum = scanner.nextInt();

        System.out.println("\nPlease enter second Number : ");
        Integer secIpNum = scanner.nextInt();

        String ComparisonOutput = firstIpNum > secIpNum ? "First Numb=er is bigger." : " Second Number is bigger";
        System.out.println("Output for " + firstIpNum + " and " + secIpNum + " = " + ComparisonOutput);

        //logical operator : &&, ||, ! (and, or , not respectively)
        System.out.println("\nLogical Operator");
        Integer fifthNum = 60;
        Integer sixthNum = 5;

        boolean andOperatorOutput = firstIpNum > secIpNum && fifthNum > sixthNum;
        System.out.println(" And Operation for : " + firstIpNum + " > " + secIpNum + " and " + fifthNum + " > " + sixthNum + " = " + andOperatorOutput);


        boolean orOperatorOutput = firstIpNum > secIpNum || fifthNum > sixthNum;
        System.out.println(" Or Operation for : " + firstIpNum + " > " + secIpNum + " or " + fifthNum + " > " + sixthNum + " = " + andOperatorOutput);








    }


    }



