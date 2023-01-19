import java.util.Random;

public enum GestureType {
    PAPER, ROCK, SCISSORS;


    private static final Random RANDOM = new Random();

    public static GestureType randomGesture() {
        GestureType[] gestures = values();
        return gestures[RANDOM.nextInt(gestures.length)];
    }

}
