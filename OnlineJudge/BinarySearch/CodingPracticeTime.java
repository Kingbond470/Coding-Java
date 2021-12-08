// https://oj.masaischool.com/contest/2466/problem/abs1
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] q = new long[n];
        long sum = 0;
        long maxTime = 0;
        for(int i=0; i<n; i++) {
            q[i] = sc.nextLong();
            if(q[i]>maxTime) maxTime = q[i];
            sum += q[i];
        }
        long l = maxTime;
        long h = sum;
        while(l<h) {
            long mid = l + (h - l)/2;
            if(daysRequired(q, mid)<=m) {
                h = mid;
            } else {
                l = mid+1;
            }
        }
        System.out.println(l);
    }
    public static long daysRequired(long[] arr, long mid) {
        long daysCount = 0;
        long queriesDone = 0;
        for(int i=0; i<=arr.length; i++) {
            if(i==arr.length) {
                daysCount++;
            } else if(queriesDone + arr[i] <= mid) {
                queriesDone += arr[i];
            } else {
                queriesDone = arr[i];
                daysCount++;
            }
        }
        return daysCount;
    }
}
