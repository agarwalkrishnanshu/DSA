package LinkedList;


// https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1/#

// { Driver Code Starts
import java.util.Scanner;

/* class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
} */

class Is_LinkedList_Palindrom {
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            // int k = sc.nextInt();
            // int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }

            
            if (isPalindrome(head) == true)
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
        sc.close();
    }
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        // Your code here
        if (head == null) {
            return false;
        }
        int num = 0;
        int reverseNum = 0;
        int unit = 1;
        Node current = head;
        while (current != null) {
            num = num * 10 + current.data;
            reverseNum = current.data * unit + reverseNum;
            unit = unit * 10;
            current = current.next;
        }
        // System.out.println("num: "+num+" reverseNum: "+reverseNum);
        if (num == reverseNum) {
            return true;
        }
        return false;
    }
}

// } Driver Code Ends

/*
 * Structure of class Node is
 * class Node
 * {
 * int data;
 * Node next;
 * 
 * Node(int d)
 * {
 * data = d;
 * next = null;
 * }
 * }
 */
