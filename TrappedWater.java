//Time Complexity: O(n)
import java.util.*;

public class TrappedWater {
    public static int trap(int ht[]){
        int n = ht.length;
        int tpw = 0, l = 0, r = n-1;
        int rmax = ht[r];
        int lmax = ht[l];
        while(l<r){
            if (lmax<rmax){
                l++;
                lmax = Math.max(lmax,ht[l]);
                tpw += lmax - ht[l]; 
            }else{
                r--;
                rmax = Math.max(rmax,ht[r]);
                tpw += rmax -ht[r];
            }
        }
        return tpw;
    }
    public static void main(String s[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int tW = trap(a);
        System.out.println("The amount of trapped water is: " + tW);
        in.close(); // Optional but good practice
    }
}
