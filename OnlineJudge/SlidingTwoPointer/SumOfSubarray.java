// https://oj.masaischool.com/contest/2451/problem/1
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] ar = new long[n];
            for(int i=0; i<n; i++) {
                ar[i] = sc.nextLong();
            }
            System.out.println(contains(ar, k));
        }
    }
    public static String contains(long[] ar, long k) {
        int j=0;
        long sum = 0;
        for(int i=0; i<ar.length; i++) {
            sum += ar[i];
            while(sum>k) {
                sum -= ar[j];
                j++;
            }
            if(sum == k) {
                return "Yes";
            }
        }
        return "No";
    }
}
