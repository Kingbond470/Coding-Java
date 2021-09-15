// https://oj.masaischool.com/contest/1897/problem/1
/*
class Node{
  int data;
  Node next;
  
  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
  public static boolean checkForCycle(Node head){
    //write your code here.
     Node speedSlowTrain=head;
    Node speedFastTrain=head;
    
    if(head == null || head.next == null) return false;
   
    while(speedFastTrain!=null && speedFastTrain.next!=null){
      speedFastTrain=speedFastTrain.next.next;
      if(speedFastTrain==speedSlowTrain) return true;
      speedSlowTrain=speedSlowTrain.next;
    }
    
    return false;
  }
}
