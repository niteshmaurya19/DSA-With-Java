import java.util.Scanner;

public class LinearSearch2DArray {
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
        System.out.println("the matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
}
public void LinearSearch(){
    System.out.println("enter the targeted value you search in this Array");
    int target=sc.nextInt();
    for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==target){
                    System.out.println("the index of targeted value is :"+ (i+1)+(j+1)+"th");
                }
        }
    }
}
public static void main(String[] args) {
    LinearSearch2DArray seacrh =new LinearSearch2DArray();
    seacrh.Taverse();
    seacrh.LinearSearch();
}
}
