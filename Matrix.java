import java.util.*;
class Matrix {
    static void search(int matrix[][],int key) {
        for(int i =0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length;j++) {
                if(key==matrix[i][j]) {
                    System.out.println(key +" found at "+i+" th row and "+j+"th column");
                    return;
                }
            }

        }
        System.out.println(key+" not found");
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the size of the matrix:");
        int n = in.nextInt();
        int matrix[][] = new int[n][n];
        //cells = rows * cols
        System.out.println("Enter the elements: ");
        for(int i =0; i<n; i++) {
            for(int j=0; j<n;j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        for(int i =0; i<n; i++) {
            for(int j=0; j<n;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter the element you want to search in the matrix:");
        int key = in.nextInt();
        search(matrix,key);
        in.close();
    }
}