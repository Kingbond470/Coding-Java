// https://oj.masaischool.com/contest/1850/problem/3
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
  public static Node insertAtTail(Node a, int val){
    //write your code here.
    
    if(a==null){
    	a=new Node(val);
        return a;
    }
    else{
      Node temp_node=a;
      while(temp_node.next !=null) temp_node=temp_node.next;
      temp_node.next=new Node(val);
      return a;
    }
  }
}
