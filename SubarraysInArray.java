import java.util.*;
class SubarraysInArray {
    public static void main (String s[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" elements in array: ");
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        PrintSubArray(a);
    }
    public static void PrintSubArray(int numbers[]) {
        int ts=0,maxsum = Integer.MIN_VALUE;
        System.out.println("Subarrays in array is: ");
        for(int i =0;i<numbers.length;i++) {
            int start = i;
            for(int j = i+1;j<numbers.length;j++) {
                int end = j,sum = 0;
                for(int k = start;k<=end;k++ ){
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                    ts++;
                }
            System.out.println("Current Sum: "+sum);
            if(maxsum<sum)
                maxsum = sum;
            System.out.println();
            }
        }
        System.out.println("Total subarrys are: "+ts);
        System.out.println("The maximum sum of subarrays is: "+maxsum);
    }
}