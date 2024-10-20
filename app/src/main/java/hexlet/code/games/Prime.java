// Игра угадай простое число или нет
// используется таблица простых чисел!!! Эту таблицу можно увелиивать
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameData;
import hexlet.code.Utils;
import static hexlet.code.Engine.ROUNDS;

public class Prime {
    private static final int NUMBERS_MAX = 100;

    private static String getQuestion(int number) {
        return Integer.toString(number);
    }
    private static String getAnswer(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return  "no";
            }
        }
        return "yes";
    }
    public static void run() {
        GameData base = new GameData();
        for (int iter = 0; iter < ROUNDS; iter++) {
            var rndNum = Utils.getRandomInt(2, NUMBERS_MAX);
            base.setGameData(iter, getQuestion(rndNum), getAnswer(rndNum));
        }
        base.setRules("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.run(base);
    }
}
