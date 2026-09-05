package LinkedList.DoublyLinkedList;

import java.util.Scanner;

public class MaxMinElement {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node tail;
    Node head;
    public void CreateLinkedList(Scanner sc){
        System.out.println("Enter the number of Nodes:");
        int n=sc.nextInt();
        if (n <= 0) {
            System.out.println("List size must be greater than 0.");
            return;
        }

        for(int i=0;i<n;i++){
            System.out.println("enter the value of Node "+ (i+1));
            int val=sc.nextInt();
            Node newNode=new Node(val);

            if(head==null){
                head=newNode;
                tail=head;
            }
            else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
    }
    public void PrintForward(){
        if(head==null){
            System.out.println("List is Empty.");
            return;
        }
        Node current=head;
        System.out.println("The Forward traversal Linked List is:");
        while(current!=null){
            System.out.print(current.data+"<->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void MaxMinElements(){
        Node current=head;
        int max=current.data;
        int min=current.data;

        while(current!=null){
            if(current.data>max){
                max=current.data;
            }
            if(current.data<min){
                min=current.data;
            }
            current=current.next;
        }
        System.out.println("Maximum element in Linked List is---> "+max);
        System.out.println("Minimum element in Linked List is---> "+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MaxMinElement mm=new MaxMinElement();
        mm.CreateLinkedList(sc);
        mm.PrintForward();
        mm.MaxMinElements();
    }
}
