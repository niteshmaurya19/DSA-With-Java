import java.util.Scanner;

public class DeletionIn2DArray {
    int rows,cols;
    int[][] matrix;
    static Scanner sc=new Scanner(System.in);
    public void printMatrix(int[][] matrix){
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
public void Deletion2DArray(){
    System.out.println("Enter the row (0 to "+(rows-1)+") you want to delete");
    int deltarget=sc.nextInt();
    for(int i=deltarget;i<rows-1;i++){
        for(int j=0;j<cols;j++){
            matrix[i][j]=matrix[i+1][j];
        }
    }
    rows--;
    System.out.println("\nMatrix after "+(deltarget+1)+"th Row Deletion:");
    printMatrix(matrix);
}
public static void main(String[] args) {
    DeletionIn2DArray del=new DeletionIn2DArray();
    del.Taverse();
    del.Deletion2DArray();
}
}
