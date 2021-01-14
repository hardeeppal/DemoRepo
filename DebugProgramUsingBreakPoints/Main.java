package DebugProgramUsingBreakPoints;

import DebuggingWithPrintStatement.Coin;

public class Main {
    public static void main(String[] args) {
        DebuggingWithPrintStatement.Coin c = new DebuggingWithPrintStatement.Coin(Coin.HEADS);
        System.out.println("Initial : " + c.getFaceUp());
        for (int i = 0; i < 10; i++) {
            // BreakPoints intentionally pause your program for more information about output
            c.flip();
            System.out.println("After flip : " + c.getFaceUp());
        }
    }
}
