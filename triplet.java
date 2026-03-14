/*
    [nums[i], nums[j],  nums[k]]
    such that i != j, i != k, and j != k, 
    and nums[i] + nums[j] + nums[k] == 0
    Input:nums = [-1, 0,  1, 2, -1, -4] 
    Output:   [ [-1, -1, 2] , [-1, 0, 1] ]
*/
import java.util.*;
class triplet{
    public List<List<Integer>> threeSum(int num[]) {
        List <List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i<num.length; i++) {
            for( int j = i+1; j<num.length; j++) {
                for(int k = j+1; k<num.length; k++){
                    if(num[i] + num[j] + num[k] == 0) {
                        List<Integer> trip = Arrays.asList(num[i], num[j], num[k]);
                        Collections.sort(trip);
                        result.add(trip);
                    }
                }
            }
        }
        Set<List<Integer>> set = new HashSet<>(result);
        return new ArrayList<>(set);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        triplet obj = new triplet();
        List<List<Integer>> ans = obj.threeSum(a);

        System.out.println("Triplets with sum 0 are:");
        for (List<Integer> triplet : ans) 
            System.out.println(triplet);
        in.close();
    }
}