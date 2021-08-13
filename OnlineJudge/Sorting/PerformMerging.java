// https://oj.masaischool.com/contest/1671/problem/2
import java.util.*;
public class Main {
  	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int len = sc.nextInt();
      	int[] nums1 = new int[len];
      	int[] nums2 = new int[len];
      	for(int i=0; i<len; i++) {
          	nums1[i] = sc.nextInt();
        }
      	for(int i=0; i<len; i++) {
          	nums2[i] = sc.nextInt();
        }
      	int[] res = new int[2*len];
      	res = merge(nums1, nums2);
      	for(int i:res) {
          	System.out.print(i+" ");
        }
      
    }
  	public static int[] merge(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                res[i+j] = nums1[i];
                i++;
            } else {
                res[i+j] = nums2[j];
                j++;
            }
        }
        for (; i < nums1.length; i++) {
            res[i+j] = nums1[i];
        }
        for (; j < nums2.length; j++) {
            res[i+j] = nums2[j];
        }
        return res;
    }
}
