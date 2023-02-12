import java.util.Scanner;

public class Setup {
    private final GameHelper gameHelper = new GameHelper();

    public void start() {
        gameHelper.showWelcomeScreen();
        if(!gameHelper.isGameOver()){

            gameHelper.setComputerGesture();
            do {
                System.out.println("Enter paper, rock or scissors Gesture.");
                gameHelper.getPlayerGesture();

            } while (!gameHelper.isPlayerGestureValid());
            gameHelper.showChoseGestures();

            gameHelper.checkTheAnswers();
        }

        gameHelper.showEndingQuestion();

        gameHelper.getPlayerGesture();

        gameHelper.isEndingTheGameCorrect();

    }

    public void finish() {
        gameHelper.showResults();
    }
}
