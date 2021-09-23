package com.suraksha.javacore2021aug.day007;

import java.util.Locale;

public class stringfunction {

    public static void main(String[]args){

        String sampleString = "This is java 101 Session for Cerotid Inc";
        System.out.println("Sample String : " + sampleString);
        System.out.println("Length of sample String : " + sampleString.length());
        System.out.println("Sample String in Upper case : " + sampleString.toUpperCase());
        System.out.println("Sample String in Lower case : " + sampleString.toUpperCase());

        String sampleString2 = "I am enjoying my java session";

        System.out.println("Concatenate 2 sample String " + sampleString + sampleString2);
        //other way to concatenate 2 sample String
        System.out.println("Concatenate with String function " + sampleString.concat(sampleString2));

        System.out.println("Replace a with @ : " + sampleString.replace('a', '@'));
        System.out.println("\nSubstring from 8th Index position : " + sampleString.substring(8));

        String[] wordsInsamplestring = sampleString.split(" ");
        System.out.println("Number of words in Sample String : " + wordsInsamplestring.length);








    }
}
