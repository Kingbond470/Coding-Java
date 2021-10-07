// Brute Force
public class Main {
    public static void main(String args[]) {
        int[] arr={3, 3, 4, 2, 4, 3,2, 4, 4};
        int max=0;
        for(int i=0; i<arr.length; i++){
            int count=0; 
            for(int j=0 ; j<arr.length; j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count>max) max=count;
        }
        System.out.println(max>arr.length/2?"yes":"no");
    }
}
/*
Input - {3, 3, 4, 3, 4, 4, 2, 4, 4}
Output- Yes
Input - {3, 2, 3, 3, 4, 4, 2, 4, 4}
Input - No
