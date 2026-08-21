import java.util.Arrays;
import java.util.Scanner;

public class Insertion1DArray{
    int[] a= new int[100];
    int size;
    static Scanner sc=new Scanner(System.in);
    public void CreateArray( int size){
        if(size>100){
            System.out.println("out of range");
            return;
        }
        this.size=size;
        for(int i=0;i<size;i++){
            System.out.println("Enter "+ (i+1)+"th number");
            a[i]=sc.nextInt();
        }
        System.out.println("Capacity --"+a.length+"  And size--"+size);
        System.out.println("Elements: " + Arrays.toString(Arrays.copyOf(a, size)));
    }
    public static void main(String[] args){
        Insertion1DArray ab=new Insertion1DArray();
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        ab.CreateArray(n);
    }
}