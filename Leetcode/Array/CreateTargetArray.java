/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:
    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
It is guaranteed that the insertion operations will be valid.
 
Example 1:
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:
Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
Example 3:
Input: nums = [1], index = [0]
Output: [1]
 
Constraints:
    1 <= nums.length, index.length <= 100
    nums.length == index.length
    0 <= nums[i] <= 100
    0 <= index[i] <= iGiven two arrays of integers nums and index. Your task is to create target array under the following rules:
    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
It is guaranteed that the insertion operations will be valid.
 
Example 1:
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:
Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
Example 3:
Input: nums = [1], index = [0]
Output: [1]
 
Constraints:
    1 <= nums.length, index.length <= 100
    nums.length == index.length
    0 <= nums[i] <= 100
    0 <= index[i] <= i
*/

import java.util.ArrayList;
import java.util.Scanner;
public class NumsAndIndexArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array num and index size : ");
        int n=sc.nextInt();
        int[] num=new int[n];
        int[] index=new int[n];

        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            index[i]=sc.nextInt();
        }
        ArrayList<Integer> new_arr=new ArrayList<>();
        for(int i=0; i<n; i++){
            int index_value=index[i];
            int num_value=num[i];
            new_arr.add(index_value,num_value);
        }
for(int a: new_arr){
    System.out.print(a+" ");
}
    }
}


/*
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index_no=index[i];
            int nums_value=nums[i];
            list.add(index_no,nums_value);
        }
        int[] new_list=new int[nums.length];
        for(int i=0; i<list.size(); i++){
           // System.out.print();
            new_list[i]=list.get(i);
        }
        
        return new_list;
    }
}
*/
