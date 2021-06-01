import java.util.Scanner;
public class Main {
    public static void FindPi(int n){
        double total_square_points=0;
        double total_circle_points=0;  
        double distance;
        for(int i=0; i<n; i++){
            double x=Math.random();
            double y=Math.random();
            //double distance =Math.pow(x,2)+Math.pow(y,2);
            distance=x*x+y*y;
            if (distance<1){
                total_circle_points++;
            }
            total_square_points++;
        }
        double pi=4*(total_circle_points/total_square_points);
        System.out.println(pi);
        //return pi;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FindPi(n);
      //  System.out.println(FindPi(n));
    }
}
