import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNum {
    static Scanner sc = new Scanner(System.in);
    int size;
    int[] a;
    int max;
    int min;
    public void CreateArray(){
        System.out.println("Enter the size of Array");
        size=sc.nextInt();
        a=new int[size];
        if(size>100){
            System.out.println("index out of bound");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.println("Enter "+ (i+1)+"th number");
            a[i]=sc.nextInt();
        }
        System.out.println("Elements: "+Arrays.toString(a));
    }
    public void SecondLargest(){
        int largest= Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(a[i]>largest){
            secondlargest=largest;
            largest=a[i];
            }
            else if(a[i]<largest && a[i]>secondlargest){
                secondlargest=a[i];
            }
        }
        System.out.println("The secend largest Number is In this Array: "+ secondlargest);
    }
public static void main(String[] args) {
    SecondLargestNum second=new SecondLargestNum();
    second.CreateArray();
    second.SecondLargest();
}
}
