// https://oj.masaischool.com/contest/2451/problem/5
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests--!=0) {
            int n = sc.nextInt();
            int[] asc = new int[n];
            int[] desc = new int[n];
            for(int i=0; i<n; i++) {
                asc[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++) {
                desc[i] = sc.nextInt();
            }
            System.out.println(getCommons(asc, desc));
        }
    }
    public static int getCommons(int[] asc, int[] desc) {
        int n = asc.length;
        int i=0;
        int j=n-1;
        int count = 0;
        while(i<n && j>=0) {
            if(asc[i]==desc[j]) {
                count++;
                i++;
                j--;
            } else if(asc[i]>desc[j]) {
                j--;
            } else if(asc[i]<desc[j]) {
                i++;
            }
        }
        return count;
    }
}
