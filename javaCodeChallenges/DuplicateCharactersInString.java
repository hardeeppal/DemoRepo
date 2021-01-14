package javaCodeChallenges;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        DuplicateCharactersInString.printDuplicatesUsingStr("hardephardep");

    }
    public static void printDuplicatesUsingStr (String inputString) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            Character character = inputString.charAt(i);
            if(set.contains(character)) {
                System.out.println(character);
                count ++;
            }
            else {
                set.add(character);
            }
            System.out.println(count);
        }


    }

}
