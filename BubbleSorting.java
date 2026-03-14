package Basic_Sorting_Algorithm;

//Bubble Sort 
//Time Complexity: O(n^2)

import java.util.*;
public class BubbleSorting{
public static void BubbleSort(int[] arr){
	for(int turn = 0;turn <arr.length-1;turn++) {
		for(int j = 0;j<arr.length-1-turn;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp; 
			}		
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
	BubbleSort(a);
	System.out.print("Array  after sorting: ");
	for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}