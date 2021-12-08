// https://oj.masaischool.com/contest/2451/problem/4
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests--!=0) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int i=0; i<n; i++) {
                ar[i] = sc.nextInt();
            }
            System.out.println(getLongestUniq(ar));
        }
    }
    public static int getLongestUniq(int[] ar) {
        ArrayList<Integer> uniq = new ArrayList<>();
        int max = 0;
        for(int i: ar) {
            if(!uniq.contains(i)) {
                uniq.add(i);
            } else {
                uniq.add(i);
                while(uniq.get(0) != i) {
                    uniq.remove(0);
                }
                uniq.remove(0);
            }
            max = Math.max(max, uniq.size());
        }
        return max;
    }
}
