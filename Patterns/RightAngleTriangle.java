//Right angle triangle star pattern
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i>=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}


// output-
 
// n=6
// *      
// * *     
// * * *    
// * * * *   
// * * * * *  
// * * * * * *
