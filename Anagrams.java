/*
Two strings, a and b

, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

    string a: the first string
    string b: the second string

Returns

    boolean: If a

and b

    are case-insensitive anagrams, return true. Otherwise, return false.

Input Format

The first line contains a string a
.
The second line contains a string b

.

Constraints

Strings a and b

    consist of English alphabetic characters.
    The comparison should NOT be case sensitive.

Sample Input 0

anagram
margana

Sample Output 0

Anagrams

Explanation 0
Character 	Frequency: anagram 	Frequency: margana
A or a 	3 	3
G or g 	1 	1
N or n 	1 	1
M or m 	1 	1
R or r 	1 	1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa

Sample Output 1

Not Anagrams

Explanation 1
Character 	Frequency: anagramm 	Frequency: marganaa
A or a 	3 	4
G or g 	1 	1
N or n 	1 	1
M or m 	2 	1
R or r 	1 	1

The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello

Sample Output 2

Anagrams

Explanation 2
Character 	Frequency: Hello 	Frequency: hello
E or e 	1 	1
H or h 	1 	1
L or l 	2 	2
O or o 	1 	1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
*/
import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        /* Complete the function
         find the char at each pos and count it in string A 
        do the same thing in String B and compare the each char with B
       char first_alphabet_a=a.charAt(0);
        char frist_alphabet_b=b.charAt(0);
        if (a.length()!=b.length()){
            System.out.println("Not Anagrams");
        }
        else{
            for (int i=0;i<a.length()-1;i++){
                char value_char
            }
        }
        return true;
        */
        
        char a_string[]=a.toLowerCase().toCharArray();
        char b_string[]=b.toLowerCase().toCharArray();
        boolean returnValue;
        if(a_string !=null && b_string!=null){
            java.util.Arrays.sort(a_string);
            java.util.Arrays.sort(b_string);
        returnValue=java.util.Arrays.equals(a_string,b_string);
            return returnValue; 
        }
        else{
            return returnValue=false;
        }  
        }
    


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



/* 
Another Mehthod -2
//Enter code here
import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=sc.nextLine();
    String phrase=sc.nextLine();
    String result="";
    String result1="";
    //boolean value=false;
    for(int i=0; i<word.length(); i++){
      if(word.charAt(i) !=' '){
        result=result+word.charAt(i);
      }
      }
    for(int i=0; i<phrase.length(); i++){
      if(phrase.charAt(i) !=' '){
        result1=result1+phrase.charAt(i);
      }
    }
    
    char[] first_word=new char[result.length()];
    char[] second_word=new char[result1.length()];
    
    for(int i=0; i<result.length(); i++){
      first_word[i]=result.charAt(i);
    }
    for(int j=0; j<second_word.length; j++){
      second_word[j]=result1.charAt(j);
    }
    //Arrays.sort(first_word);
  //  Arrays.sort(second_word);
    boolean value=true;
    for(int i=0; i<first_word.length; i++){
      for(int j=0; j<second_word.length; j++){
        if(first_word.charAt(i) != second_word.charAt(i)){
          value=false;
        }
      }
    }
    
  //System.out.println(result+" " +result1);
      String name= Arrays.equals(first_word,second_word) ? "True" : "False";
      System.out.println(name);
         }
         }
         */


/* 
Anothear Method
//Enter code here
import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=sc.nextLine();
    String phrase=sc.nextLine();
    String result="";
    String result1="";
    //boolean value=false;
    for(int i=0; i<word.length(); i++){
      if(word.charAt(i) !=' '){
        result=result+word.charAt(i);
      }
      }
    for(int i=0; i<phrase.length(); i++){
      if(phrase.charAt(i) !=' '){
        result1=result1+phrase.charAt(i);
      }
    }
    
    char[] first_word=new char[result.length()];
    char[] second_word=new char[result1.length()];
    
    for(int i=0; i<result.length(); i++){
      first_word[i]=result.charAt(i);
    }
    for(int j=0; j<second_word.length; j++){
      second_word[j]=result1.charAt(j);
    }
    Arrays.sort(first_word);
    Arrays.sort(second_word);
    
  //System.out.println(result+" " +result1);
      String name= Arrays.equals(first_word,second_word) ? "True" : "False";
      System.out.println(name);
         }
         }
         
         */


/* Another Method

//Enter code here
import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String word=sc.nextLine();
    String phrase=sc.nextLine();
    String result="";
    String result1="";
    //boolean value=false;
    for(int i=0; i<word.length(); i++){
      if(word.charAt(i) !=' '){
        result=result+word.charAt(i);
      }
      }
    for(int i=0; i<phrase.length(); i++){
      if(phrase.charAt(i) !=' '){
        result1=result1+phrase.charAt(i);
      }
    }
    
    char[] first_word=new char[result.length()];
    char[] second_word=new char[result1.length()];
    
    for(int i=0; i<result.length(); i++){
      first_word[i]=result.charAt(i);
    }
    for(int j=0; j<second_word.length; j++){
      second_word[j]=result1.charAt(j);
    }
    //Arrays.sort(first_word);
  //  Arrays.sort(second_word);
    char temp;
    for(int i=0; i<first_word.length; i++){
      for(int j=i+1; j<first_word.length; j++){
			if(first_word[i]>first_word[j]){
              temp=first_word[i];
              first_word[i]=first_word[j];
              first_word[j]=temp;
            }
      }
    }
    char temp1;
    for(int i=0; i<second_word.length; i++){
      for(int j=i+1; j<second_word.length; j++){
        if(second_word[i]>second_word[j]){
          temp1=second_word[i];
          second_word[i]=second_word[j];
          second_word[j]=temp1;
        }
      }
    }
    //System.out.println(second_word);
    for(char value: second_word){
    //  System.out.println(value);
    }
    
  //System.out.println(result+" " +result1);
      String name= Arrays.equals(first_word,second_word) ? "True" : "False";
      System.out.println(name);
         }
         }
         */
