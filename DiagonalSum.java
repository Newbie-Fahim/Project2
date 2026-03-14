import java.util.*;

class DiagonalSum {
    public static int Sum(int matrix[][]) {
        int sum = 0;
        // TIME COMPLEXITY: O(n^2)
        // for(int i = 0;i<matrix.length;i++) {
        //     for(int j = 0;j<matrix[0].length;j++) {
        //         if(i == j) {
        //             sum += matrix[i][j]; 
        //         }
        //         else if(i+j==(matrix.length-1)){
        //             sum+= matrix[i][j];
        //         }
        //     }
        // }
        //TIME COMPLEXITY: O(n)
        for(int i = 0;i<matrix.length;i++) {
            //Primary Diagonal
            sum+=matrix[i][i];
            //Secondary Diagonal
            if(i != matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int n = in.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("Input Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = Sum(matrix);
        System.out.println("The sum of both diagonal elements: "+sum);
    }
}