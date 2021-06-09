/*
https://oj.masaischool.com/contest/991/problem/7

Anagram Detector!

Description

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the word anagram can be rearranged into nag a ram.

Given 2 phrases, write a program that detects if both are anagrams of each other.

If both are anagrams, print "True"

Else print "False"

Input

Input Format :

First line of input contains first phrase

Second line of input contains second phrase


Constraints :

Length of each phrase < 1000

Output

Output a string based on conditions mentioned above

Sample Input 1

anagram
nag a ram

Sample Output 1

True


*/

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
