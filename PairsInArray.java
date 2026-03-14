/* Time Complexity: O(n^2) 
 * Total Pairs:nC2 = n*(n-1)/2
*/
import java.util.*;
class PairsInArray {
    public static void main (String s[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" elements in array: ");
        for(int i = 0;i<n;i++){
            a[i] = in.nextInt();
        }
        PrintPairs(a);
        in.close();
    }
        public static void PrintPairs(int numbers[]) {
            int tp = 0;//nC2 = n*(n-1)/2
            for(int i =0;i<numbers.length;i++) {
                int curr = numbers[i];
                for(int j = i+1;j<numbers.length;j++) {
                    System.out.print("("+curr+","+numbers[j]+")");
                    tp++;
            }
            System.out.println();
        }
        System.out.println("Total partitions: "+tp);
    }
}