/*
https://www.hackerrank.com/challenges/30-review-loop/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String new_odd="";
        String new_even="";
        for(int i=0; i<n; i++){
            String new_word=sc.nextLine();
            //sc.nextLine();
            int length=new_word.length();
            for(int j=0; j<length;j++){
                if(j%2==0){
                    new_even=new_even+new_word.substring(j,j+1);
                    
                    
                }else{
                    new_odd=new_odd+new_word.substring(j,j+1);
                }
                //System.out.println(new_even+ " ..."+ new_odd);
                
            }
            System.out.println(new_even+ " "+ new_odd);
            new_odd="";
            new_even="";
        }
    
    }
}
