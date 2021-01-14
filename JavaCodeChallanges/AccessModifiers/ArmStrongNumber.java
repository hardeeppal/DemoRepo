package JavaCodeChallanges.AccessModifiers;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your input number : ");
        int finalNumber = 0,a;
        int inputNumber = scanner.nextInt();
        int temp = inputNumber;
        while (inputNumber > 0) {
            a = inputNumber % 10;
            inputNumber = inputNumber / 10;
            finalNumber = finalNumber + a * a * a;
        }
        if (temp == finalNumber) {
            System.out.println("It is armStrongNumber");
        } else
            System.out.println("It is not an armStrongNumber");
    }
}