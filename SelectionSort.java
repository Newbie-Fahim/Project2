/*
   Time Complexity:O(n^2)
   Time Complexity is same as Bubble Sort,     but time reqired is lessthan bubble sort.
*/
import java.util.*;
public class SelectionSort{
public static void SelectionSorting(int[] arr){
	for(int i = 0;i <arr.length-1;i++) {
        int minPos = i;
		for(int j = i+1;j<arr.length-1;j++) {
			if(arr[minPos]>arr[j]) {
				minPos = j; 
			} 
		}
        //swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
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
	SelectionSorting(a);
	System.out.print("Array  after sorting: ");
	for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
    }
        in.close();
    }
}