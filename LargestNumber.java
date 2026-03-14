import java.util.*;
class LargestNumber{
    public static void main(String s[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int number[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) {
            number[i] = in.nextInt();
        }
        for(int i=0;i<n;i++) {
            if (max<number[i])
                max = number[i];
            if(min>number[i])
                min = number[i];
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);
    }
}