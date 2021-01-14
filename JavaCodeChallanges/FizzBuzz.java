package JavaCodeChallanges;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number please : ");
            int number = scanner.nextInt();
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 5 == 0) {
                System.out.println("Fizz");
            } else if (number % 7 == 0) {
                System.out.println("Buzz");
            } else System.out.println("Normal number not a fizz, buzz or both");;
        }
    }
}
