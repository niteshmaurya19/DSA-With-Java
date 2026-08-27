import java.util.Arrays;
import java.util.Scanner;
public class MaxAndMinElements {
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
    public void MaxElement(){
        max=a[0];
        min=a[0];
        for(int i=1;i<size;i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Maximum Element of Array is: "+max);
        System.out.println("Minimum Element of Array is: "+min);
    }
    public static void main(String[] args) {
        MaxAndMinElements mm=new MaxAndMinElements();
        mm.CreateArray();
        mm.MaxElement();
    }
    
}
