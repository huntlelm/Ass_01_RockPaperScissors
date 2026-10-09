import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // Variables and scanner
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        String trash = "";
        boolean programDone = false;

        do {
            // Player A's move
            do {
                System.out.print("Player A, enter your move (R, P, or S): ");
                if (in.hasNextLine()) {
                    playerA = in.nextLine();
                }
                    if (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))) {
                        trash = playerA;
                        System.out.println("Invalid move: " + trash + ". Please enter R, P, or S.");
                }
            } while (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")));

            // Player B's move
            do {
                System.out.print("Player B, enter your move (R, P, or S): ");
                if (in.hasNextLine()) {
                    playerB = in.nextLine();
                }
                if (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))) {
                    trash = playerB;
                    System.out.println("Invalid move: " + trash + ". Please enter R, P, or S.");
                }
            } while (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")));

            // Determine and Display Game Outcome
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock - It's a Tie!");
                }
                else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock - Player B wins!");
                }
                else { // playerB is S
                    System.out.println("Rock breaks Scissors - Player A wins!");
                }
            }
            else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock - Player A wins!");
                }
                else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper - It's a Tie!");
                }
                else { // playerB is S
                    System.out.println("Scissors cuts Paper - Player B wins!");
                }
            }
            else { // playerA is S
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors - Player B wins!");
                }
                else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper - Player A wins!");
                }
                else { // playerB is S
                    System.out.println("Scissors vs Scissors - It's a Tie!");
                }
            }

            // Prompt to Play Again [Y/N]
            System.out.print("Would you like to play again? [Y/N]: ");
            playAgain = in.nextLine();

            if (!playAgain.equalsIgnoreCase("Y")) {
                programDone = true;
            }

        } while (!programDone);
    }
}