package Stack;
import java.util.Scanner;

public class ArrayStackUser{

    static class ArrayStack{

    int [] arr;
    int top;
    int capacity;

    public ArrayStack(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.top=-1;
    }
    public void push(int val){
        if(isFull()){
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top]=val;
    }
    public void populateStack(Scanner sc){
        System.out.println("Enter the number of elements to push (Max "+ capacity + "): ");
        int count =sc.nextInt();

        if(count>capacity){
            System.out.println("Error : Count Exceeds stack capacity: ");
            return;
        }
        for(int i=0;i<count;i++){
            System.out.println("Enter the element: "+(i+1)+ " ");
            int val=sc.nextInt();
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
                if (i == top) {
                    System.out.println("[" + i + "] \t " + arr[i] + " <-- TOP");
                } else if (i == 0) {
                    System.out.println("[" + i + "] \t " + arr[i] + " <-- BOTTOM");
                } else {
                    System.out.println("[" + i + "] \t " + arr[i]);
                }
            }
        }
        public boolean isFull() {
    return top == capacity - 1;
}

public boolean isEmpty() {
    return top == -1;
}
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the capacity of Stack");
            int capacity=sc.nextInt();
            if(capacity<=0){
                System.out.println("Capacity must be greater than 0");
                sc.close();
                return ;
            }
            ArrayStack stack =new ArrayStack(capacity);
            stack.populateStack(sc);
            stack.traverse();
        }
}
