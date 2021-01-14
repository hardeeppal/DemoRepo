package JavaCodeChallanges.AccessModifiers;

import java.util.Scanner;

public class ReverseCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your input string :");
        String inputString = scanner.nextLine();
        char ch;
        for (int i = 0; i < inputString.length(); i++) {
            ch = inputString.charAt(i);
            if (Character.isLowerCase(ch)) {
                System.out.print(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                System.out.print(Character.isLowerCase(ch));

            }
        }
    }
}
