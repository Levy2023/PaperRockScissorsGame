import java.util.Scanner;

public class PaperRockScissorsGame {

    public static void main(String[] args) {

        GameHelper.showWelcomeScreen();


        System.out.println("The computer randomly draws its symbol. \n");

        GestureType computerGesture = GestureType.randomGesture(); // losowanie symbolu przez kompa


        int counter = 0;
        int playerCounter = 0;
        int computerCounter=0;
        String playerGesture;
        System.out.println("Enter paper, rock or scissors Gesture. To quite the game enter quit.");
        Scanner scanner = new Scanner(System.in);
        playerGesture = scanner.nextLine().toUpperCase();


        //   while (true) {
        if (!playerGesture.equals("PAPER") &&
                !playerGesture.equals("ROCK") &&
                !playerGesture.equals("SCISSORS")) {
            System.out.println("Your gesture is not valid.");
            //        break;
        } else {


            System.out.println("You choose: " + playerGesture);
            System.out.println("Computer choose: " + computerGesture);
            counter++;
            if (playerGesture.equalsIgnoreCase(computerGesture.name())) {
                System.out.println("It's tie!");
            } else if ((playerGesture.equals(GestureType.PAPER.toString()) && (computerGesture.equals(GestureType.ROCK.toString()))) ||
                    (playerGesture.equals(GestureType.ROCK.toString()) && (computerGesture.equals(GestureType.SCISSORS.toString()))) ||
                    (playerGesture.equals(GestureType.SCISSORS.toString()) && (computerGesture.equals(GestureType.PAPER.toString())))) {
                playerCounter++;
                System.out.println("You WIN!");
            } else {
                computerCounter++;
                System.out.println("You Loose");
            }
        }
    }
}