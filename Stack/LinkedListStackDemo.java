package Stack;

import java.util.Scanner;

public class LinkedListStackDemo {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedListStack {
        private Node top;
        private int size;

        public LinkedListStack() {
            this.top = null;
            this.size = 0;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int size() {
            return size;
        }

        public void push(int val) {
            Node newNode = new Node(val);
            newNode.next = top;
            top = newNode;
            size++;
            System.out.println("Pushed : " + val);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! The stack is empty.");
                return -1;
            }
            int poppedData = top.data;
            top = top.next;
            size--;
            return poppedData;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Nothing to peek.");
                return -1;
            }
            return top.data;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("[ Empty Stack ]");
                return;
            }

            System.out.println("\nStack (Top to Bottom)");
            Node curr = top;
            while (curr != null) {
                if (curr == top) {
                    System.out.println("| " + curr.data + " | <-- TOP");
                } else if (curr.next == null) {
                    System.out.println("| " + curr.data + " | <-- BOTTOM");
                } else {
                    System.out.println("| " + curr.data + " |");
                }
                curr = curr.next;
            }
        }

        public void populate(Scanner sc) {
            System.out.print("Enter number of elements to push: ");
            int count = sc.nextInt();

            for (int i = 0; i < count; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                push(sc.nextInt());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListStack stack = new LinkedListStack();

        stack.populate(sc);
        stack.display();

        System.out.println("\nCurrent Top (peek): " + stack.peek());
        System.out.println("Current Stack Size: " + stack.size());

        sc.close();
    }
}