import java.util.Arrays;
import java.util.Scanner;

public class Deletion1DArray {
    int [] a= new int[100];
        int size;
        static Scanner num= new Scanner(System.in);
    public void Create1DArray(int size){
        if(size>100){
            System.out.println("Out of range");
            return;
        }
        this.size=size;
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+"th number");
            a[i]=num.nextInt();
        }
        System.out.println("the capacity is array is: "+a.length+"  and size is : "+ size );
        System.out.println("Elements: "+ Arrays.toString(Arrays.copyOf(a, size)));
    }
    public void DeletionOfElement(int loc){
        if(size==a.length){
            System.out.println("out of range");
        }
        else if(loc<0||loc>size){
            System.out.println("deletion failed");

        }
        for(int i=loc;i<size;i++){
            a[i]=a[i+1];
        }
        a[size]=0;
        size--;
        System.out.println("the capacity is array is: "+a.length+"  and size is : "+ size );
        System.out.println("Elements: "+ Arrays.toString(Arrays.copyOf(a, size)));
    }
    public static void main(String[] args) {
        Deletion1DArray del=new Deletion1DArray();
        System.out.println("enter the number of elements");
        int n=num.nextInt();
        del.Create1DArray(n);

        System.out.println("enter the location of number which one you want to delete");
        n=num.nextInt();
        del.DeletionOfElement(n);
    }
}
