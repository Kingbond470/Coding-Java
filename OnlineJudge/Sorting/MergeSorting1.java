// https://oj.masaischool.com/contest/2448/problem/1
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, n);
        for(int i: arr) System.out.print(i+" ");
    }
    
    public static void mergeSort(int[] arr, int n) {
        if(n<2) {
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for(int i=0; i<mid; i++) {
            left[i] = arr[i];
        }
        for(int i=mid; i<n; i++) {
            right[i-mid] = arr[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n-mid);
        merge(arr, left, right, mid, n-mid);
    }
    
    public static void merge(int[] arr, int[] left, int[] right, int low, int high) {
        int i=0, j=0, k=0;
        while(i<low && j<high) {
            if(left[i]<=right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while(i<low) {
            arr[k++] = left[i++];
        }
        while(j<high) {
            arr[k++] = right[j++];
        }
    }
}
