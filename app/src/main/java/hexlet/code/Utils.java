package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static int getRandomInt(int minValue, int maxValue) {
        return new Random().nextInt(minValue, maxValue);
    }

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

    public static String getWelcomeName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
