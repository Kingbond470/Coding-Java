/*
https://codemas.masaischool.com/contest/3/problem/01
Description

    You need to take a number as input.

    Multiply the numberby 50, and print the result obtained

Input

The first and the only line of the input contains the number stored in the variablenumber

Constraints

1 <= N <= 20

Output

Print a single number, the result obtained by multiplying it by 50

Sample Input 1
2

Sample Output 1
100

Hint

In the sample test case, the value stored in the variablenumberis 2. After, multiplying by 50, the answer obtained is 100. Therefore, the answer obtained is 100.
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n*50);
    }
}
