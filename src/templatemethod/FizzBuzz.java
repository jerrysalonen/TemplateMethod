package templatemethod;

import java.util.Scanner;

/**
 * @author Jerry Salonen
 */
class FizzBuzz extends Game {

    void initializeGame() {
        System.out.println("FizzBuzz");
        System.out.println("Counter goes up by increments of one.");
        System.out.println("Players take turns counting up from 0, with these rules:");
        System.out.println("If the number is divisible by " + num1 + ", type 'Fizz'.");
        System.out.println("If the number is divisible by " + num2 + ", type 'Buzz'.");
        System.out.println("If the number is divisible by both, type 'FizzBuzz'.");
        System.out.println("Otherwise, type the number.");
    }

    void makePlay(int player) {
        System.out.println("Player " + player + ":");
        correctAns = "";

        if (counter % num1 == 0) {
            correctAns += "Fizz";
        }

        if (counter % num2 == 0) {
            correctAns += "Buzz";
        }

        if (correctAns.length() == 0) {
            correctAns = Integer.toString(counter);
        }

        guess = sc.nextLine();

        if (!guess.equalsIgnoreCase(correctAns)) {
            failed = true;
            System.out.println("Wrong! The correct answer was: " + correctAns);
            if (player == 0) {
                winner = 1;
            } else {
                winner = 0;
            }
        }

        counter++;

    }

    boolean endOfGame() {
        if (failed) {
            return true;
        } else {
            return false;
        }
    }

    void printWinner() {
        System.out.println("Winner is player " + winner);
    }

    int num1 = 3;
    int num2 = 5;
    int counter = 0;
    int winner;
    boolean failed = false;
    Scanner sc = new Scanner(System.in);
    String guess;
    String correctAns;

}
