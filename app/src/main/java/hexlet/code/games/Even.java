// Игра чет-нечет
// MAX_NUMBER - максимальное число которое может выведено в вопросе
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameData;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS;

public class Even {
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
    private static String getQuestion(int number) {
        return Integer.toString(number);
    }

    private static String getAnswer(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static void run() {
        GameData base = new GameData();
        for (int i = 0; i < ROUNDS; i++) {
            int randomNum = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            base.setGameData(i, getQuestion(randomNum), getAnswer(randomNum));
        }
        base.setRules("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.run(base);
    }
}
