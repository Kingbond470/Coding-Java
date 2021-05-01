/*

*/
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solutions */
      // take user input as array and iterate through each element using for and  add all the values, divide by lenght of array =mean
      // sort the array in ascending order, find the middle element, if it's even then previous and current middle, add both values/2 or for odd values, middle index will be median
      // for mode, find the most repeated values in array, define most value and it's count as first then compare it with all element and increase the count otherwise other value will be max value and increase their count and return it
      
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();     
        double [] input=new double[n];    
        double mean;
        double median=0;
        int mode=0;       
        for (int i=0; i<n; i++){
            input[i]=sc.nextDouble();
        }
        // System.out.println(input[0]);      
        double sum=0;
        for (int i=0; i<n; i++){
            sum=sum+input[i];
        }
        mean=sum/n;
        System.out.println(mean);
        
        Arrays.sort(input);
        //System.out.println(input[0]);
        
        int quotient=n/2;
        int remainder=n%2;
    
            if(remainder==1){
              //  System.out.println()
              median=input[quotient-1];
              System.out.println(median);
              //System.out.println(input[quotient-1]);
            }
            else{
                median=(input[quotient]+input[quotient-1])/2; // why are you taking previous not next value
                System.out.println(median);
               // System.out.println((input[quotient]+input[quotient+1])/2);
            }
            //int count=1;
            //double max_value=input[0];
            //System.out.println(max_value);
            /* max value
            for(int i=0; i<n; i++){
                if(max_value>=input[i]){
                    if(max_value==input[i]){
                        mode=max_value;
                    }
                }
                if (input[i]>=max_value){
                    max_value=input[i];
                    if(max_value==input[i]){
                       // count=count+1;
                        mode=max_value;
                    }  
                }
            } */
            int count=1;
            double max_value=input[0];
            double max_temp;
            int count_temp=0;
            for(int i=0; i<n; i++){
                max_temp=input[i];
                count_temp=0;
                for(int j=1; j< n-1; j++){
                    if(max_temp==input[j]){
                        count_temp=count_temp+1;
                        
                    }
                }
                if (count_temp> count){
                    count=count_temp;
                    max_value=max_temp;
                }
                
            }
            mode=(int)max_value;
            System.out.println(mode); 
        
    }
}
