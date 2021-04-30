/*
https://www.hackerrank.com/challenges/time-conversion/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
// 12 am starts with 0 in 24 hours format and 12 pm is 24 
        String[] split_string=s.split(":");
    int a=Integer.parseInt(split_string[0]);
    int b=Integer.parseInt(split_string[1]);
    String c=split_string[2];
      //  String b=split_string[1];
       // String c=split_string[2];
        String time_ss=c.substring(0,2);
        int time_ss1=Integer.parseInt(time_ss);
        String am_pm=c.substring(2,4);
        String am="AM";
        String pm="PM";
       // System.out.println(a+" "+b+" "+c+ " " +am_pm);
        if(am_pm.equals(am) && a==12){
            a=00;
           // System.out.println(a);
        }
        if(am_pm.equals(pm) ){
            if(a>=12){
             a=a;   
    
            }
            else{
            a=a+12;}
           // System.out.println(a);
        }
       //return  System.out.printf("%02d:%02d:%02d",a,b,time_ss1);
       // System.out.printf("%02d"a,":"+"%02d"b,":"+"%02d",time_ss1);
        //System.out.println(s);
       // return s;
     // System.out.printf("%02d:%02d:%02d",a,b,time_ss1);
     //  return String.format("%02d:%02d:%02d",hour,min,sec);
      return s.format("%02d:%02d:%02d",a,b,time_ss1);
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
