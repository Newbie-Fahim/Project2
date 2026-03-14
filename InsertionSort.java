package Basic_Sorting_Algorithm;

import java.util.*;

public class InsertionSort {
    public static void InsertionSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];  // store current element
            int prev = i - 1;

            // shift elements greater than curr to one position ahead
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insert current element at correct position
            arr[prev + 1] = curr;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        InsertionSorting(a);

        System.out.print("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        in.close();
    }
}
