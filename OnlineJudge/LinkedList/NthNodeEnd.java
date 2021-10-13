// https://oj.masaischool.com/contest/1861/problem/4
/*
class Node{
  int data;
  Node next;
  
  Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  Node(int data){
    this.data = data;
    this.next = null;
  }
  Node(){
    this.data = 0;
    this.next = null;
  }
}
*/

class Solution{
  public int nthNode(Node head,int n){
    //write your code here.
    
   // two pointer approach
    Node temp1=head;
    Node temp2=head;
    
    for(int i=0; i<n && temp1!=null; i++) temp1=temp1.next;
    
    while(temp1 !=null){ 
      temp1=temp1.next;
      temp2=temp2.next;
    }
    return temp2.data;
  }
}
