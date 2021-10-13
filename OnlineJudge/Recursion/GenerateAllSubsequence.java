// https://oj.masaischool.com/contest/1660/problem/2
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int length = sc.nextInt();
        String str = sc.next();
        generateSubString(str, "", count);
    }

    public static void generateSubString(String before, String after, int count) {
        if (count != 0) {
          
          	System.out.println("before "+ before);
            System.out.println("after "+after);
          System.out.println(count);
        }
        for (int i = 0; i < before.length(); i++) {
          System.out.println("i "+ i);
          System.out.println();
            generateSubString(before.substring(i + 1), after + before.charAt(i), count + 1);
        }
    }
}
