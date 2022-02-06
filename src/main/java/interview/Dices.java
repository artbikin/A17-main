package interview;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        int number = 5;

        int[]dices = throwDices(number);
        for (int dice:dices ) {
            System.out.println(dice);
        }

        int moves = calculateMoves(dices);
        System.out.println("moves = "+moves);
    }

    private static int calculateMoves(int[] dices) {
        int moves = 0;
        for (int dice:dices ) {
            if (dice ==1){
                moves=moves+2;
                continue;
            }
            if (dice==6){
                continue;
            }
            moves++;
        }
        return moves;
    }

    private static int[] throwDices(int number) {
        int[]dices = new int[number];
        Random random = new Random();

        for (int i = 0;i<number;i++){
            dices[i] = random.nextInt(6)+1;
        }
        return dices;
    }
}
