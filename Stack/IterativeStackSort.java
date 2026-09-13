package Stack;

import java.util.Scanner;

public class IterativeStackSort {

    static class ArrayStack {
        private int[] arr;
        private int top;
        private int capacity;

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
                System.out.println("Stack Overflow!");
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

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[top];
        }

        public void populate(Scanner sc) {
            System.out.print("Enter number of elements to push (Max " + capacity + "): ");
            int count = sc.nextInt();

            if (count > capacity || count <= 0) {
                System.out.println("Invalid count!");
                return;
            }

            for (int i = 0; i < count; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                push(sc.nextInt());
            }
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("[ Empty Stack ]");
                return;
            }
            System.out.print("Bottom -> [ ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + (i == top ? "" : ", "));
            }
            System.out.println(" ] <- Top");
        }

        public void sortIteratively() {
            if (isEmpty()) {
                return;
            }

            ArrayStack tempStack = new ArrayStack(this.capacity);

            while (!this.isEmpty()) {
                int curr = this.pop();

                while (!tempStack.isEmpty() && tempStack.peek() < curr) {
                    this.push(tempStack.pop());
                }

                tempStack.push(curr);
            }

            while (!tempStack.isEmpty()) {
                this.push(tempStack.pop());
            }
        }
    }

    public static ArrayStack initializeStack(Scanner sc) {
        System.out.print("Enter stack capacity: ");
        int capacity = sc.nextInt();

        while (capacity <= 0) {
            System.out.print("Capacity must be greater than 0. Re-enter: ");
            capacity = sc.nextInt();
        }

        return new ArrayStack(capacity);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayStack stack = initializeStack(sc);
        stack.populate(sc);

        System.out.println("\n--- Before Sorting ---");
        stack.display();

        stack.sortIteratively();

        System.out.println("\n--- After Iterative Sorting (Ascending) ---");
        stack.display();

        sc.close();
    }
}