import java.util.*;

class KadanesAlgorithm {
    public static void main (String s[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        int flag =0;
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if(a[i]>0)
                flag = 1;
        }
            Kadanes(a,flag);

        in.close(); // Optional but good practice
    }
    static void Kadanes(int a [],int flag) {
        if(flag == 0){
            int c = Integer.MIN_VALUE;
            for(int i = 0;i<a.length;i++) {
              c = Math.max(c, a[i]) ;  
            }
            System.out.println("Our maximum sum is:"+c);
        }
        else{
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0;i<a.length;i++) {
                currSum+=a[i];
                if(currSum <0)
                    currSum = 0;
                maxSum = Math.max(maxSum, currSum);
            }
            System.out.println("Our maximum sum is:"+maxSum);
        }
    }
}
