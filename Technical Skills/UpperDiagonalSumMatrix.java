// WAP for sum of upper diagonal of a matrix 
import java.util.Scanner;

public class UpperDiagonalSumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of row");
        int row = sc.nextInt();

        System.out.println("enter the number of coloum");
        int cols = sc.nextInt();

        int[][] matrix = new int [row][cols];
        System.out.println("enter the metrix  element ");

            for (int i=0; i<row; i++){
                for (int j=0; j<cols; j++){
                    matrix [i][j]=sc.nextInt();
                }
             }

             int sum=0;
             for(int i=0;i<row;i++){
                for(int j=0;j<cols;j++){
                    if(i<j){
                        sum+=matrix[i][j];
                    }
                }
                System.out.println("Sum of upper matrix is : "+ sum);
        }
    }
}