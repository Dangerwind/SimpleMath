// Игра угадай простое число или нет

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.ROUNDS;

public class Prime {
    private static final int NUMBERS_MAX = 100;

    private static String getQuestion(int number) {
        return Integer.toString(number);
    }
    private static boolean getAnswer(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void run() {
        String[][] gameData = new String[ROUNDS][2];
        for (int iter = 0; iter < ROUNDS; iter++) {
            var rndNum = Utils.getRandomInt(2, NUMBERS_MAX);
            gameData[iter][0] = getQuestion(rndNum);
            gameData[iter][1] = getAnswer(rndNum) ? "yes" : "no";
        }
        Engine.run(gameData, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
