package RollingADiceUsingRandomGenerator;

import java.util.Random;

public class Dice {

    public int diceUp;

    Random rand;
    int previousRoll = -1;

    public Dice() {
        this.rand = rand;
    }


    public int flipDice() {
        Random random = new Random();
        int number = rand.nextInt(6) + 1;
        return number;
    }


}
