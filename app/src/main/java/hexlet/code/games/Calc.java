// Игра "калькулятор" формирует уравнения из 2 чисел и мат. знака между ними
// MAX_NUMBER - максимальное число которое может использоваться в формуле

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS;

public class Calc {
    private static final int MAX_NUMBER = 100;
    private static final int SIGN_QUANTITY = 3;
    public static final char[] SIGN_CONVERTER = {'+', '-', '*'};

    private static String getQuestion(int firstNum, int secondNum, char sign) {
        return firstNum + " " + sign + " " + secondNum;
    }

    private static String getAnswer(int firstNum, int secondNum, char sign) {
        return switch (sign) {
            case '+' -> Integer.toString(firstNum + secondNum);
            case '-' -> Integer.toString(firstNum - secondNum);
            default -> Integer.toString(firstNum * secondNum);
        };
    }

    public static void run() {
        String[][] gameData = new String[ROUNDS][2];
        for (int i = 0; i < ROUNDS; i++) {
            var firstNum = Utils.getRandomInt(0, MAX_NUMBER);
            var secondNum = Utils.getRandomInt(0, MAX_NUMBER);
            var sign = SIGN_CONVERTER[Utils.getRandomInt(0, SIGN_QUANTITY)];
            gameData[i][0] = getQuestion(firstNum, secondNum, sign);
            gameData[i][1] = getAnswer(firstNum, secondNum, sign);
        }
        Engine.run(gameData, "What is the result of the expression?");
    }
}
