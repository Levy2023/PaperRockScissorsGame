import java.util.Scanner;

public class GameHelper {

    private GestureType computerGesture;
    private String playerGesture;
    private int tie=0;

    private int computerCounter = 0;
    private int playerCounter =0;

    public GameHelper(){
    }



    public void showWelcomeScreen()  {
        System.out.println("Welcome in Paper, Rock, Scissors Game! \n");
    }

    public void showResults() {
        System.out.println("(to do) show ending results.");
    }

    public void setComputerGesture() {
        System.out.println("The computer randomly draws its symbol. \n");
        this.computerGesture = GestureType.randomGesture(); // losowanie symbolu przez kompa
    }

    public void getPlayerGesture(){
        Scanner scanner = new Scanner(System.in);
        playerGesture = scanner.nextLine().toUpperCase();
        GestureType.valueOf(playerGesture);
    }

    public boolean isPlayerGestureValid() {
        if ((GestureType.valueOf(playerGesture) == GestureType.PAPER)
                || (GestureType.valueOf(playerGesture) == GestureType.ROCK)
                || (GestureType.valueOf(playerGesture) == GestureType.SCISSORS)) {
            return true;
        } else {
            return false;
        }
    }

    public void showChoseGestures(){
        System.out.println("You choose: " + playerGesture);
        System.out.println("Computer choose: " + computerGesture);
    }

        public void checkTheAnswers(){
        if (playerGesture.equalsIgnoreCase(computerGesture.name())) {
            tie++;
            System.out.println("It's tie!");
        } else if ((GestureType.valueOf(playerGesture) == GestureType.PAPER.)
                && (computerGesture.equals(GestureType.ROCK))
                    || (GestureType.valueOf(playerGesture) == GestureType.ROCK)
                && (computerGesture.equals(GestureType.SCISSORS))
                    || (GestureType.valueOf(playerGesture) == GestureType.SCISSORS)
                && (computerGesture.equals(GestureType.PAPER)))
             {
            playerCounter++;
            System.out.println("You WIN!");
        } else {
            computerCounter++;
            System.out.println("You Lost :P");
        }
    }
}
