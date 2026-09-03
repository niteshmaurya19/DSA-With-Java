package LinkedList.DoublyLinkedList;

import java.util.Scanner;

public class InsertionLinkList {
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
    public void insertAtHead(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; 
            newNode.prev = tail; 
            tail = newNode;
        }
    }
    public void Insertion(Scanner sc){
        Node current=head;
        System.out.println("Enter the position(Front/anywhere/end) for Insertion:");
        int pos=sc.nextInt();

        if(pos<0){
            System.out.println("Insertion Failed!");
            return;
        }
        System.out.println("Enter data to insert:");
        int val = sc.nextInt();
        Node newNode = new Node(val);
        if(pos==0){
            insertAtHead(val);
            PrintForward();
            PrintBackward();
            return;
        }
        for(int i=0;i<pos-1 && current!=null;i++){
            current=current.next;
        }
        if (current == null) {
            System.out.println("Position " + pos + " is out of bounds.");
            return;
        }

        if (current == tail) {
            insertAtTail(val);
            PrintForward();
            PrintBackward();
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        PrintForward();
        PrintBackward();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InsertionLinkList list=new InsertionLinkList();
        list.CreateLinkedList(sc);
        list.PrintForward();
        list.PrintBackward();
        list.Insertion(sc);
    }
}
