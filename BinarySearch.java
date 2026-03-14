import java.util.*;
class BinarySearch{
    public static int BinarySearch(int number[], int key) {
        int start = 0, end = number.length;
        while (start <= end){
            int mid = (start+end)/2;
            if(number[mid]==key)
                return mid;
            if(number[mid]<key)
                start = mid+1;
            else 
                end = mid-1;
            
        }
        return -1;
    }
    public static void main(String s[]) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int number[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) {
            number[i] = in.nextInt();
        }
        System.out.println("Enter the key to search in the array: ");
        int key = in.nextInt();
        int k = BinarySearch(number, key);
        if (k == -1)
            System.out.println(key+" is not present in array ");
        else
            System.out.println(key+" is present at index: "+k);
        in.close();
    }
}