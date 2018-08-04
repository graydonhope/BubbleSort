import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void countSwaps(int[] a) {
        int count = 0;
        int n = a.length;
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < n-1; i++){
                if(a[i] > a[i+1]){
                    isSorted = false;
                    //swap values
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    count++;
                }
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0] + "\n" + "Last Element: " + a[n-1]);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
