/*
https://www.hackerrank.com/challenges/find-point/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);
int n, px, py, qx, qy;
n=scanner.nextInt();

for (int i = 1; i <= n; i++){

    px=scanner.nextInt();
    py=scanner.nextInt();
    qx=scanner.nextInt();
    qy=scanner.nextInt();        

    int x = 2 * qx - px;
    int y = 2 * qy - py;

    System.out.println(x+" "+y);
}
}
}
