package ifStatement;

import java.util.Scanner;

public class Man {
    protected int age;

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your age please : ");
            Integer age = scanner.nextInt();

            if (age >= 0 && age <= 5) {
                System.out.println("Baby");
            } else if (age >= 6 && age <= 11) {
                System.out.println("Kid");
            } else if (age >= 12 && age <= 17) {
                System.out.println("Teen");
            } else if (age >= 18) {
                System.out.println("Adult");
            } else {
                System.out.println("Invalid");
            }
        }
    }

}