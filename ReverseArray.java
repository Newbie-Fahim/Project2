import java.util.Scanner;
class ReverseArray {
    public static void main (String s[]) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int number[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++) {
            number[i] = in.nextInt();
        }
        reverse(number);
        for(int i=0;i<n;i++) {
            System.out.print(number[i]+" ");
        }
    }
    public static void reverse (int numbers[]) {
        int first =0, last = numbers.length-1;
        while( first<last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
}
