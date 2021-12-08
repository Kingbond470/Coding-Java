// https://oj.masaischool.com/contest/2466/problem/1
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        System.out.println(indexOf(arr, num));
    }
    public static int indexOf(int[] arr, int num) {
        int low = 0, high = arr.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == num) return mid;
            else if(arr[mid]>num) high = mid-1;
            else if(arr[mid]<num) low = mid+1;
        }
        return -1;
    }
}
