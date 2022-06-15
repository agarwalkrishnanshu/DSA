package LinkedList;

/**
 * Leetcode: Reverse Nodes in k-Group
 * Hard
 * 13 June 2022
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 */
/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {

        int count = 1;
        ListNode current = head;
        ListNode prev = null;
        ListNode nextNode = null;
        ListNode newHead = null;
        ListNode lastNode = null;

        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        // System.out.println("Length: "+length);
        current = head;
        while (current != null) {
            // System.out.println("Length: "+length+" length/k: "+(length/k)+" current:
            // "+current.val);
            if (length / k != 0) {
                while (count <= k && current != null) {
                    nextNode = current.next;
                    current.next = prev;
                    prev = current;
                    current = nextNode;
                    count++;
                }
                length = length - k;
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
            if (length / k == 0) {
                lastNode.next = current;
                current = null;
            }

        }
        return newHead;

    }
}
