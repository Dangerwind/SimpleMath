// Игра в прогрессию
// MODULE_MAX и MODULE_MIN- максимальный и минимальный шаг прогрессии
// START_MAX_NUM - максимальное число с которого может начинаться прогрессия
// LENGTH_MIN и LENGTH_MAX - минимальная и максимальная длина прогрессии

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Welcome;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS;

public class Progression {
    private static final int MODULE_MAX = 10;
    private static final int MODULE_MIN = 1;
    private static final int START_MAX_NUM = 50;
    private static final int LENGTH_MIN = 5;
    private static final int LENGTH_MAX = 11;
    public static void run() {
        //String[][] gameData = new String[ROUNDS][2];
        var userName = Welcome.getName();
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < ROUNDS; i++) {
            int moduleNum = new Random().nextInt(MODULE_MIN, MODULE_MAX);
            int startNum = new Random().nextInt(START_MAX_NUM);
            int lengthNum = new Random().nextInt(LENGTH_MIN, LENGTH_MAX);
            int missingNum = new Random().nextInt(lengthNum);
            Engine.gameData[i][0] = "";
            for (int j = 0; j < lengthNum; j++) {
                if (missingNum == j) {
                    Engine.gameData[i][0] = Engine.gameData[i][0].concat(".. ");
                    Engine.gameData[i][1] = Integer.toString(startNum);
                } else {
                    Engine.gameData[i][0] = Engine.gameData[i][0].concat(Integer.toString(startNum)).concat(" ");
                }
                startNum +=  moduleNum;
            }
        }
        Engine.run(Engine.gameData, userName);
    }
}
