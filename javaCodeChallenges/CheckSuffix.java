package javaCodeChallenges;


import java.util.Arrays;

public class CheckSuffix {
    public static void main(String[] args) {
        String str = ("mandeep hardeep sandeep pardeep hardman kainth paradeep");
        String[] charArray = str.split(" ");
        System.out.println(Arrays.toString(charArray));

        String[] finalArray = new String[charArray.length];
        int k = 0; int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i].endsWith("deep")) {
                finalArray[k] = charArray[i];
                count++;
                k++;
            }
        }
        System.out.println("Count of words are : " + count);


        }

}
