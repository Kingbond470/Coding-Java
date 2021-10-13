/*

*/
//method -1
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double[] arr=new double[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextDouble();
     // System.out.print(arr[i]);
    }
    int count=0;
    double value=0.0;
    for(int a=0; a<n; a++){
      for(int b=0; b<n; b++){
        for(int c=0; c<n; c++){
          for(int d=0; d<n; d++){
            for(int e=0; e<n; e++){
             // if(arr[d]!=0) 
              value=(((arr[a]*arr[b])+arr[c])/arr[d])-arr[e];	//a*b+c/d -e
              for(int f=0; f<n; f++){               
                if(value==arr[f]) {
                  count++;
                //  System.out.println(value+" "+arr[f]);
               // System.out.println(arr[a]+" "+arr[b]+" "+arr[c]+" "+arr[d]+" "+arr[e]+" "+arr[f]);
                }
              }
            }
          }
        }
      }
      }//end of logic
      System.out.println(count);
    }
  }

//method -2 all test cases passed using gfg
import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    //user input
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    for(int i=0; i<n; i++) {
      ar[i] = sc.nextInt();
    }
    
    
    //
    int idx = 0;
    int[] right = new int[n*n*n+1];
    for(int i=0; i<n; i++) {
      if(ar[i]!=0) {
        for(int j=0; j<n; j++) {
          for(int k=0; k<n; k++) {
            right[idx] = ar[i]*(ar[j]+ar[k]);
            idx++;
          }
        }
      }
    }
    Arrays.sort(right);
    int res = 0;
    for(int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {
        for(int k=0; k<n; k++) {
          int temp = ar[i]*ar[j]+ar[k];
          res += (upper(right, temp) - lower(right, temp));
        }
      }
    }
    System.out.println(res);
  }
  public static int upper(int[] ar, int n) {
    int l = 0;
    int h = ar.length;
    while(l<h) {
      int mid = (l+h)>>1;
      if(n>=ar[mid]) l=mid+1;
      else h = mid;
    }
    return l;
  }
  public static int lower(int[] ar, int n) {
    int l = 0;
    int h = ar.length;
    while(l<h) {
      int mid = (l+h)>>1;
      if (n<=ar[mid]) h=mid;
      else l = mid+1;
    }
    return l;
  }
}
