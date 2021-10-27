/*
 Problem

    Given the below array

int[] arr = {1,2,3,4,5};

Do the following operations

 - Remove the element at index = 0  // output : 2,3,4,5

 - Remove the element at index = n-1 //output : 1,2,3,4

 - Remove the element at index = 3 // output: 1,2,3,5

Note

Don't create a new array, modify the existing array. Create 3 separate functions to do the same.

    Create an ArrayList of 5 String elements and perform the following operations
        Print all the array elements
        Print the array elements whose length is greater than 5
        Remove the element at index 2 and print the remaining elements
        Change the element at index 3 to "Masai" and print the array List.


*/

public class ArrayOperation {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("After removing value at index 0");
        printValueAfterRemoving(arr,0);
        System.out.println("After removing value at index n-1");
        printValueAfterRemoving(arr, arr.length-1);
        System.out.println("After removing value at 3");
        printValueAfterRemoving(arr, 3);
    }

    public static void  printValueAfterRemoving(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(i!=k){
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();
    }
}


import java.util.ArrayList;

public class ArrayListItem {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Mausam");
        list.add("Abhimanyu");
        list.add("Ashu");
        list.add("Rohit");
        list.add("Intezar");

        //System.out.println(list);
//        for(String a:list){
//            if(a.length()>5){
//                System.out.println(a);
//            }
//        }

        for(int i=0; i<list.size(); i++){
            if(i==2){
                list.remove(i);
            }
            if(i==3){
                list.add("Masai");
            }
        }
        System.out.println(list);
    }
}
