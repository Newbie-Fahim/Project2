//O(n^2) <O(n^3)
import java.util.*;

class SumInArray {
    public static void main (String s[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        ArraySum(a);
        in.close(); // Optional but good practice
    }

    public static void ArraySum(int numbers[]) {
        int sum = 0, maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxsum < sum)
                    maxsum = sum;
            }
        }
        System.out.println("The maximum sum of subarrays is: " + maxsum);
    }
}
