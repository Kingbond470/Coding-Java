/*

    Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new array.

Example 1:

Input: nums = [1,1,2]
Output:  nums = [1,2]

Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: nums = [0,1,2,3,4]
*/
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for(int a: set){
            System.out.print(a+" ");
        }
    }
}
