// Игра "калькулятор" формирует уравнения из 2 чисел и мат. знака между ними
// MAX_NUMBER - максимальное число которое может использоваться в формуле

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameData;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS;

public class Calc {
    private static final int MAX_NUMBER = 100;
    private static final int SIGN_QUANTITY = 3;
    public static final String[] SIGN_CONVERTER = {" + ", " - ", " * "};

    private static String getQuestion(int firstNum, int secondNum, int sign) {
        return Integer.toString(firstNum).concat(SIGN_CONVERTER[sign]).concat(Integer.toString(secondNum));
    }

    private static String getAnswer(int firstNum, int secondNum, int sign) {
        return switch (sign) {
            case 0 -> Integer.toString(firstNum + secondNum);
            case 1 -> Integer.toString(firstNum - secondNum);
            default -> Integer.toString(firstNum * secondNum);
        };
    }

    public static void run() {
        GameData base = new GameData();
        for (int i = 0; i < ROUNDS; i++) {
            var firstNum = Utils.getRandomInt(0, MAX_NUMBER);
            var secondNum = Utils.getRandomInt(0, MAX_NUMBER);
            var sign = Utils.getRandomInt(0, SIGN_QUANTITY);
            base.setGameData(i, getQuestion(firstNum, secondNum, sign), getAnswer(firstNum, secondNum, sign));
        }
        base.setRules("What is the result of the expression?");
        Engine.run(base);
    }
}
