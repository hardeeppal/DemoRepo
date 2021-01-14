package Array;

import java.util.Arrays;

public class Number {
    public static void main(String[] args) {
        // Storing value of same datatype
        int[] numbers = new int[5];
        // If you declare about size you can'nt change it after
        numbers[0] = 36;
        numbers[1] = 32;
        numbers[2] = 33;
        numbers[3] = 34;
        numbers[4] = 35;

        System.out.println(Arrays.toString(numbers));

        String[] friends = {"karan","Jasvir","Jatinder","Jugal"};

        System.out.println(Arrays.toString(friends));
        System.out.println(friends[2]);
        System.out.println((Arrays.toString(numbers)));
        System.out.println(friends);
        friends[1] = "JassiKainth";
        System.out.println(friends[1]);
    }
}
