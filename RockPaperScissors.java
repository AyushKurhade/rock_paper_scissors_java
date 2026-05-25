import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        String userChoice;
        String computerChoice;

        System.out.println("===== ROCK PAPER SCISSORS =====");
        System.out.print("Enter Rock, Paper, or Scissors: ");
        userChoice = sc.nextLine();

        computerChoice = options[r.nextInt(3)];

        System.out.println("Computer Chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("Match Draw!");
        }
        else if (
            (userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))
        ) {
            System.out.println("You Win 🎉");
        }
        else {
            System.out.println("Computer Wins 😈");
        }
    }
}