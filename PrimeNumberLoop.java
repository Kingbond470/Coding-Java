//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int r=sc.nextInt();
    boolean flag=true;
  
     for(int number=l; number<=r; number++){
		for(int i=2; i<=r; i++){
          if(number==i){					// number divided by itself so continue to check next iteration
            continue;
          }
          else{
          if (number%i==0){
            flag=false;			// number is not prime 
            break;
          }
          }
        }
       if(flag){
         System.out.print(number+" ");
       }
       else{
        // System.out.println("hello");
       }
       
     }
          
            
    
}
}
