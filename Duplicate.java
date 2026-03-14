//H/W 
import java.util.*;
class duplicate{
    public static boolean containsDuplicate(int num[]){
        for (int i = 0;i<num.length;i++) {
            for (int j = i+1;j<num.length;j++) {
                if(num[i]==num[j])
                    return true;
            }
        }
        return false;
    }
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        boolean b = containsDuplicate(a);
        if(b==true)
            System.out.println("The array contains a duplicate element");
        else
            System.out.println("The array doesnt contain a duplicate element");
        in.close();
    }
}