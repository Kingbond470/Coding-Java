/*
 Problem

    Create a HashMap with name as key and rollNo as value with total 5 items
        Print all the key-value
        Print the value whose key length>5
        Remove all key-value where key length >=6 and print all the elements after removing

    Create a Set and add the below values

India
Pak
China
India
Aus
Pak
Japan

    Print all the elements after adding all the elements
    Print the elements whose length>=3
    Remove the object "India"


*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mausam", 45);
        map.put("rohit", 40);
        map.put("abhimanyu", 38);
        map.put("ashu", 10);
        map.put("intezar", 50);

//        for(Map.Entry<String,Integer> set:map.entrySet()){
//           // System.out.println(set.getKey()+" "+set.getValue());
////            if(set.getKey().length()>5){
////                System.out.println(set.getKey()+" "+set.getValue());
////            }
//            if(set.getKey().length()>=6){
//           //  map.remove(set.getKey());
//
//            }else{
//                System.out.println(set.getKey()+" "+set.getValue());
//            }
//        }

        Iterator<Map.Entry<String,Integer>> set=map.entrySet().iterator();
        while (set.hasNext()){
            Map.Entry<String,Integer> val= set.next();
            if(val.getKey().length()>=6) set.remove();
            else System.out.println(val.getKey()+" "+val.getValue());
        }


    }
}


import java.util.LinkedHashSet;
import java.util.Set;

public class IndiaSet {
    public static void main(String[] args){
        Set<String> set=new LinkedHashSet<>();

        // input
        set.add("India");
        set.add("Pak");
        set.add("China");
        set.add("India");
        set.add("Aus");
        set.add("Pak");
        set.add("Japan");

        // to print all elements
        System.out.println(set);
        for(String a:set){
            if(a.length()>=3){
              //  System.out.println(a);
            }
        }
        set.remove("India");
        System.out.println(set);
    }
}
