public class Main {
    public static double FindPi(n){
        int total_square_points=0;
        int total_circle_points=0;  
        for(int i=0; i<n; i++){
            double x=Math.random();
            double y=Math.random();
            distance =Math.pow(x,2)+Math.pow(y,2);
            if distance<=1{
                total_circle_points++;
            }
            total_square_points++;
        }
        double pi=4*total_circle_points/total_square_points;
        return pi;
    }
    public static void main(String args[]) {
      //  System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println(FindPi(n));
    }
}
