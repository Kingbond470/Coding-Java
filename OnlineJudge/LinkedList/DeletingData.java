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
  public static Node deleteNode(Node a,int pos){
    //write your code here.
    Node temp=a;
    
    if(pos==0) { 
      temp=temp.next;
      return null;
    }
    
    int count=0;
    while(temp!=null && count<pos-1){
      temp=temp.next;
      count++;
    }
    
    if(temp==null) return null;
    if(temp.next==null) return null;
    Node tail=temp.next.next;
    temp.next=tail;
    return a;
  }
}
