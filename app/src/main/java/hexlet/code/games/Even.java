// Игра чет-нечет
// MAX_NUMBER - максимальное число которое может выведено в вопросе
package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Welcome;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Even {
    private static final int MAX_NUMBER = 100;
    public static void run() {
        // String[][] gameData = new String[ROUNDS][2];
        var userName = Welcome.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < ROUNDS; i++) {
            var randomNum = new Random().nextInt(1, MAX_NUMBER);
            Engine.gameData[i][0] = Integer.toString(randomNum);
            Engine.gameData[i][1] = randomNum % 2 == 0 ? "yes" : "no";
        }
        Engine.run(Engine.gameData, userName);
    }
}
