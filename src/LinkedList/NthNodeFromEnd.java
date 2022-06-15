package LinkedList;

/**
 * https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1#
 */
// { Driver Code Starts
import java.util.Scanner;
/* 
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
} */

public class NthNodeFromEnd {
    Node head;
    Node tail;

    /* Function to print linked list */
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            NthNodeFromEnd llist = new NthNodeFromEnd();
            // int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            // System.out.println(llist.head.data);
            GfG g = new GfG();
            // System.out.println(k);
            System.out.println(g.getNthFromLast(llist.head, k));

            t--;
        }
        sc.close();
    }
}

// } Driver Code Ends

/*
 * Structure of node
 * 
 * class Node
 * {
 * int data;
 * Node next;
 * Node(int d) {data = d; next = null; }
 * }
 */

class GfG {
    // Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {
        // Your code here
        Node current = head;
        if (head == null) {
            return -1;
        }
        int L = 1;
        while (current.next != null) {
            current = current.next;
            L++;
        }
        // System.out.println("L: "+L);
        if (n > L) {
            return -1;
        }
        if (n == 1) {
            return current.data;
        }

        current = head;
        while (current.next != null) {
            // System.out.println("L: "+L);
            if (L == n) {
                return current.data;
            }
            current = current.next;
            L--;
        }
        return -1;
    }
}
