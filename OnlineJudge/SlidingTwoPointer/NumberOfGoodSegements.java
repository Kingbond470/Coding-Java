// https://oj.masaischool.com/contest/2451/problem/6
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0) {
            int n = sc.nextInt();
            long sum = sc.nextLong();
            int[] ar = new int[n];
            for(int i=0; i<n; i++) {
                ar[i] = sc.nextInt();
            }
            System.out.println(get(ar, sum));
        }
    }
    public static long get(int[] ar, long k) {
        long count = 0;
        int j=0;
        int n = ar.length;
        long sum = 0;
        for(int i=0; i<n; i++) {
            sum += ar[i];
            // if(sum<=k) {
                // if(i-j==0) {
                //     count++;
                // } else {
                    // count = count + i-j+1;
                // }
            // } else {
                while(sum>k) {
                    sum = sum - ar[j];
                    j++;
                }
                count = count + (i-j+1);
            // }
        }
        return count;
    }
}
