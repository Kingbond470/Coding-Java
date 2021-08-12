// https://oj.masaischool.com/contest/1647/problem/1
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sc.next().toCharArray());
        int digit = sc.nextInt();
        String finalStr = stringBuffer.toString();
        System.out.println(sum(finalStr, digit));
    }

    static int sum(String number, int digit) {
        if (number.length() > 1) {
            long sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += Integer.parseInt(String.valueOf(number.charAt(i)));
            }
            return sum(Long.toString(sum * digit), 1);
        } else
            return Integer.parseInt(String.valueOf(number.charAt(0)));
    }
}
