// https://oj.masaischool.com/contest/2407/problem/4
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
            String[] arr=new String[n];
            for(int i=0; i<n; i++) arr[i]=sc.next();

           // System.out.println(getCount(arr));
        
        //Output
        bw.write(getCount(arr)+"\n");
        bw.flush();
        }
    }
    
    public static int getCount(String[] arr){
        int count=0;
            HashMap<String,Integer> map=new HashMap<>();
            
            for(int i=0; i<arr.length; i++){
                char[] ch=arr[i].toCharArray();
                Arrays.sort(ch);
                String str=new String(ch);
                if(map.containsKey(str)){
                    int val=map.get(str);
                    map.put(str,val+1);
                }else map.put(str,1);
            }
            
            
            for(Map.Entry<String,Integer> set:map.entrySet()){
                count=count+(set.getValue()*(set.getValue()-1))/2;
            }
            return count;
    }
}
