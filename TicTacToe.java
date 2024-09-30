import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class TicTacToe {
    Scanner in = new Scanner(System.in);
    int choice = 0;
    int player = 1;
    int winCondition = 0;
    ArrayList<String> movesList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
    ArrayList<Boolean> repeatList = new ArrayList<>(Arrays.asList(false, false, false, false, false, false, false, false, false));
    
    public void TicTacToeRunner() {
        while (winCondition == 0) {
            Decision();
            WinConditions();
            Output();
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
            case 2: System.out.println("Player 2 wins!");
            break;
            case 3: System.out.println("There is a draw, how else did you expect tic tac toe to end?");
            break;
            default: System.out.println("Error with winCondition switch loop");
        }
    }
    public void Decision() {
        int choice = -1;
        while (choice < 1 || choice > 9 || repeatList.get(choice - 1) == true) {
            if (choice < 1 || choice > 9) {
                System.out.println("Player "+ player + ", please choose a move that is an integer between 1 and 9: ");
            }
            else if (repeatList.get(choice -1) == true) {
                System.out.println("Player " + player + ", please choose a move that hasn't already been taken: ");
            }
            try { 
                choice = in.nextInt();
            } catch (InputMismatchException e) {
                in.nextLine();
                choice = -1;
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
        if (movesList.get(0) == movesList.get(1) && movesList.get(2) == movesList.get(3)) {
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
        if (repeatList.get(0) == true && repeatList.get(1) == true && repeatList.get(2) == true && repeatList.get(3) == true && repeatList.get(4) == true && repeatList.get(5) == true && repeatList.get(6) == true && repeatList.get(7) == true && repeatList.get(8) == true) {
            winCondition = 3;
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
    tictactoe.Output();
    tictactoe.TicTacToeRunner();
    }
}
