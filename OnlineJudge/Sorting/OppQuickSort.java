// https://oj.masaischool.com/contest/2448/problem/5
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // Scanner sc = new Scanner(System.in);
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
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int getPivot(int[] arr, int low, int high) {
        int pivot = low-1;
        int j = low;
        while(j<high) {
            if(arr[j]>arr[high]) {
                swap(arr, pivot+1, j);
                pivot++;
            }
            j++;
        }
        swap(arr, pivot+1, high);
        return pivot+1;
    }
}
