/*
https://www.hackerrank.com/challenges/30-more-exceptions/problem
*/
import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    public int power(int n, int p) throws Exception {
        //n^p...nn*n*n*n*...p times
        if(n<0 || p<0) {
            throw new Exception("n and p should be non-negative");
        }
        else{
        return (int)Math.pow(n,p);
        }
       /*
       public int power(int n, int p){
       if(n<=0 || p<=0) throw new ArithmeticException("n and p should be non-negative");
       else return (int) Math.pow(n,p)
       */
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

