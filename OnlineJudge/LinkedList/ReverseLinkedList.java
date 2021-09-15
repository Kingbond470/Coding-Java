// https://oj.masaischool.com/contest/1874/problem/1
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
  public static Node reverseLinkedList(Node a){
    //write your code here.
    
    Node temp=a;
    Node previousNode=null;
    Node currentNode=null;
    
    while(temp!=null){
      currentNode=temp;
      temp=temp.next;
      currentNode.next=previousNode;
      previousNode=currentNode;
      a=currentNode;
    }
    return a;
  }
}
