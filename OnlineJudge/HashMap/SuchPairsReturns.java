// https://oj.masaischool.com/contest/2407/problem/6
// Fast Input
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
        //Input

        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++) arr[i]=sc.nextInt();
           // System.out.println(pairsExist(arr,k));
            //Output
            int count=pairsExist(arr,k);
            bw.write(count+"\n");
            bw.flush();
        }
    }
    
    public static int pairsExist(int[] arr, int k){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(k-arr[i])){
                return 1;
            }else set.add(arr[i]);
        }
        return -1;
    }
}
