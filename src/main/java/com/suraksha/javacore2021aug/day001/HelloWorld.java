package com.suraksha.javacore2021aug.day001;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {


        System.out.println("welcome Everyone !!");


        System.out.println("what is your name ? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(" \nHello " + name + " Welcome to Java session. ");


        System.out.println(" How old are you ? ");
        Integer age = scanner.nextInt();


        System.out.println(" So you are "+ age + "years old. Good to know that . ");




    }
}
