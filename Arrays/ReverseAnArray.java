package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseAnArray {
    int size;
    int[] a;
    static Scanner sc=new Scanner(System.in);

    public void Create1DArray(){
        System.out.println("Enter the Size of Array");
        size= sc.nextInt();
        a=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+"th elements");
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array is: "+Arrays.toString(a));
    }
    public void ReverseAn1DArray(){
       int left = 0;
        int right = size - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
    }
    System.out.println("Reversed Array is: "+ Arrays.toString(a));
}
    public static void main(String[] args) {
        ReverseAnArray rev=new ReverseAnArray();
        rev.Create1DArray();
        rev.ReverseAn1DArray();
    }
}
