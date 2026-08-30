package Arrays;

import java.util.Scanner;

public class SumOfRowAndColumn {
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
public void RowsAndCols(){
    int targetrow,targetcol;
    int RowSum=0;
    int ColSum=0;
    System.out.println("Enter the targeted row for sum: ");
    targetrow=sc.nextInt();
    System.out.println("Enter the targeted cols for sum: ");
    targetcol=sc.nextInt();
    for(int i =0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(i==targetrow-1){
                RowSum=RowSum+matrix[i][j];
            }
            if(j==targetcol-1){
                ColSum=ColSum+matrix[i][j];
            }
        }
    }
    System.out.println("The sum of "+(targetrow)+"th Row: "+ RowSum);
    System.out.println("The sum of "+(targetcol)+"th Column: "+ ColSum);
}
public static void main(String[] args) {
    SumOfRowAndColumn sum=new SumOfRowAndColumn();
    sum.Taverse();
    sum.RowsAndCols();
}
}
