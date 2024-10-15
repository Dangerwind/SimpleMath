package hexlet.code.games;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int minValue, int maxValue) {
        return new Random().nextInt(minValue, maxValue);
    }
}
