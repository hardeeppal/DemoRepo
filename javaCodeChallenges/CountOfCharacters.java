package javaCodeChallenges;

import java.util.Scanner;

public class CountOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence here : ");
        String inputString = scanner.nextLine();
                int totalCharacters = inputString.length();
                int totalCountAfterCharacterRemoved = inputString.replace('j', ' ').length();
                int totalNumberOfTimeCharactersRemovedIs = totalCharacters - totalCountAfterCharacterRemoved;
                System.out.println("Total number of times charactersRemove are : " + totalNumberOfTimeCharactersRemovedIs);
    }
}
