import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToe {
    Scanner in = new Scanner(System.in);
    int choice = 0;
    int player = 1;
    int winCondition = 0;
    ArrayList<String> movesList = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " ", " ", " ", " "));
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
            case 1: System.out.println("Player 2 wins!");
            break;
            case 2: System.out.println("Player 1 wins!");
            break;
            case 3: System.out.println("There is a draw, how else did you expect tic tac toe to end?");
            break;
            default: System.out.println("Error with winCondition switch loop");
        }
    }
    public void Decision() {
        System.out.println("Player " + player + " Where would you like to move? (input an integer 1-9) ");
        int choice = in.nextInt();
        while (choice < 1 || choice > 9 || repeatList.get(choice - 1) == true) {
            if (choice < 1 || choice > 9) {
                System.out.println("Please choose a move that is an integer between 1 and 9: ");
            }
            else {
                System.out.println("Please choose a move that hasn't already been taken: ");
            }
            choice = in.nextInt();
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
    public int WinConditions() {
        if (movesList.get(0) == "O" && movesList.get(1) == "O" && movesList.get(2) == "O") {
            winCondition = 1;
        }
        if (movesList.get(3) == "O" && movesList.get(4) == "O" && movesList.get(5) == "O") {
            winCondition = 1;
        }
        if (movesList.get(6) == "O" && movesList.get(7) == "O" && movesList.get(8) == "O") {
            winCondition = 1;
        } 
        if (movesList.get(0) == "O" && movesList.get(3) == "O" && movesList.get(6) == "O") {
            winCondition = 1;
        } 
        if (movesList.get(1) == "O" && movesList.get(4) == "O" && movesList.get(7) == "O") {
            winCondition = 1;
        } 
        if (movesList.get(2) == "O" && movesList.get(5) == "O" && movesList.get(8) == "O") {
            winCondition = 1;
        } 
        if (movesList.get(0) == "O" && movesList.get(4) == "O" && movesList.get(8) == "O") {
            winCondition = 1;
        } 
        if (movesList.get(2) == "O" && movesList.get(4) == "O" && movesList.get(6) == "O") {
            winCondition = 1;
        } 
        if (movesList.get(0) == "X" && movesList.get(1) == "X" && movesList.get(2) == "X") {
            winCondition = 2;
        } 
        if (movesList.get(3) == "X" && movesList.get(4) == "X" && movesList.get(5) == "X") {
            winCondition = 2;
        } 
        if (movesList.get(6) == "X" && movesList.get(7) == "X" && movesList.get(8) == "X") {
            winCondition = 2;
        } 
        if (movesList.get(0) == "X" && movesList.get(3) == "X" && movesList.get(6) == "X") {
            winCondition = 2;
        } 
        if (movesList.get(1) == "X" && movesList.get(4) == "X" && movesList.get(7) == "X") {
            winCondition = 2;
        } 
        if (movesList.get(2) == "X" && movesList.get(5) == "X" && movesList.get(8) == "X") {
            winCondition = 2;
        } 
        if (movesList.get(0) == "X" && movesList.get(4) == "X" && movesList.get(8) == "X") {
            winCondition = 2;
        } 
        if (movesList.get(2) == "X" && movesList.get(4) == "X" && movesList.get(6) == "X") {
            winCondition = 2;
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