package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayKTimes {
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
    public void ReverseAn1DArray(int left,int right){

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
    }
}
public void RotateRight(){
System.out.println("Enter the rotation time in right: ");
int k =sc.nextInt();
k=k%size;
if(k==0){
    System.out.println("No Rotation: "+ Arrays.toString(a));
}
ReverseAn1DArray(0, size-1);
ReverseAn1DArray(0, k-1);
ReverseAn1DArray(k, size-1);
System.out.println("After the " +k+" Times Rotation In Right: "+Arrays.toString(a));
}
public static void main(String[] args) {
    RotateArrayKTimes rotate=new RotateArrayKTimes();
    rotate.Create1DArray();
    rotate.RotateRight();
}
}
