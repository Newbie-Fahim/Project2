import java.util.Scanner;
class Search {
    public static void main (String s[]) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int number[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) {
            number[i] = in.nextInt();
        }
        System.out.print("Enter the key you want to search: ");
        int key = in.nextInt();
        System.out.print("Enter:\n1. Linear search\n2.Binary Search\nEnter your choice: ");
        int choice = in.nextInt();
        switch(choice){
            case 1:
                int index = LinearSearch(number,key);
                if(index == -1) {
                    System.out.println(key+" not found in the array.");
                }
                else {
                    System.out.println(key+" is at index: "+index);
                }
                break;
            case 2:
                index = BinarySearch(number,key);
                if(index == -1) {
                    System.out.println(key+" not found in the array.");
                }
                else {
                    System.out.println(key+" is at index: "+index);
                }
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
        
        
    }
    public static int LinearSearch(int number [] , int key) {
        for (int i =0; i<number.length;i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int BinarySearch (int number[],int key){
        int start = 0, end = number.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            // comparisons
            if(number[mid] == key)
                return mid;
            if(number[mid] < key) //left
                start = mid+1;
            else //right 
                end = mid-1;
        }
        return -1;
    }
}