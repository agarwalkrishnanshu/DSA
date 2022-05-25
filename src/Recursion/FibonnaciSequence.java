package Recursion;
import java.util.Scanner;

public class FibonnaciSequence {

    public static void fibonnaci(int a, int b, int n){
        int c = a + b;
        if(n==0){
            return;
        }
        if(n==1){
            System.out.println(c);
            return;
        }
        System.out.println(c);
        fibonnaci(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println();
        if(n>1){
            System.out.println(0);
            System.out.println(1);
            fibonnaci(0, 1, n-2);
        }
    }
}
