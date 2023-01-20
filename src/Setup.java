import java.util.Scanner;

public class Setup {
    private GameHelper gameHelper = new GameHelper();

    public void start(){
        gameHelper.showWelcomeScreen();

        gameHelper.setComputerGesture();
        do {
            System.out.println("Enter paper, rock or scissors Gesture.");
            gameHelper.getPlayerGesture();
        } while (!gameHelper.isPlayerGestureValid());
        gameHelper.showChoseGestures();

        gameHelper.checkTheAnswers();

    }

    public void finish(){
        gameHelper.showResults();
    }
}
