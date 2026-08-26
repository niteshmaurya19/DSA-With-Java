import java.util.Scanner;
import java.util.Arrays;

public class Traverse2DArray {
    public void Taverse(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();

        System.out.println("enter the number of column");
        int cols=sc.nextInt();

        int[][] matrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("enter the "+(i+1)+(j+1)+"th elements");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(matrix[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
}
public static void main(String[] args) {
    Traverse2DArray arr=new Traverse2DArray();
    arr.Taverse();
    
}
}
