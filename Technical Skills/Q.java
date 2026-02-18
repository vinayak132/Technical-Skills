// Q.WAP to find the  sum of frame element of a matrix

import java.util.Scanner;
class Q{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;

        System.out.println("Enter number of rows");
        int row=sc.nextInt();

        System.out.println("Enter number of columns");
        int col=sc.nextInt();
        
        int [][] mat= new int[row][col];

        System.out.println("Enter matrix");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || j==0 || j==2 || i==2){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}