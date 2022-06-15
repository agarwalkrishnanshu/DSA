package LinkedList;


/**
 * https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1/#
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

class RotateLinkList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;

            for (int i = 0; i < n - 1; i++) {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = sc.nextInt();

            RotateLinkListSolution ob = new RotateLinkListSolution();
            head = ob.rotate(head, k);
            printList(head);
        }
        sc.close();
    }

    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends

/*
 * node of linked list:
 * 
 * class Node{
 * int data;
 * Node next;
 * Node(int d){
 * data=d;
 * next=null;
 * }
 * }
 * 
 */

class RotateLinkListSolution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here

        int count = 0;
        Node current = head;
        Node next = null;
        while (current != null && count < k - 1) {
            current = current.next;
            count++;
        }
        // System.out.println("count: "+count+ " current: "+current.data);

        if (current.next != null) {
            next = current.next;
        } else {
            return head;
        }

        // System.out.println("next: "+next.data+ " current: "+current.data);

        while (next.next != null) {
            next = next.next;
        }
        // System.out.println("next: "+next.data+ " current: "+current.data);
        next.next = head;
        head = current.next;
        current.next = null;
        return head;

    }
}
