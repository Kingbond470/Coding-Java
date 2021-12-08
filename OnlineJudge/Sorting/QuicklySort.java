// https://oj.masaischool.com/contest/2448/problem/2
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for(int i: arr) System.out.print(i+" ");
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pivot = getPivot(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
        return;
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int getPivot(int[] arr, int low, int high) {
        int pivot = low;
        int j = low+1;
        while(j<=high) {
            if(arr[j]<arr[low]) {
                pivot++;
                swap(arr, pivot, j);
            }
            j++;
        }
        swap(arr, low, pivot);
        return pivot;
    }
}
