/*
https://www.hackerrank.com/challenges/30-operators/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
     // System.out.println(meal_cost);
    double tip=(meal_cost/100)*tip_percent;
    double tax=(meal_cost/100)*tax_percent;
   // System.out.println(tip+" "+tax);
    double total=meal_cost+tip+tax;
    int total1=(int)Math.round(total);
    //int total1=Integer.parseInt(total);
    System.out.print(total1);
     

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
