// https://oj.masaischool.com/contest/1827/problem/2
import java.util.*;

public class Main {

    private static int count = 0;
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
      for(int a=0; a<t; a++){
      count=0;
        int n =sc.nextInt();
      
      int k=sc.nextInt();
      int[] ar=new int[n];
        for(int i=0; i<n ; i++) ar[i]=sc.nextInt();
        int[] temp = new int[n];
        int index = 0;

        sub(ar, index, temp, k);

        System.out.println(count);
      }
    }

    private static void sub(int[] ar, int index, int[] temp, int k) {
        if (index == ar.length) {
            print(ar, temp, k);
            return;
        }
        //set the current index bit and solve it recursively
        temp[index] = 1;
        sub(ar, index + 1, temp, k);
        //unset the current index bit and solve it recursively
        temp[index] = 0;
        sub(ar, index + 1, temp, k);
    }

    private static void print(int[] ar, int[] temp, int k) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        int t = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 1) {

                if(ar[i]%2==0) t++;

            }
        }
        if(t>=k) {
            count++;
            t=0;
        }

    }

}
