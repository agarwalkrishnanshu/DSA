package Hashing;
/*
 *  GFG: Union of Two Linked Lists
 *  Easy
 *  01 July 2022
 *  https://practice.geeksforgeeks.org/problems/union-of-two-linked-list/1/# 
 */

// { Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

class UnionTwoLinkedList {
    static Scanner sc = new Scanner(System.in);

    public static Node inputList(int size) {
        Node head, tail;
        int val;

        val = sc.nextInt();

        head = tail = new Node(val);

        size--;

        while (size-- > 0) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        return head;
    }

    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String args[]) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m;

            n = sc.nextInt();
            Node head1 = inputList(n);

            m = sc.nextInt();
            Node head2 = inputList(m);

            Sol obj = new Sol();

            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}// } Driver Code Ends

/*
 * class Node
 * {
 * int data;
 * Node next;
 * Node(int d) {data = d; next = null; }
 * }
 */

class Sol {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        HashSet<Integer> set = new HashSet<>();
        
        Node current = head1;
        while(current != null){
            set.add(current.data);
            current = current.next;
        }
        // System.out.println("After first list:"+set);

        current = head2;
        while(current != null){
            set.add(current.data);
            current = current.next;
        }
        // System.out.println("After second list:"+set);

        // All the values are unique and in a set now
        // We will create a array from this list and sort it and then 
        // create a linked list with the sorted values
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        Node newHead = null;
        current = null;
        for(Integer num : list){
            if(current == null){
                current = new Node(num);
                newHead = current;
            }else{
                current.next = new Node(num);
                current = current.next;
            }
        }
        current.next = null;
        // UnionTwoLinkedList.printList(newHead);
        return newHead;
    }
}
