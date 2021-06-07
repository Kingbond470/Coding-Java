/*

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        
        double cost_A=0;
        double cost_B=0;
        
        // E[x^2] = lambda + lambda^2
        cost_A=160+40*(x+x*x);
        cost_B=128+40*(y+y*y);
       
       
        System.out.printf("%.3f",cost_A);
        System.out.println();
        System.out.printf("%.3f",cost_B);
    }
}
