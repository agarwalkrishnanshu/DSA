package Hashing;
// Java program to demonstrate working of HashTable 

import java.util.*;

class HashTableLearning {
    public static void hashtableExample1(){
        // 1. Hashtable(): This creates an empty hashtable with the default load factor of 0.75
        // and an initial capacity is 11
        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();
  
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>();
  
        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
  
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
    public static void hashtableExample2(){
        Hashtable<Integer, String> ht1 = new Hashtable<>(4);
  
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>(2);
  
        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
  
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
    public static void hashtableExample3(){
        // 3. Hashtable(int size, float fillRatio): 
        // This version creates a hash table that has an initial size specified by size 
        // and fill ratio specified by fillRatio. 
        // fill ratio: Basically, it determines how full a hash table can be before it is resized upward 
        // and its Value lies between 0.0 to 1.0.
        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1
            = new Hashtable<>(4, 0.75f);
  
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>(3, 0.5f);
  
        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
  
        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
  
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
    public static void hashtableExample4(){
        // 4 Creating a Hashtable using a Map 
        Map<Integer, String> hm = new HashMap<>();
  
        // Inserting the Elements
        // using put() method
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
  
        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> htUsingMap
            = new Hashtable<Integer, String>(hm);
  
        // Print mappings to the console
        System.out.println("Mappings of ht2 : " + htUsingMap);
    }

    public static void main(String args[]) {
        hashtableExample1();
        hashtableExample2();
        hashtableExample3();
        hashtableExample4();
    }
}