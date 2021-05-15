/*
https://www.hackerrank.com/challenges/java-biginteger/problem
*/
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.math.BigInteger;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        BigInteger a, b, addition, multiplication;
        a=sc.nextBigInteger();
        b=sc.nextBigInteger();
        addition=a.add(b);
        multiplication=a.multiply(b);
        System.out.println(addition);
        System.out.print(multiplication);
    }
}
