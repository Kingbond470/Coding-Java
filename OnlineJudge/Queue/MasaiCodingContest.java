// https://oj.masaischool.com/contest/1538/problem/D5-1
import java.util.*;
public class Main {
    public static void main(String[] args) {
      
      //taking user input
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        Queue<Integer> club1 = new LinkedList<>();
        Queue<Integer> club2 = new LinkedList<>();
        Queue<Integer> club3 = new LinkedList<>();
        Queue<Integer> club4 = new LinkedList<>();
        Queue<Integer> allQueue = new LinkedList<>();
        for (int i = 0; i < cases; i++) {
            String str = sc.next();
          
          // for adding to single queue to result queue
            if (str.equals("E")) {
                int club = sc.nextInt();
                if (club == 1) {
                    club1.add(club);
                    club1.add(sc.nextInt());
                    if (!allQueue.contains(club)) {
                        allQueue.add(club);
                    }
                } else if (club == 2) {
                    club2.add(club);
                    club2.add(sc.nextInt());
                    if (!allQueue.contains(club)) {
                        allQueue.add(club);
                    }
                } else if (club == 3) {
                    club3.add(club);
                    club3.add(sc.nextInt());
                    if (!allQueue.contains(club)) {
                        allQueue.add(club);
                    }
                } else if (club == 4) {
                    club4.add(club);
                    club4.add(sc.nextInt());
                    if (!allQueue.contains(club)) {
                        allQueue.add(club);
                    }
                }
            } 
          
          //to remove the value from queue
          else {
                if (!allQueue.isEmpty()) {
                    if (allQueue.peek() == 1) {
                        System.out.print(club1.poll() + " ");
                        System.out.println(club1.poll());
                        if (club1.isEmpty()) {
                            allQueue.poll();
                        }
                    } else if (allQueue.peek() == 2) {
                        System.out.print(club2.poll() + " ");
                        System.out.println(club2.poll());
                        if (club2.isEmpty()) {
                            allQueue.poll();
                        }
                    } else if (allQueue.peek() == 3) {
                        System.out.print(club3.poll() + " ");
                        System.out.println(club3.poll());
                        if (club3.isEmpty()) {
                            allQueue.poll();
                        }
                    } else if (allQueue.peek() == 4) {
                        System.out.print(club4.poll() + " ");
                        System.out.println(club4.poll());
                        if (club4.isEmpty()) {
                            allQueue.poll();
                        }
                    }
                }
            }
        }
    }
}
