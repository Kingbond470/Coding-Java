// https://oj.masaischool.com/contest/1874/problem/2
/*
class Node{
	int data;
	Node next;

	Node(){
		this.data = 0;
		this.next = null;
	}
	Node(Node next,int data){
		this.data = data;
		this.next = next; 
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
*/

class Solution{
  public int middleNode(Node a){
    //write your code here.
  Node slow=a;
    Node fast=a;
    while(fast!=null || fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow.data;
    
  }
}
