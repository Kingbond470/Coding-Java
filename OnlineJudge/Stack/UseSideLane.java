// https://oj.masaischool.com/contest/2417/problem/2
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int exit = sc.nextInt();
            int n = 0;
            if(exit == 0) break;
            else n=exit;
            Stack<Integer> order = new Stack<>();
            Stack<Integer> truck = new Stack<>();
            boolean val = true;
            int[] ar = new int[n];
            for(int i=0; i<n; i++) {
                order.push(i+1);
                ar[i] = sc.nextInt();
            }
            int i = 0;
            while(order.size()>0) {
                if(i<n) {
                    if(ar[i] == order.peek()) {
                        order.pop();
                        i++;
                    } else if(!truck.isEmpty() && truck.peek() == order.peek()) {
                        truck.pop();
                        order.pop();
                    } else {
                        truck.push(ar[i]);
                        i++;
                    }
                } else if(!truck.isEmpty()){
                    if(truck.peek() == order.peek()) {
                        truck.pop();
                        order.pop();
                    } else {
                        val = false;
                        break;
                    }
                } else {
                    val = false;
                    break;
                }
            }
            System.out.println(val?"yes":"no");
        }
    }
}
