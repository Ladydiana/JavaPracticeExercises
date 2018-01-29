/**
 * @author Diana Cristina Culincu
 */

package java2novice;

import java.util.LinkedList;

/*
 * Write a sample code to reverse Singly Linked List by iterating through it only once.
 */
public class RevertSinglyLinkedList {
    
    
    public static void reverseListIterative(Node head) {
        
        Node currNode = head;
        Node prevNode = null;
        Node nextNode = null;
        
        while (currNode!=null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        
        head = prevNode;
        
        System.out.println("Iteration Reverse: ");
        display(head);
    }
    
    public static void reverseListRecursive (LinkedListT l) {
        
        
    }
    
    private static void display(Node head){
	Node currNode = head;
	while(currNode!=null){
		System.out.print("->" + currNode.data);
		currNode=currNode.next;
	}
    }
    
    public static void main(String args[]) {
        LinkedListT l;
        l = new LinkedListT();
        l.addAtBegin(1);
        l.addAtBegin(2);
        l.addAtBegin(3);
        l.addAtBegin(4);
        l.addAtBegin(5);
        l.addAtBegin(6);
        
        reverseListIterative(l.head);
    }
    
}

class Node {
    public Node next;
    public int data;
    
    public Node(int data) {
        this.data = data;
        this.next = null; 
    }
}


class LinkedListT {
    public Node head;
    
    public LinkedListT() {
        head = null;
    }
    
    public void addAtBegin(int data) {
        Node n = new Node (data);
        n.next = head;
        head = n;
    }
    
}
