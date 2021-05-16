/*

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("hackerrank"); 
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);     // the string to be searched, using Pattern class and compile() 
        Matcher m = p.matcher(Test_String);             // the string to search and match using Matcher class and  matcher()
        int Count = 0;
        while(m.find()){                              // to check the string exist(true) or not (false) using  find()
            Count += 1;
        }
        System.out.format("Number of matches : %d",Count);
    }   
    
}
