package JavaCodeChallanges;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number please : ");
        int number = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 1; i <= number; i++) {
            int sum = a + b;
            System.out.print(" " + sum);
            a = b ;
            b = sum;

        }
    }
}
