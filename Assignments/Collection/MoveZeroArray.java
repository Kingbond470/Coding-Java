/*

    A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

Example 1:

Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.

Example 2:

Input: s = "Bb"
Output: "Bb"
Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.

Example 3:

Input: s = "c"
Output: ""
Explanation: There are no nice substrings.

Example 4:

Input: s = "dDzeE"
Output: "dD"
Explanation: Both "dD" and "eE" are the longest nice substrings.
As there are multiple longest nice substrings, return "dD" since it occurs earlier.
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
