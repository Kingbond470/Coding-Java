/*
https://www.hackerrank.com/challenges/java-regex/problem
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    
    /*
    matcher-- used to search the pattern
    pattern-  to be used in search
    0-9--> [0-9]                        // [0-9] any value range from 0 to 9
    09-99 --> [0-9][0-9]  ......bocz leading zero is allowed
    099-199 --> (0|1)[0-9][0-9]             // (0|1) choose either 0 or 1
    200-249--> 2 [0-4][0-9]
    250-254 --> 25 [0-4]
    */
     String value="([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
     
     String pattern=value+"."+value+"."+value+"."+value;
     
}
