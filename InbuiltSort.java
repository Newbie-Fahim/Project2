package Basic_Sorting_Algorithm;

/*
            INBUILT SORT
import java.util.Arrays;
Arrays.sort(arr);
Time Complexity: O(n*log(n))
O(n*log(n)) << O(n^2){Selection,Insertion,Bubble}
Arrays(arr[],S.I,E.I)
S.I : Starting Index
E.I : Ending Index
Arrays.sort(arr,Collections.reverseOrder())
Only for "Integer" object
*/
import java.util.*;
public class InbuiltSort{
public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = in.nextInt();
    int a[] = new int[n];
    System.out.println("Enter " + n + " elements in array: ");
    for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
    }
    Arrays.sort(a);
    System.out.print("Array after sorting: ");
    for (int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
    Integer arr[] = {8,9,1,2,7};
    Arrays.sort(arr, Collections.reverseOrder());
    System.out.println("8 9 1 2 7");
    System.out.print("Array after sorting in descending order: ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    in.close();
}
}