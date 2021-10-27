/*

    Create a class Student with the following member variables

    name
    age
    address

Create a list of n Students where n is the number of students in a batch and enter all the above mentioned details. Print the details of all the students. (Take all the inputs from keyboard).

Input Format

    First line takes a value n i.e the number of students
    Second line takes name of the student
    Third line takes age of the student
    Fourth line takes address of the student

Sample Input

2
Ajith
21
#34, Shwethal, Jayanagar
Shashank
28
#22, second floor, Bangalore
*/

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    private String name;
    private int age;
    private String address;


    public StudentList(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display(){
        System.out.println(name+"\n"+age+"\n"+address+"\n");

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<StudentList> list=new ArrayList<>();

        while(t--!=0){
            String name=sc.next();
            String agestr=sc.next();
            sc.nextLine();
            int age=Integer.parseInt(agestr);
            String address=sc.nextLine();
            list.add(new StudentList(name,age,address));
        }

        for(int i=0; i<list.size(); i++){
            list.get(i).display();
        }
    }
}
