package javaCodeChallenges;

import java.util.Scanner;

public class CountOccurancesOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence here : ");
        String inputString = scanner.nextLine();

        String inputStringWithNoSpace = inputString.replace(" ", "");
        while (inputString.length() > 0) {
           char ch = inputString.charAt(0);
            System.out.println(ch + "characterCount" + inputString);
        }
    }
}
