// https://oj.masaischool.com/contest/1897/problem/3
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
  public static boolean detectPalindrome(Node a){
    //complete this function.
    
    Node pre=null;
    Node temp=a;
    Node current=a;
    Node future=null;
    
    while(temp!=null){
      future=temp.next;
      temp.next=pre;
        pre=temp;
      temp=future;
    }
    
    while(current!=null){
      if(current.data != pre.data) return false;
      current=current.next;
      pre=pre.next;
    }
    return true;
  }
}
