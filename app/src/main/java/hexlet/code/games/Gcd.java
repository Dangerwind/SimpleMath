// Игра "Наибольший общий делитель"
// MAX_NUMBER - максимальное число которое может выведено в вопросе
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameData;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS;

public class Gcd {
    private static final int MAX_NUMBER = 100;
    private static String getQuestion(int firstNum, int secondNum) {
        return Integer.toString(firstNum).concat(" ").concat(Integer.toString(secondNum));
    }
    private static String getAnswer(int firstNum, int secondNum) {
        return Integer.toString(Utils.euclidCalculation(firstNum, secondNum));
    }
    public static void run() {
        GameData base = new GameData();
        for (int i = 0; i < ROUNDS; i++) {
            int firstNum = Utils.getRandomInt(0, MAX_NUMBER);
            int secondNum = Utils.getRandomInt(0, MAX_NUMBER);
            base.setGameData(i, getQuestion(firstNum, secondNum), getAnswer(firstNum, secondNum));
        }
        base.setRules("Find the greatest common divisor of given numbers.");
        Engine.run(base);
    }


}
