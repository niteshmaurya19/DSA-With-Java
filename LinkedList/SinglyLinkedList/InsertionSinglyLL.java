package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class InsertionSinglyLL {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    int n;
    Node head;

    public void CreateList(Scanner sc) {
        System.out.println("Enter the Number of Nodes: ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The list is empty");
        }
        Node tail = null;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the data for node " + (i + 1) + ":");
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public void PrintList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        System.out.println("Linked List: ");

        while (current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void InsertAtFront(Scanner sc){
        System.out.println("Enter the new elements/Node to Add at the Front; ");
        int front=sc.nextInt();
        Node newNode=new Node(front);
        newNode.next=head;
        head=newNode;

        PrintList();
    }
    public void InsertAtPosition(Scanner sc) {
        System.out.println("\nEnter the position/index to insert at (0-based):");
        int pos = sc.nextInt();

        if (pos < 0) {
            System.out.println("Invalid position!");
            return;
        }

        System.out.println("Enter data to insert:");
        int val = sc.nextInt();
        Node newNode = new Node(val);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            System.out.println("After Insertion at Position " + pos + ":");
            PrintList();
            return;
        }

        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Index out of bounds! List is not long enough.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        System.out.println("After Insertion at Position " + pos + ":");
        PrintList();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertionSinglyLL ins = new InsertionSinglyLL();
        ins.CreateList(sc);
        ins.PrintList();
        ins.InsertAtFront(sc);
        ins.InsertAtPosition(sc);
    }
}
