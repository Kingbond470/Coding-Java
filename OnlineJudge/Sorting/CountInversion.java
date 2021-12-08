// https://oj.masaischool.com/contest/2448/problem/6
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        System.out.println(mergeSort(arr, temp, 0, n-1));
    }
    
    public static long merge(int[] arr, int[] temp, int left, int mid, int right) {
        long count = 0;
        int i = left;
        int j = mid;
        int k = left;
        while (i<=mid-1 && j<=right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count = count+(mid-i);
            }
        }
        while (i<=mid-1) {
            temp[k++] = arr[i++];
        }
        while (j<=right) {
            temp[k++] = arr[j++];
        }
        for (i=left; i<=right; i++) {
            arr[i] = temp[i];
        }
        return count;
    }

    public static long mergeSort(int[] arr, int[] temp, int left, int right) {
        long count = 0;
        if (right > left) {
            int mid = left + (right-left)/2;
            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid+1, right);
            count += merge(arr, temp, left, mid+1, right);
        }
        return count;
    }
}
