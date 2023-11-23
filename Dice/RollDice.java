package Dice;

import java.util.Random;

public class RollDice {

    public static void main(String[] args) {
        Random randomNumber =  new Random();

        int[] frequency = new int[7];

        for( int roll = 1;  roll < 10000; roll++){
            ++frequency[ 1+ randomNumber.nextInt(6)];
        }

        System.out.printf("%s%20s\n", "FACE", "FREQUENCY");

        for( int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d\n", face, frequency[face] );
        }
    }
}
