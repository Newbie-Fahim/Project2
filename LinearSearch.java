import java.util.*;
class LinearSearch{
	public static int Lsearch(int arr[], int key) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == key)
				return i;
		}
	return -1;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter "+n+" elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print("Enter the key to search in array: ");
		int key = in.nextInt();
		int ans = Lsearch(arr, key);
		if(ans == -1)
			System.out.println(key+" is not present in array.");
		else
			System.out.println(key+" is  present at index: "+ans);
	}
}	