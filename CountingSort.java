/*
Used where the range of numbers is not large.
Time Complexity: O(n+range)
*/
import java.util.*;
public class CountingSort{
    public static void countingSort(int arr []) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++) {
            largest = Math.max(largest,arr[i]);
        }
        int count [] = new int [largest+1];
        //Counting frequency
        for(int i = 0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        //Sorting Array
        int j = 0;
        for(int i =0;i<count.length;i++) {
            while(count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
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
        countingSort(a);
        System.out.print("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        in.close();
    }
}