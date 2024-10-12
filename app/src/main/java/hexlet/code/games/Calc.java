// Игра "калькулятор" формирует уравнения из 2 чисел и мат. знака между ними
// MAX_NUMBER - максимальное число которое может использоваться в формуле

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Welcome;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Calc {
    private static final int MAX_NUMBER = 100;
    private static final int SIGN_QUANTITY = 3;
    public static void run() {

        String[] signConverter = {" + ", " - ", " * "};
     //   String[][] gameData = new String[ROUNDS][2];
        var userName = Welcome.getName();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < ROUNDS; i++) {
            var firstNum = new Random().nextInt(0, MAX_NUMBER);
            var secondNum = new Random().nextInt(0, MAX_NUMBER);
            var sign = new Random().nextInt(SIGN_QUANTITY);
            int resultAnswer = 0;
            Engine.gameData[i][0] = Integer.toString(firstNum).concat(signConverter[sign]).concat(Integer.toString(secondNum));

            switch (sign) {
                case 0 :
                    resultAnswer = firstNum + secondNum;
                    break;
                case 1 :
                    resultAnswer = firstNum - secondNum;
                    break;
                case 2 :
                    resultAnswer = firstNum * secondNum;
                    break;
                default: break;
            }
            Engine.gameData[i][1] = Integer.toString(resultAnswer);
        }
        Engine.run(Engine.gameData, userName);
    }
}
