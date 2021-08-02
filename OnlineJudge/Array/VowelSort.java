// https://oj.masaischool.com/contest/1555/problem/4
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            ArrayList<String> list=new ArrayList<>();
            for(int i=0; i<n; i++) list.add(sc.next());

            // System.out.println(list);

            ArrayList<String> vowel=new ArrayList<>();
            for(int i=0; i<list.size(); ){
                String temp=list.get(i);
              //  System.out.print(temp);
                if(temp.charAt(0)=='a' || temp.charAt(0)=='e' || temp.charAt(0)=='i' || temp.charAt(0)=='o' || temp.charAt(0)=='u') {
                    vowel.add(temp);
                 // vowel.sort();
                    list.remove(i);
                }else i++;
            }
            for(int i=0; i<vowel.size(); i++) System.out.println(vowel.get(i));
          	for(int i=0; i<list.size(); i++) System.out.println(list.get(i));
        }
    }
}
