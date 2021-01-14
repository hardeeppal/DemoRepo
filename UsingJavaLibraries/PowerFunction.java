package UsingJavaLibraries;

import java.util.Random;

public class PowerFunction {
    public static void main(String[] args) {
        // Java.lang is for libraries
        // using pow class from math class
        double power = Math.pow(5,3);
        System.out.println(power);
        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);
        Random rand = new Random();
        int randomNumber = rand.nextInt();
        int randomNumberWithBound = rand.nextInt(20);
        System.out.println(randomNumber);
        System.out.println(randomNumberWithBound);
    }
}
