package JavaCodeChallanges;

public class PalindromeString {
    public static void main(String[] args) {
        PalindromeString src = new PalindromeString();
        src.palindromeChecker("evacan I see bees in a cave");
    }

    public void palindromeChecker(String word) {
        for (int i = 0; i <= word.length() - 1; i++) {
//            for (int j = 1; j <= word.length() - 1; j++)
                if (word.charAt(word.length() - 1) == word.charAt(0)) {
                    System.out.println("It is a palindrome");
                    break;
                } else System.out.println("It is not");
                break;
        }
    }
}
