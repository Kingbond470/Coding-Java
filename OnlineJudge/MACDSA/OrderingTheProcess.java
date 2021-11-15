 // https://oj.masaischool.com/contest/2342/problem/3
import java.util.*;
public class Main{
    public static void main(String[] args){
        // input
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> order=new ArrayList<>();
        ArrayList<Integer> iOrder=new ArrayList<>();
        for(int i=0; i<n; i++) order.add(sc.nextInt());
        for(int i=0; i<n; i++) iOrder.add(sc.nextInt());
        
        System.out.println(timeTaken(order,iOrder));
    }
    
    
    public static int timeTaken(ArrayList<Integer> order, ArrayList<Integer> iOrder){
        int count=0;
        
        while(order.size()>0){
            if(order.get(0)==iOrder.get(0)){
                order.remove(0);
                iOrder.remove(0);
                count++;
            }else{
                while(order.get(0)!=iOrder.get(0)){
                    order.add(order.remove(0));
                    count++;
                }
            }
        }
        
        return count;
    }
}
