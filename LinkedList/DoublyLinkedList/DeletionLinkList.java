package LinkedList.DoublyLinkedList;

import java.util.Scanner;

public class DeletionLinkList {
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
    public void PrintBackward(){
        if(head==null){
            System.out.println("List is Empty.");
            return;
        }
        Node current=tail;
        System.out.println("The Backward traversal Linked List is:");
        while(current!=null){
            System.out.print(current.data+"<->");
            current=current.prev;
        }
        System.out.println("null");
    }
    public void DeleteAtHead(){
        if(head==null){
            System.out.println("Nothing to be delete");
            return;
        }
        if(head==tail){
            head.next=null;
            tail.next=null;
        }
    System.out.println("Deleted Successfully.");
            head=head.next;
            head.prev=null;
        
    }
    public void DeleteAtTail(){
        if(tail==null){
            System.out.println("Nothing to be delete.");
            return;
        }
        if(head==tail){
            head.next=null;
            tail.next=null;
            return;
        }
        System.out.println("Deleted Successfully.");
            tail=tail.prev;
            tail.next=null;
    }
    public void DeleteAtPos(Scanner sc){
        System.out.println("Enter the element which you want to delete: ");
        int val=sc.nextInt();

        Node current=head;

        if(val==head.data){
            DeleteAtHead();
            PrintForward();
            PrintBackward();
            return;
        }
        if(val==tail.data){
            DeleteAtTail();
            PrintForward();
            PrintBackward();
            return;
        }
        while (current != null && current.data != val) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Value " + val + " not found in the list.");
            return;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Deleted successfully.");
        PrintForward();
        PrintBackward();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DeletionLinkList list=new DeletionLinkList();
        list.CreateLinkedList(sc);
        list.PrintForward();
        list.PrintBackward();
        list.DeleteAtPos(sc);
    }
}
