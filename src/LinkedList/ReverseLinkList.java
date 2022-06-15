package LinkedList;


/**
 * https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/#
 */
// { Driver Code Starts
import java.util.Scanner;
import java.io.*;

/* class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

} */

class ReverseLinkList {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;

            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            ReverseLinkListSolution ob = new ReverseLinkListSolution();
            head = ob.reverseList(head);
            printList(head);
            t--;
        }
        sc.close();
    }
}
// } Driver Code Ends

// function Template for Java

/*
 * linked list node class:
 * 
 * class Node {
 * int value;
 * Node next;
 * Node(int value) {
 * this.value = value;
 * }
 * }
 * 
 */

class ReverseLinkListSolution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        Node current = head;
        Node next = null;
        Node prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;

    }
}
