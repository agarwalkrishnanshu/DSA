package Backtracking;
/*
Similar to N Queens problem
Backtracking problem
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KnightOnChessBoard {
    private static void saveBoard(int board[][], List<List<Integer>> boardList) {

        
        
    }
    public static int nextMove(int x1, int y1, int a, int b, int n) {
        int x2, y2;
        // Case x2 = x1 +- a & y2 = y1 +- b
        // Possible combinations x1 + a, y1 + b
        // x1 + a, y1 - b
        // x1 - a, y1 + b
        // x1 - a, y1 - b

        // Possible move
        // if(x1+a < n && y1 + b < n){
        //     return new pair(x1+ a, y1 + b);

        // }
        // if(x1+a < n && y1 - b > 0){
        //     return (x1+ a, y1 - b);

        // }
        // if(x1 - a > 0 && y1 + b < n){
        //     return (x1 - a, y1 + b);

        // }
        // if(x1 - a > 0 && y1 - b > 0){
        //     return (x1 - a, y1 - b);

        // }
        return -1;        
    }
    public static void helpKnight(List<List<Integer>> resultList, int n, int x1, int y1, int a, int b) {

        // List<Integer> result = new ArrayList<>();
        // if(nextMove(x1, y1, a, b, n) == -1){
        //     return;
        // }
        // if(nextMove(x1, y1, a, b, n) == n-1 ){
        //     // The knight was able to reach final position then save the result
        //     count ++;
        //     result.add(count);
        // }
        // if(nextMove(x1, y1, a, b, n) < n-1){
        //     count ++;
        // }
    }

    public static List<List<Integer>> knightlOnAChessboard(int n) {
        List<List<Integer>> resultList = new ArrayList<>();
        int board[][] = new int[n][n];
        for(int a = 1; a < n; a++){
            for(int b = 1; b < n; b++){
                helpKnight(resultList, n,0, 0, a, b);
            }
        }
        return resultList;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> result = knightlOnAChessboard(n);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
        sc.close();
    }
    
}
