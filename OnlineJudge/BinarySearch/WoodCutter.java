//https://oj.masaischool.com/contest/2466/problem/abs3 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long woodRequired = sc.nextLong();
        long[] trees = new long[n];
        for(int i=0; i<n; i++) {
            trees[i] = sc.nextLong();
        }
        System.out.println(minHeight(trees, woodRequired));
    }
    public static long minHeight(long[] trees, long woodRequired) {
        Arrays.sort(trees);
        long l = trees[0];
        long h = trees[trees.length-1];
        while(l<=h) {
            long mid = l + (h - l)/2;
            long wood = getWoods(trees, mid);
            if(wood == woodRequired) {
                return mid;
            } else if(wood < woodRequired) {
                h = mid-1;
            } else {
                l = mid+1;
            }
        }
        return h;
    }
    public static long getWoods(long[] trees, long height) {
        long sum = 0;
        for(int i=trees.length-1; i>=0; i--) {
            if(trees[i]>height) {
                sum = sum + (trees[i]-height);
            } else {
                return sum;
            }
        }
        return sum;
    }
}
