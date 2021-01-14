package String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a word : ");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        String userInput = "Entertainment";
        String upperCase = userInput.toUpperCase();
        // String is immutable
        // initial input is not changed

        System.out.println(upperCase);
        char firstLetter = upperCase.charAt(0);
        System.out.println(firstLetter);
        System.out.println("Contains :" + userInput.contains("Enter"));
    }
}
