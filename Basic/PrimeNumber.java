import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int j=0;j<n; j++){
            for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            }
        }
        int j=arr.length;
        for(int i=0; i<n; i++){
           //sum<lesser than increment i 
           //sum>greater than decrement j and if i==j break out of loop
        }
        for(int i=0;i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
