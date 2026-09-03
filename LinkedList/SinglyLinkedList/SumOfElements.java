package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class SumOfElements {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    Node head;

    public void CreateList(Scanner sc) {
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Null list is not Allowed");
            return;
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

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty: ");
            return;
        }
        Node current = head;
        System.out.println("Linked List is: ");
        while (current != null) {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void Sum() {
        Node current = head;
        int sum = 0;

        while (current != null) {
            sum = sum + current.data;
            current = current.next;
        }
        System.out.println("Sum of Elements is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfElements sm = new SumOfElements();
        sm.CreateList(sc);
        sm.printList();
        sm.Sum();
    }
}
