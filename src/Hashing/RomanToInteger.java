package Hashing;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import Util.StopWatch;
/**
 * Leetcode: Roman to Integer
 * Easy
 * 23 June 2022
 * https://leetcode.com/problems/roman-to-integer/
 */

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("I", 1);
        hm.put("IV", 4);
        hm.put("V", 5);
        hm.put("IX", 9);
        hm.put("X", 10);
        hm.put("XL", 40);
        hm.put("L", 50);
        hm.put("XC", 90);
        hm.put("C", 100);
        hm.put("CD", 400);
        hm.put("D", 500);
        hm.put("CM", 900);
        hm.put("M", 1000);
        // System.out.println("hm: "+hm);
        int num = 0;
        for(int i=0;i<s.length();i++){
            String ch = s.substring(i, i+1);
            // System.out.println("i: "+i+" ch: "+ch+" num: "+num);
            if(ch.equals("I") && (i+1) < s.length()){
                if(s.charAt(i+1) == 'V'){
                    // 4
                    num = num+hm.get("IV");
                    i++;
                }else if(s.charAt(i+1) == 'X'){
                    // 9
                    num = num + hm.get("IX");
                    i++;
                }else{
                    num = num + hm.get(ch);
                }
            }else if(ch.equals("X") && (i+1) < s.length()){
                if(s.charAt(i+1) == 'L'){
                    // 40
                    num = num + hm.get("XL");
                    i++;
                }else if(s.charAt(i+1) == 'C'){
                    // 90
                    num = num + hm.get("XC");
                    i++;
                }else{
                    num = num + hm.get(ch);
                }                
            }else if(ch.equals("C") && (i+1) < s.length()){
                if(s.charAt(i+1) == 'D'){
                    // 400
                    num = num + hm.get("CD");
                    i++;
                }else if(s.charAt(i+1) == 'M'){
                    // 900
                    num = num + hm.get("CM");
                    i++;
                }else{
                    num = num + hm.get(ch);
                }
            }else{
                // System.out.println(" hm contains: "+hm.containsKey(ch));
                num = num + hm.get(ch);
            }
        }
        return num;   
    }
    public int romanToIntApproach2(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
    
        int sum = 0;
        int prev = map.get(s.charAt(0));
        int next = 0;
    
        for (int i = 1; i < s.length(); i++) {
            next = map.get(s.charAt(i));
    
            if (prev < next) {
                sum -= prev;
            } else {
                sum += prev;
            }
    
            //udpare prev because it is like sliding window
            prev = next;
        }
    
        sum += prev;//corner case when only one digit, we need to let sum = prev, so we add prev, not next
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        
        String s = sc.next().trim();
        RomanToInteger ri = new RomanToInteger();

        StopWatch sw = new StopWatch();
        sw.start();
        System.out.println("Approach 1: "+ri.romanToInt(s));
        sw.stop();
        System.out.println(sw.getElapsedTime());
        sw.reset();

        sw.start();
        System.out.println("Approach 2: "+ri.romanToInt(s));
        sw.stop();
        System.out.println(sw.getElapsedTime());
        sc.close();
    }
    
}
