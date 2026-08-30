package Arrays;

import java.util.Scanner;

public class TransposeMatrix {
    int rows,cols;
    int[][] matrix;
    static Scanner sc=new Scanner(System.in);
    public void Taverse(){

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
        System.out.println("the Original matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
}
public void Transpose(){
    System.out.println("The transpose matrix is: ");
    for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[j][i]+" ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    TransposeMatrix transpose=new TransposeMatrix();
    transpose.Taverse();
    transpose.Transpose();
}
}
