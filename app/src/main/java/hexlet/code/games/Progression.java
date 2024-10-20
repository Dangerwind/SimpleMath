// Игра в прогрессию
// MODULE_MAX и MODULE_MIN- максимальный и минимальный шаг прогрессии
// START_MAX_NUM - максимальное число с которого может начинаться прогрессия
// LENGTH_MIN и LENGTH_MAX - минимальная и максимальная длина прогрессии

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameData;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDS;

public class Progression {
    private static final int MODULE_MAX = 10;
    private static final int MODULE_MIN = 1;
    private static final int START_MAX_NUM = 50;
    private static final int LENGTH_MIN = 5;
    private static final int LENGTH_MAX = 11;

    private static String[] hideQuestion(String[] progression, int missingNum) {
        progression[missingNum] = "..";
        return progression;
    }

    private static String getQuestion(int moduleNum, int startNum, int lengthNum, int missingNum) {
        String[] progression = new String[lengthNum];
        for (int j = 0; j < lengthNum; j++) {
            progression[j] = Integer.toString(startNum + j * moduleNum);
        }
        return String.join(" ", hideQuestion(progression, missingNum));
    }
    private static String getAnswer(int moduleNum, int startNum,  int missingNum) {
        return Integer.toString(startNum + moduleNum * missingNum);
    }
    public static void run() {
        GameData base = new GameData();
        for (int i = 0; i < ROUNDS; i++) {
            int moduleNum = Utils.getRandomInt(MODULE_MIN, MODULE_MAX);
            int startNum = Utils.getRandomInt(0, START_MAX_NUM);
            int lengthNum = Utils.getRandomInt(LENGTH_MIN, LENGTH_MAX);
            int missingNum = Utils.getRandomInt(0, lengthNum);
            base.setGameData(i, getQuestion(moduleNum, startNum, lengthNum, missingNum),
                    getAnswer(moduleNum, startNum, missingNum));
        }
        base.setRules("What number is missing in the progression?");
        Engine.run(base);
    }
}
