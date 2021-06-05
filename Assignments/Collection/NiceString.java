/*

    A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

Example 1:

Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.

Example 2:

Input: s = "Bb"
Output: "Bb"
Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.

Example 3:

Input: s = "c"
Output: ""
Explanation: There are no nice substrings.

Example 4:

Input: s = "dDzeE"
Output: "dD"
Explanation: Both "dD" and "eE" are the longest nice substrings.
As there are multiple longest nice substrings, return "dD" since it occurs earlier.
*/

import java.util.Scanner;

public class NiceString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in) ;
        System.out.print("Enter the string : ");
        String s=sc.nextLine();
        findSubstring(s);
    }
    public static boolean checkTwoUpperLowerString(String upper_str, String lower_str){
        //getting lower and upper case string
        boolean value=false;
        for(int k=0; k<upper_str.length(); k++){
           // boolean value=false;
            for (int l=0; l<lower_str.length(); l++){
                //char at k will be upper so add +32 and make it lower and find the char in lower cae
                char new_char=upper_str.charAt(k);
                int new_value=(int)new_char+32;
                char new_lower_char=(char)new_value;
                if(new_lower_char==lower_str.charAt(l)){
                    //true
                    value=true;
                }
                else{
                    //false
                    value=false;
                    break;
                }

            }
        }
        return value;
    }
    public static void findSubstring(String s){
        int max_count=0;
        String max_substring="";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){        //mausam m ma mau maus mausam
                String new_str=s.substring(i,j+1);
               // System.out.println(new_str+" : substring ");

                //check for condition where we can find if lowercasae and uppercase are present
                String upper_str="";
                String lower_str="";
                for(int k=0; k<new_str.length(); k++){
                    if(new_str.charAt(k)>=65 && new_str.charAt(k)<=90){
                        upper_str=upper_str+new_str.charAt(k);
                    }
                    else {      // add the lower case string
                        lower_str=lower_str+new_str.charAt(k);

                    }
                }
               // System.out.println(" the upper string is "+upper_str);
                //System.out.println(" the lower string is "+lower_str);
                boolean new_value=checkTwoUpperLowerString(upper_str,lower_str);
               // System.out.println(new_value);
                int count=0;
                if(new_value){
                    count=new_str.length();
                    if(count>max_count){
                        max_count=count;
                        max_substring=new_str;
                        //System.out.println("the longest substring is "+max_substring);
                    }
                }
                else{
                    //substring does not contain lower and upper case
                }

            }
        }
        if(max_substring.length()>=1) {
            System.out.println(max_substring);
        }
        else{
            System.out.printf("\"\"");
            //use backslash as it is special characters
        }

    }
}
