// https://oj.masaischool.com/contest/2417/problem/6
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int i=0; i<n; i++) {
            int ans = getx(arr, i) + gety(arr, i);
            System.out.print(ans+" ");
            // System.out.print(getx(arr, i)+" - ");
            // System.out.println(gety(arr, i));
        }
    }
    public static int getx(int[] arr, int i) {
        for(int x=i-1; x>=0; x--) {
            if(arr[x]>arr[i]) {
                return x+1;
            }
        }
        return -1;
    }
    public static int gety(int[] arr, int i) {
        for(int y=i+1; y<arr.length; y++) {
            if(arr[y]>arr[i]) {
                return y+1;
            }
        }
        return -1;
    }
}
