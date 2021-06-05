/*

    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:

Input: nums = [0]
Output: [0]
*/
import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeroArray {
//    Input: nums = [0,1,0,3,12]
//    Output: [1,3,12,0,0]
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0; i<n; i++){
        nums[i]=sc.nextInt();
    }

    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> new_list=new ArrayList<>();
    for(int i=0; i<n; i++){
        if(nums[i]==0){
            new_list.add(nums[i]);
        }
        else{
            list.add(nums[i]);
        }
    }

    for(int value: new_list){
        list.add(new_list.get(value));
    }
    System.out.println(list);
}
}



