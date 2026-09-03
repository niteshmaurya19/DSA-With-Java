package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class ReverseElements {
    static class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    Node head;
    public void CreateList(Scanner sc){
        System.out.println("Enter the number of Nodes: ");
        int n= sc.nextInt();

        if(n<=0){
            System.out.println("List size must be greater than zero.");
            return;
        }
        Node tail=null;

        for(int i=0;i<n;i++){
            System.out.println("Enter the data for node "+(i+1)+":");
            int val=sc.nextInt();
            Node newNode=new Node(val);

            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
    }
    public void PrintList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node current=head;
        System.out.println("Linked List: ");

        while(current!=null){
            System.out.print(current.data + "-> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public void ReverseEl(){
        Node prev=null;
        Node current=head;
        Node next=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        System.out.println("Reverse elements of node: ");
        PrintList();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReverseElements rev=new ReverseElements();
        rev.CreateList(sc);
        rev.PrintList();
        rev.ReverseEl();
    }
}
