package Arrays;
import java.util.Scanner;

public class MaxMin2DArrays {
    static Scanner sc = new Scanner(System.in);
    int size,rows,cols;
    int[][] matrix;
    int max;
    int min;
    public void CreateArray(){
        System.out.println("Enter the number of rows");
        rows=sc.nextInt();

        System.out.println("enter the number of column");
        cols=sc.nextInt();
        matrix=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("enter the "+(i+1)+(j+1)+"th elements");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    }
    public void MaxMinElements2D(){
        max=matrix[0][0];
        min=matrix[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("Minimum element in this Array: "+min);
        System.out.println("Maximum element in this Array: "+max);
    }
    public static void main(String[] args) {
        MaxMin2DArrays mm=new MaxMin2DArrays();
        mm.CreateArray();
        mm.MaxMinElements2D();
    }
}
