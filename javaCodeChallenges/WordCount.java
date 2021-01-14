package javaCodeChallenges;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence : ");
        String inputString = scanner.nextLine(); // Welcome to java
//        char[]  charArray = inputString.toCharArray();

        int count = 1;

        for (int i = 0; i < inputString.length() - 1; i++) {
            if (inputString.charAt(i) == ' ' && (inputString.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of word in a sentence are  : " + count);
    }
}
