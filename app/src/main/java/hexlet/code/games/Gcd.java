// Игра "Наибольший общий делитель"
// MAX_NUMBER - максимальное число которое может выведено в вопросе
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS;

public class Gcd {
    private static final int MAX_NUMBER = 100;
    public static int euclidCalculation(int aNumber, int bNumber) {
        if (bNumber == 0) {
            throw new RuntimeException();
        }
        int remainder = aNumber % bNumber;
        while (remainder > 0) {
            aNumber = bNumber;
            bNumber = remainder;
            remainder = aNumber % bNumber;
        }
        return bNumber;
    }
    private static String getQuestion(int firstNum, int secondNum) {
        return Integer.toString(firstNum).concat(" ").concat(Integer.toString(secondNum));
    }
    private static String getAnswer(int firstNum, int secondNum) {
        return Integer.toString(euclidCalculation(firstNum, secondNum));
    }
    public static void run() {
        String[][] gameData = new String[ROUNDS][2];
        for (int i = 0; i < ROUNDS; i++) {
            int firstNum = Utils.getRandomInt(1, MAX_NUMBER);
            int secondNum = Utils.getRandomInt(1, MAX_NUMBER);
            gameData[i][0] = getQuestion(firstNum, secondNum);
            gameData[i][1] = getAnswer(firstNum, secondNum);
        }
        Engine.run(gameData, "Find the greatest common divisor of given numbers.");
    }
}
