/*
https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
*/
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Dictionary name_phoneMap = new Hashtable();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            name_phoneMap.put(name, phone);   // to insert the value key,pair
            
        }
        in.nextLine();
        while(in.hasNext()){
            String s = in.next();
            // Write code here
           // name_phoneMap.get(s);
            if(name_phoneMap.get(s)==null){           // to retrive the value paired with key
                System.out.println("Not found");
              //  System.out.println(s);
            }
            else{
                System.out.println(s+"="+name_phoneMap.get(s));
            }
            
            
        }
        in.close();
    }
}
