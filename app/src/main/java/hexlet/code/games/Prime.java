// Игра угадай простое число или нет
// используется таблица простых чисел!!! Эту таблицу можно увелиивать
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameData;
import hexlet.code.Utils;
import static hexlet.code.Engine.ROUNDS;

public class Prime {

// таблица простых чисел 25 шт
    public static final int[] PRIME_NUM_TABLE =
            new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
// максимальное число вопроса не должно быть больше максимального числа из таблица простых чисел
    private static final int NUMBERS_MAX = PRIME_NUM_TABLE[PRIME_NUM_TABLE.length - 1];

    private static String getQuestion(int number) {
        return Integer.toString(number);
    }
    private static String getAnswer(int number) {
        for (int findNum :  PRIME_NUM_TABLE) {
            if (findNum == number) {
                return  "yes";
            }
        }
        return "no";
    }
    public static void run() {
        GameData base = new GameData();
        for (int iter = 0; iter < ROUNDS; iter++) {
            var rndNum = Utils.getRandomInt(1, NUMBERS_MAX);
            base.setGameData(iter, getQuestion(rndNum), getAnswer(rndNum));
        }
        base.setRules("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.run(base);
    }
}
