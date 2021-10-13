// https://oj.masaischool.com/contest/1913/problem/1
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
  public Node mergeTwoLinkedList(Node a,Node b){
    if(a==null) return b;
    else if(b==null) return a;
    
    Node temp, head;
    
    if(a.data < b.data) {
      temp = head = a;
      a = a.next;
    } else {
      temp = head = b;
      b= b.next;
    }
    while(a!=null && b!=null) {
      if(a.data<b.data) {
        temp.next = a;
        a = a.next;
      } else {
        temp.next = b;
        b = b.next;
      }
      temp = temp.next;
    }
    if(a== null && b!=null) {
      temp.next = b;
    } else if(b==null && a!=null) {
      temp.next = a;
    }
    return head;
  }
}
