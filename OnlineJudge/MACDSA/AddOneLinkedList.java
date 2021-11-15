// https://oj.masaischool.com/contest/2342/problem/4
/*
class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}
*/
class Solution{
  public Node addOneToLinkedList(Node head){
    
    // try to reverse the linked list and add one to it
    if(head==null) return new Node(1);
    
    head=reverse(head);
    int carry=1;
    
    int sum=0;
    Node curr=head;
    while(carry>0){
         sum=curr.data+carry;
         curr.data=sum%10;
         carry=sum/10;
         if(curr.next==null){
             break;
         }
         curr=curr.next;
    }
    if(carry>0) curr.next=new Node(carry);
    head=reverse(head);
    
    return head;
    
    
  }
  
  // to reverse the linked list
  public static Node reverse(Node head){
      Node prev=null;
      Node curr=head;
      Node next;
      
      while(curr!=null){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
      }
      
      head=prev;
      return head;
  }
}
