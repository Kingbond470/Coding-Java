// https://oj.masaischool.com/contest/1874/problem/3
/*
class Node{
  int data;
  Node next;
  public Node(){
    this.next = null;
    this.data = 0;
  }
  public Node(int data,Node next){
    this.next = next;
    this.data = data;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/

class Solution{
  
  public static Node rotateNode(Node a,int k,int n){
    
   if(k%n==0) return a;
   else{
     k=k%n;
    
     for(int i=0; i<k; i++){
        Node temp=a;
     Node res=null;
     while(temp.next !=null){
       if(temp.next.next==null) {
         res=temp.next;
         temp.next=null;
       }
       else{
         temp=temp.next;
       }
     }
     
     res.next=a;
     a=res;
     }
     
   }
    return a;
  }
}
