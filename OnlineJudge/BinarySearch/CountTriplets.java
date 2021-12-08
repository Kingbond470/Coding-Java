// https://oj.masaischool.com/contest/2466/problem/4
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(countTriplet(arr, k));
    }
    public static long countTriplet(long[] arr, long k) {
        long count = 0;
        for(int i=2; i<arr.length; i++) {
            int minIndex = isTriplet(arr, k, arr[i]);
            // System.out.println(minIndex+" "+i);
            if(minIndex<i-2) {
                count = count + (i-minIndex)*(i-minIndex-1)/2;
            } else if(minIndex == i-2){
                count++;
            }
        }
        return count;
    }
    public static int isTriplet(long[] arr, long k, long max) {
        int l = 0, h = arr.length-1;
        int idx = -1;
        while(l<=h) {
            int mid = l + (h-l)/2;
            if(arr[mid]<(max - k)) {
                l = mid+1;
            } else {
                h = mid - 1;
                idx = mid;
            }
        }
        return idx;
    }
}
