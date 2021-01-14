package javaCodeChallenges;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string please  : ");
        String inputString = scanner.nextLine();
        String reverseString = " ";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + inputString.charAt(i);
        }
        System.out.println(reverseString);
    }
}
