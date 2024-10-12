// Игра угадай простое число или нет
// используется таблица простых чисел!!! Эту таблицу можно увелиивать

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Welcome;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Prime {
// таблица простых чисел 25 шт
    public static final int[] PRIME_NUM_TABLE =
            new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
// максимальное число вопроса не должно быть больше максимального числа из таблица простых чисел
    private static final int NUMBERS_MAX = PRIME_NUM_TABLE[PRIME_NUM_TABLE.length - 1];

    public static void run() {
        String[][] gameData = new String[ROUNDS][2];
        var userName = Welcome.getName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < ROUNDS; i++) {
            var randomNum = new Random().nextInt(1, NUMBERS_MAX);
            gameData[i][0] =  Integer.toString(randomNum);
            gameData[i][1] = "no";
            for (int findNum :  PRIME_NUM_TABLE) {
                if (findNum == randomNum) {
                    gameData[i][1] = "yes";
                    break;
                }
            }
        }
        Engine.run(gameData, userName);
    }
}
