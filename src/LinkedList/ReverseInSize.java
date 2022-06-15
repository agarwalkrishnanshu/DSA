package LinkedList;

/**
 * GFG: Reverse a Linked List in groups of given size. 
 * Medium
 * 13 June 2022
 * https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1#
 */
// { Driver Code Starts
import java.util.Scanner;

/* class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
} */

class ReverseInSize {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res);
            System.out.println();
        }
        sc.close();
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}

// } Driver Code Ends

/*
 * node class of the linked list
 * 
 * class Node
 * {
 * int data;
 * Node next;
 * Node(int key)
 * {
 * data = key;
 * next = null;
 * }
 * }
 * 
 */

class Solution {
    public Node reverse(Node node, int k) {
        // Your code here
        int count = 1;
        Node current = node;
        Node prev = null;
        Node nextNode = null;
        Node newHead = null;
        Node lastNode = null;
        while (current != null) {
            while (count <= k && current != null) {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
                count++;
            }

            count = 1;
            if (newHead == null) {
                newHead = prev;
            }
            if (lastNode != null) {
                lastNode.next = prev;
            } else {
                lastNode = prev;
            }

            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            prev = null;

        }
        return newHead;
    }
}
