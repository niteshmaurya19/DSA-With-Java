package LinkedList;
import java.util.Scanner;
public class DeletionSinglyLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    int n;
    Node head;
    public void CreateList(Scanner sc){

        System.out.println("Enter the Number of Nodes: ");
        n=sc.nextInt();

        Node tail=null;
        for(int i=0;i<n;i++){
            System.out.println("Enter the data for node"+(i+1));
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
            System.out.println("List is Empty:");
            return;
        }
        Node current=head;
        System.out.println("Linked List Elements is:");
        while (current!=null) {
            System.out.print(current.data+"-> ");
            current=current.next;
        }
        System.out.println("null");

    }
    public void DeleteNode(Scanner sc){

        if (head == null) {
            System.out.println("List is empty! Nothing to delete.");
            return;
        }

        System.out.println("\nEnter the element value to delete: ");
        int delete = sc.nextInt();

        if (head.data == delete) {
            head = head.next;
            System.out.println("Deleted " + delete + " from head.");
            PrintList();
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.data == delete) {
                prev.next = current.next;
                System.out.println("Deleted " + delete + " from the list.");
                break;
            } else {
                prev = current;
                current = current.next;
            }
        }

        PrintList();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DeletionSinglyLL del=new DeletionSinglyLL();
        del.CreateList(sc);
        del.PrintList();
        del.DeleteNode(sc);
        sc.close();
    }
}
