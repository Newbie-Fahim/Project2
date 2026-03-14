//Serching in sorted matrix
/*
 Brute Force: O(n^2)
 Optimised:1) Binary Search(row wise): O(nlogn)
           2) Staircase search 
                top right to bottom left
                Across the non principal diagonal
                Time COmplexity: O(n+m)
 */
import java.util.*;

class Searching {
    public static void StaircaseSearch(int arr[][], int key) {
        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Found " + key + " at (" + row + "," + col + ")");
                return;
            } else if (key < arr[row][col]) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        System.out.println(key + " not Found");
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (rows cols): ");
        int n = in.nextInt();
        int m = in.nextInt();

        int matrix[][] = new int[n][m];
        System.out.println("Enter the elements (row-wise sorted and column-wise sorted):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Input Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the element you want to search in the matrix: ");
        int key = in.nextInt();
        StaircaseSearch(matrix, key);
        in.close();
    }
}
