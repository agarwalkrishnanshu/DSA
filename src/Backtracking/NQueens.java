package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Problem: N Queens problem
    N * N chessboard
    N Queens
    Print all solutions where queens are safe
    Queen can move forward, back and diagonally without any limitation

Complexity: 
*/
public class NQueens {
    public static void saveBoard(char board[][], List<List<String>> boardsList) {
        List<String> newBoard = new ArrayList<>();
        String row="";
        for(int i = 0; i < board.length; i++){
            row="";
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }
                else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        boardsList.add(newBoard);
    }
    public static boolean isSafe(char board[][], int row, int col) {

        // Horizontal direction
        for(int i =0; i < board.length; i++){
            if(board[row][i] == 'Q'){
                return false;
            }
            
        }
        // Vertical
        for(int j = 0; j < board[0].length; j++){
            if(board[j][col] == 'Q'){
                return false;
            }
        }
        // Upper Left
        int r = row;
        for(int c=col; r>=0 && c>=0 ;r--,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // Upper right
        r = row;
        for(int c=col; r>=0 && c<board.length ;r--,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // Lower Left
        int c = col;
        for(r=row; r<board.length && c>=0 ;r++,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // Lower Right
        c = col;
        for(r=row; r<board.length && c<board[0].length ;r++,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
        
    }
    public static void helpQueen(char board[][], List<List<String>> boardsList, int col) {
        if(col == board.length){
            saveBoard(board, boardsList);

        }
        for(int row=0; row < board.length; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                helpQueen(board, boardsList, col+1);
                board[row][col] = '.';
            }
        }
       
        
    }
    public static List<List<String>> placeQueens(int n){
        List<List<String>> boardsList = new ArrayList<>();
        char board[][] = new char[n][n];
        helpQueen(board, boardsList, 0);

        return boardsList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Possible Solutions:");
        System.out.println(placeQueens(n));
    }
}
