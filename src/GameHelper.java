import java.util.Scanner;

public class GameHelper {

    private GestureType computerGesture;
    private String playerGesture = "Yes";
    private int tie = 0;
    private int computerCounter = 0;
    private int playerCounter = 0;
    private boolean gameOver = false;

    public GameHelper() {
    }


    public void showWelcomeScreen() {
        System.out.println("Welcome in Paper, Rock, Scissors Game! \n");
    }

    public void showEndingQuestion(){
        System.out.println("Play again? Enter Yes or No");
    }

    public boolean isEndingTheGameCorrect() {
        if (playerGesture.equals("YES") || (playerGesture.equals("NO"))) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isGameOver() {
        if (playerGesture.equals("NO")) {
            showResults();
        } return gameOver;

    }

    public void showResults() {
        System.out.println();
        System.out.println("Results");
        System.out.println("-------------------------------------");
        System.out.println("You win: " + playerCounter + " times.");
        System.out.println("Computer wins: " + computerCounter + " times.");
        System.out.println("Tie: " + tie);
    }

    public void setComputerGesture() {
        System.out.println("The computer randomly draws its symbol. \n");
        this.computerGesture = GestureType.randomGesture(); // losowanie symbolu przez kompa
    }

    public void getPlayerGesture() {
        Scanner scanner = new Scanner(System.in);
        playerGesture = scanner.nextLine().toUpperCase();
    }


    public boolean isPlayerGestureValid() {
            if (playerGesture.equals(GestureType.PAPER.toString())
            || (playerGesture.equals(GestureType.ROCK.toString()))
            || (playerGesture.equals(GestureType.SCISSORS.toString()))) {
                return true;
            }else {
                System.out.println("Wrong gesture!");
                return false;
        }
    }

    public void showChoseGestures() {
        System.out.println();
        System.out.println("You choose: " + playerGesture);
        System.out.println("Computer choose: " + computerGesture +"\n");
    }

    public void checkTheAnswers() {
        if (playerGesture.equalsIgnoreCase(computerGesture.name())) {
            tie++;
            System.out.println("It's tie! \n");
        } else if ((GestureType.valueOf(playerGesture) == GestureType.PAPER)
                && (computerGesture.equals(GestureType.ROCK))
                || (GestureType.valueOf(playerGesture) == GestureType.ROCK)
                && (computerGesture.equals(GestureType.SCISSORS))
                || (GestureType.valueOf(playerGesture) == GestureType.SCISSORS)
                && (computerGesture.equals(GestureType.PAPER))) {
            playerCounter++;
            System.out.println("You WIN!");
        } else {
            computerCounter++;
            System.out.println("You Lost :P");
        }
    }


}
