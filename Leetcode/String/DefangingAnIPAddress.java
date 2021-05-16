/*
https://leetcode.com/problems/defanging-an-ip-address/
*/
class Solution {
    public String defangIPaddr(String address) {
        // find the . and replace it with [.], in new string don't take 
        // first and last pos value which is " "
        // System.out.print(address);
        String new_address="";
        String new_address1="";
        String new_value="[.]";
      //  System.out.println(address.length());
        for(int i=0; i<address.length(); i++){
         // System.out.print(address.substring(i)+" "); 
            String value=address.substring(i,i+1);      // substring(start, to_end)
           //ystem.out.print(value+ " ");
            if(value.equals(".")){
                new_address=new_address+new_value;
               // System.out.print(new_address+" ");
            }else{
                new_address=new_address+value;
              //  System.out.print(new_address+" ");
            }
       }
        
        return new_address;
    }
}
