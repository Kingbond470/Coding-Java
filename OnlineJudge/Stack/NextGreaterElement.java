// https://oj.masaischool.com/contest/2417/problem/4
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
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        //Output
        nextGreater(arr,n);
        bw.flush();
        }
    }

    public static void nextGreater(int[] arr, int n){        
        //to store the next greater element
        int[] res = new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(!st.isEmpty()){
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
            }
            if(st.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        
        for(int i=0; i<n; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        
        }
    }
