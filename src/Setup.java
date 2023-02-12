public class Setup {
    private final GameHelper gameHelper = new GameHelper();

    public void start() {
        gameHelper.showWelcomeScreen();
        while (!gameHelper.isGameOver()) {
            gameHelper.setComputerGesture();

            while (!gameHelper.isPlayerGestureValid()) {
                System.out.println("Enter paper, rock or scissors gesture.");
                gameHelper.getPlayerGesture();
            }
            gameHelper.showChoseGestures();
            gameHelper.checkTheAnswers();

            do {
                gameHelper.showEndingQuestion();
                gameHelper.getPlayerGesture();
            } while (!gameHelper.isEndingTheGameCorrect());
        }

    }

    public void finish() {
        gameHelper.showResults();
        gameHelper.endingMessage();
    }
}
