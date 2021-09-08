package com.suraksha.javacore2021aug.day002;

import java.util.Scanner;

public class IntroCont {
    public static void main(String[] args) {

        // for Introduction


        System.out.println("welcome Everyone !!!");

        System.out.println("what is your name ? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("\nHello " + name + " Welcome to java core. ");

        System.out.println("How old are you ? ");
        Integer age = scanner.nextInt();
        System.out.println("\nOk so you are "  +  age  +  " years old. " );
    }
}

