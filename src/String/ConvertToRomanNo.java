/**
 * https://practice.geeksforgeeks.org/problems/convert-to-roman-no/1#
 */
// { Driver Code Starts
    import java.util.Scanner;
    import java.util.*;
    
    class ConvertToRomanNo
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                int N = sc.nextInt();
                
                Solution ob = new Solution();
                System.out.println(ob.convertToRoman(N));
                t--;
            }
        }
    }// } Driver Code Ends
    
    
    //User function template for JAVA
    
    class Solution
    {
        String convertToRoman(int n) {
            //code here
            String res = "";
            while(n>=1000){
                res = res + "M";
                n=n-1000;
            }
            while(n>=900){
                res = res+ "CM";
                n=n-900;
            }
            while(n>=500){
                res = res + "D";
                n=n-500;
            }
            while(n>=400){
                res = res + "CD";
                n=n-400;
            }
            while(n>=100){
                res = res + "C";
                n=n-100;
            }
            while(n>=90){
                res = res + "XC";
                n=n-90;
            }
            while(n>=50){
                res = res + "L";
                n=n-50;
            }
            while(n>=40){
                res = res + "XL";
                n=n-40;
            }
            while(n>=10){
                res = res + "X";
                n=n-10;
            }
            while(n>=9){
                res = res + "IX";
                n=n-9;
            }
            while(n>=5){
                res = res + "V";
                n=n-5;
            }
            while(n>=4){
                res = res + "IV";
                n=n-4;
            }
            while(n>=1){
                res = res + "I";
                n=n-1;
            }
            return res;
        }
    }
