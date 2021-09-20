// https://oj.masaischool.com/contest/1943/problem/1
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
	
	public boolean checkWavePattern(ListNode head) {
		// Write your code here
      ListNode temp=head;
      int n=temp.val;
      temp=temp.next;
      boolean value=true;
      if(temp.val<n) value=false;
      int pointer=0;
      n=temp.val;
      temp=temp.next;
      
      
      if(value){
        while(temp!=null){
          if(pointer%2==0) {
            if(n<temp.val) return false;
          }else{
            if(n>temp.val) return false;
          }
          
          n=temp.val;
          temp=temp.next;
          pointer++;
        }
      }
      else{
        while(temp!=null){
          if(pointer%2==0){
            if(n>temp.val) return false;
          }else{
            if(n<temp.val) return false;
          }
          
          n=temp.val;
          temp=temp.next;
          pointer++;
        }
      }
        
      return true;
	}
}
