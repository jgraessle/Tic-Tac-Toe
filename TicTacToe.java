import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

public class TicTacToe {
    Scanner in = new Scanner(System.in);
    int menuChoice = 0;
    int exitChoice = 0;
    int choice = 0;
    int player = 1;
    int winCondition = 0;
    ArrayList<String> movesList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
    ArrayList<Boolean> repeatList = new ArrayList<>(Arrays.asList(false, false, false, false, false, false, false, false, false));

    public void ExitMenu() {
        System.out.println("Would you like to continue playing or exit the game?");
        System.out.println("1: Continue Playing");
        System.out.println("2: Exit the game");
        while (true)
        try {
            while (true) {
            exitChoice = in.nextInt();
                if (menuChoice == 1 || menuChoice == 2) {
                    switch (exitChoice) {
                        case 1:
                            for (int i = 0; i < movesList.size(); i++) {
                                movesList.set(i, "" + (i + 1) + "");
                            }
                            for (int i = 0; i < movesList.size(); i++) {
                                repeatList.set(i, false);
                            }
                            exitChoice = 0;
                            choice = 0;
                            player = 1;
                            winCondition = 0;
                            Output();
                            TicTacToeRunner();
                            break;
                        case 2:
                            System.out.println("Exiting the game...");
                            System.exit(0);
                            break;
                    }
                }
                System.out.print("Please input an integer of 1 or 2: ");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Please input an integer 1 or 2");
            in.nextLine();
        } 
    }
    public int MenuDecision() {
        System.out.println("Choose game type:");
        System.out.println("1: Player vs Player");
        System.out.println("2: Player vs Computer");
        while (true) {
            try {
                menuChoice = in.nextInt();
                if (menuChoice == 1 || menuChoice == 2) {
                    return menuChoice;
                }
                else {
                    System.out.print("Please input a choice of 1 or 2: ");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Please input an integer");
                in.nextLine();
            }
        }
    }
    public void TicTacToeRunner() {
        while (winCondition == 0) {
            if (player == 1 && menuChoice == 2) {
                Decision();
                WinConditions();
                System.out.println("Your move:");
                Output();
            }
            else {
                Decision();
                WinConditions();
                Output();
            }
            if (player == 1) {
                player = player + 1;
            }
            else {
                player = player - 1;
            }
        }
        switch (winCondition) {
            case 1: System.out.println("Player 1 wins!");
            break;
            case 2: 
            if (menuChoice == 1) {
                System.out.println("Player 2 wins!");
            }
            else {
                System.out.println("Computer wins!");
            }
            break;
            case 3: System.out.println("There is a draw, how else did you expect tic tac toe to end?");
            break;
            default: System.out.println("Error with winCondition switch loop");
        }
        ExitMenu();
    }
    public void Decision() {
        int choice = -1;
        while (choice < 1 || choice > 9 || repeatList.get(choice - 1) == true) {
            if (menuChoice == 2 && player == 2) {

            }
            else if (choice < 1 || choice > 9 ) {
                System.out.print("Player "+ player + ", please choose a move that is an integer between 1 and 9: ");
            }
            else if (repeatList.get(choice -1) == true) {
                System.out.print("Player " + player + ", please choose a move that hasn't already been taken: ");
            }
            if (menuChoice == 2) {
                if (player == 1) {
                    try { 
                        choice = in.nextInt();
                    } catch (InputMismatchException e) {
                        in.nextLine();
                        choice = -1;
                    }
                }
                else if (player == 2) {
                        Random rand = new Random();
                        choice = rand.nextInt(9) + 1;
                        System.out.println("Computer's move below:");
                        while(repeatList.get(choice - 1) == true) {
                            choice = rand.nextInt(9) + 1;
                        }
                }
            }
            else {
                try { 
                    choice = in.nextInt();
                } catch (InputMismatchException e) {
                    in.nextLine();
                    choice = -1;
                }
            }
        }
        if (player == 1) {
            switch (choice) {
                case 1: movesList.set(0, "X");
                repeatList.set(0, true);
                break;
                case 2: movesList.set(1, "X");
                repeatList.set(1, true);
                break;
                case 3: movesList.set(2, "X");
                repeatList.set(2, true);
                break;
                case 4: movesList.set(3, "X");
                repeatList.set(3, true);
                break;
                case 5: movesList.set(4, "X");
                repeatList.set(4, true);
                break;
                case 6: movesList.set(5, "X");
                repeatList.set(5, true);
                break;
                case 7: movesList.set(6, "X");
                repeatList.set(6, true);
                break;
                case 8: movesList.set(7, "X");
                repeatList.set(7, true);
                break;
                case 9: movesList.set(8, "X");
                repeatList.set(8, true);
                break;
                default: System.out.println("Error with player 1 switch loop");
                break;
            }
        }
        else {
            switch (choice) {
                case 1: movesList.set(0, "O");
                repeatList.set(0, true);
                break;
                case 2: movesList.set(1, "O");
                repeatList.set(1, true);
                break;
                case 3: movesList.set(2, "O");
                repeatList.set(2, true);
                break;
                case 4: movesList.set(3, "O");
                repeatList.set(3, true);
                break;
                case 5: movesList.set(4, "O");
                repeatList.set(4, true);
                break;
                case 6: movesList.set(5, "O");
                repeatList.set(5, true);
                break;
                case 7: movesList.set(6, "O");
                repeatList.set(6, true);
                break;
                case 8: movesList.set(7, "O");
                repeatList.set(7, true);
                break;
                case 9: movesList.set(8, "O");
                repeatList.set(8, true);
                break;
                default: System.out.println("Error with player 1 switch loop");
                break;
                } 
            }
        }
    public void PlayerCondition() {
        if (player == 1) {
            winCondition = 1;
        }
        else {
            winCondition = 2;
        }
    }
    public int WinConditions() {
        if (repeatList.get(0) == true && repeatList.get(1) == true && repeatList.get(2) == true && repeatList.get(3) == true && repeatList.get(4) == true && repeatList.get(5) == true && repeatList.get(6) == true && repeatList.get(7) == true && repeatList.get(8) == true) {
            winCondition = 3;
        }
        if (movesList.get(0) == movesList.get(1) && movesList.get(1) == movesList.get(2)) {
            PlayerCondition();
        }
        if (movesList.get(3) == movesList.get(4) && movesList.get(4) == movesList.get(5)) {
            PlayerCondition();
        }
        if (movesList.get(6) == movesList.get(7) && movesList.get(7) == movesList.get(8) ) {
            PlayerCondition();
        } 
        if (movesList.get(0) == movesList.get(3) && movesList.get(3) == movesList.get(6)) {
            PlayerCondition();
        } 
        if (movesList.get(1) == movesList.get(4) && movesList.get(4) == movesList.get(7)) {
            PlayerCondition();
        } 
        if (movesList.get(2) == movesList.get(5) && movesList.get(5) == movesList.get(8)) {
            PlayerCondition();
        } 
        if (movesList.get(0) == movesList.get(4) && movesList.get(4) == movesList.get(8)) {
            PlayerCondition();
        } 
        if (movesList.get(2) == movesList.get(4) && movesList.get(4) == movesList.get(6)) {
            PlayerCondition();
        } 
        return winCondition;
    }
    public void Output() {
        System.out.println(" " + movesList.get(0) + " | " + movesList.get(1) + " | " + movesList.get(2));
        System.out.println("-----------");
        System.out.println(" " + movesList.get(3) + " | " + movesList.get(4) + " | " + movesList.get(5));
        System.out.println("-----------");
        System.out.println(" " + movesList.get(6) + " | " + movesList.get(7) + " | " + movesList.get(8));
    }
public static void main(String[] args){
    TicTacToe tictactoe = new TicTacToe();
    tictactoe.MenuDecision();
    tictactoe.Output();
    tictactoe.TicTacToeRunner();
}
}
