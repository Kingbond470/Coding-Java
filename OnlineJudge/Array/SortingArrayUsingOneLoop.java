public class Main {
    public static void main(String args[]) {
       int[] arr={7,1,5,3,6,4};
        

        //sorting the array using one loop
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
              int  temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        // 1 7 5 3 6 4
        // 1 5 7 3 6 4
        // 1 5 3 7 6 4
        // 1 3 5 7 6 4
        // 1 3 5 6 7 4
        // 1 3 5 6 4 7
        // 1 3 5 4 6 7
        // 1 3 4 5 6 7
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
