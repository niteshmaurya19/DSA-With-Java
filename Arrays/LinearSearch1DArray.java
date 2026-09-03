package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch1DArray {
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
    public void LinearSearch(){
        System.out.println("Enter the number you search in this 2D array");
        int SearchValue=sc.nextInt();
        for(int i=0;i<size;i++){
            if(a[i]==SearchValue){
                System.out.println("the index of targeted value is: "+i+"th");
            }
        }
    }
    public static void main(String[] args) {
        LinearSearch1DArray search =new LinearSearch1DArray();
        search.CreateArray(10);
        search.LinearSearch();
    }
}
