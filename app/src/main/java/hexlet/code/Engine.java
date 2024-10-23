// Основной движок
// ROUNDS - количество раундов до победы, по умолчанию 3

package hexlet.code;
import java.util.Scanner;

public class Engine {
    // количество раундов любой игры, по умолчанию 3
    public static final int ROUNDS = 3;

    public static void run(String[][] gameData, String rules) {
      //  base.setUserName(Utils.getWelcomeName());

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rules);
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(gameData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + gameData[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
