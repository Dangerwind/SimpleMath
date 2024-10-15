// Основной движок
// ROUNDS - количество раундов до победы, по умолчанию 3

package hexlet.code;
import java.util.Scanner;

public class Engine {
    // количество раундов любой игры, по умолчанию 3
    public static final int ROUNDS = 3;

    public static void run(GameData base) {
        base.setUserName(Utils.getWelcomeName());
        System.out.println(base.getRules());
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + base.getQuestion(i));
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer.equals(base.getAnswer(i))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + base.getAnswer(i) + "'");
                System.out.println("Let's try again, " + base.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + base.getUserName() + "!");
    }
}
