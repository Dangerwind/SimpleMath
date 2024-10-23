// Игра чет-нечет
// MAX_NUMBER - максимальное число которое может выведено в вопросе
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS;

public class Even {
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
    private static String getQuestion(int number) {
        return Integer.toString(number);
    }

    private static boolean getAnswer(int number) {
        return number % 2 == 0;
    }

    public static void run() {
        String[][] gameData = new String[ROUNDS][2];
        for (int i = 0; i < ROUNDS; i++) {
            int randomNum = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            gameData[i][0] = getQuestion(randomNum);
            gameData[i][1] = getAnswer(randomNum) ? "yes" : "no";
        }
        Engine.run(gameData, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
