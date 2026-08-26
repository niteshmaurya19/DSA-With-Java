import java.util.Scanner;
import java.util.Arrays;

public class InsertionIn2DArray {
    int rows,cols;
    int[][] matrix;
    static Scanner sc=new Scanner(System.in);
    public void printMatrix(int[][] matrix){
        System.out.println("the matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }

    }
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
        System.out.println("Original matrix is:");
        printMatrix(matrix);
}
public void Insertion(){
    System.out.println("enter the row index to update(0 to"+(rows-1)+"):");
    int targetRow=sc.nextInt();
    System.out.println("enter the row index to update(0 to"+(cols-1)+"):");
    int targetCol=sc.nextInt();
    if(targetRow>=0 && targetRow<rows&& targetCol>=0 && targetRow<cols){

        System.out.println("enter the new number :");
    int newValue=sc.nextInt();
    matrix[targetRow][targetCol]=newValue;
    System.out.println("Matrix after Insertion:");
    printMatrix(matrix);
    }
    else{
        System.out.println("Insertion Failed");
    }
}
public static void main(String[] args) {
    InsertionIn2DArray ins = new InsertionIn2DArray();
    ins.Taverse();
    ins.Insertion();
}
}
