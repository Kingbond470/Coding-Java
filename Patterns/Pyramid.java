import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Hello World!");
        for (int i=0; i<n; i++){      // outer loop to check the number of star
            for(int j=0; j<n; j++){     // to print the star according to given condition
                if(i+j<n){              // to print the space
                    System.out.print(" ");
                }
                else{
                System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}


// Output:-
//   Hello World!
      
//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * *
