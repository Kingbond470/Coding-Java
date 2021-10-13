https://oj.masaischool.com/contest/1671/problem/1

import java.util.*;
public class Main {
  	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int len = sc.nextInt();
      	int[] nums = new int[len];
      	for(int i=0; i<len; i++) {
          	nums[i] = sc.nextInt();
        }
      	nums = mergeSort(nums);
      	for(int i:nums) {
          	System.out.print(i+" ");
        }
    }
    public static int[] mergeSort(int[] nums) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(new int[]{nums[i]});
        }
        while (list.size() > 1) {
            ArrayList<int[]> result = new ArrayList<>();
            for (int i = 0; i < list.size(); i = i + 2) {
                if (i == list.size() - 1) {
                    result.add(list.get(i));
                } else {
                    int[] res = merge(list.get(i), list.get(i+1));
                    result.add(res);
                }
            }
            list = result;
        }
        return list.get(0);
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
