package Stack;

import java.util.Scanner;

public class ReverseStack {

    static class ArrayStack {
        int[] arr;
        int top;
        int capacity;

        public ArrayStack(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(int val) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push " + val);
                return;
            }
            arr[++top] = val;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            return arr[top--];
        }

        public void populateStack(Scanner sc) {
            System.out.print("Enter number of elements to push (Max " + capacity + "): ");
            int count = sc.nextInt();

            if (count > capacity || count <= 0) {
                System.out.println("Error: Count must be between 1 and " + capacity);
                return;
            }

            for (int i = 0; i < count; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                int val = sc.nextInt();
                push(val);
            }
        }

        public void traverse() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Nothing to traverse.");
                return;
            }

            System.out.println("\n--- Stack Traversal (LIFO Order) ---");
            System.out.println("Index \t Value");
            for (int i = top; i >= 0; i--) {
                if (i == top && i == 0) {
                    System.out.println("[" + i + "] \t " + arr[i] + " <-- TOP & BOTTOM");
                } else if (i == top) {
                    System.out.println("[" + i + "] \t " + arr[i] + " <-- TOP");
                } else if (i == 0) {
                    System.out.println("[" + i + "] \t " + arr[i] + " <-- BOTTOM");
                } else {
                    System.out.println("[" + i + "] \t " + arr[i]);
                }
            }
        }

        private void insertAtBottom(int val) {
            if (isEmpty()) {
                push(val);
                return;
            }

            int temp = pop();
            insertAtBottom(val);
            push(temp);
        }

        public void reverse() {
            if (isEmpty()) {
                return;
            }

            int topElement = pop();
            reverse();
            insertAtBottom(topElement);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of Stack: ");
        int capacity = sc.nextInt();

        if (capacity <= 0) {
            System.out.println("Capacity must be greater than 0.");
            sc.close();
            return;
        }

        ArrayStack stack = new ArrayStack(capacity);
        stack.populateStack(sc);

        System.out.println("\n--- Original Stack ---");
        stack.traverse();

        stack.reverse();

        System.out.println("\n--- Reversed Stack ---");
        stack.traverse();

        sc.close(); // Cleanly release system resources
    }
}