// https://oj.masaischool.com/contest/1365/problem/5
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int a=0; a<t; a++){
     String str=sc.nextLine();
    
    int n=0, sum=0;
    while(n<str.length()){
      sum=sum+(int)Math.pow(26,str.length()-n-1)*(str.charAt(n)-64);
      n++;
    }
    System.out.println(sum);
  }
}
}



// Second Approach
/*
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test != 0) {
            String arr1 = sc.next();
            String arr = arr1.toUpperCase(Locale.ROOT);
            long sum = 0;
            for (int i = 0; i < arr.length(); i++) {
                    sum= sum*26;
                    sum = sum + (arr.charAt(i)) -64;
                }
            System.out.println(sum);
            test--;
        }
    }
}
*/
