/*
https://www.hackerrank.com/challenges/matching-x-y-repetitions/problem
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^[\\d]{1,2}[a-zA-z]{3,}[\\.]{0,3}$"); // Use \\ instead of using \ 
        // d for digits, a-z lowercase and A-Z uppercase,\\. for point ^ for start, $ for end
        //tester.checker("^\\d{1,2}[a-zA-z]{3,}\\.{0,3}$");
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}
