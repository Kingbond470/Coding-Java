/*

    Create a class Student with parameterised constructor which contains the below details ,

    List of StudentDetails class which has the following member variables
        name
        DOB
        blood group

Print the details of all the student and also calculate the age from DOB.
*/

public class Student {

    private String name;
    private String dob;
    private String bloodGroup;

    public Student(String name, String dob, String bloodGroup) {
        this.name = name;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }
}


public class StudentDetails {

    private String name;
    private String dob;
    private String bloodGroup;

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    protected void calculateAge(String dob, int n){
        this.dob=dob;
        String[] agestr=dob.split("-");
        int dateOfBirth=Integer.parseInt(agestr[2]);
        System.out.println("Student "+n+" age is "+(2021-dateOfBirth));
    }

    protected void display(int n){
        System.out.println("Student "+n+" name is "+name);
        calculateAge(dob,n);
        System.out.println("Student "+n+" blood group is "+bloodGroup);
    }


    public static void main(String[] args){
        Student student=new Student("Aman","19-05-1995","O+ve");
        String name=student.getName();
        String dob=student.getDob();
        String bloodGroup=student.getBloodGroup();
        StudentDetails studentDetails=new StudentDetails();
        studentDetails.setName(name);
        studentDetails.setDob(dob);
        studentDetails.setBloodGroup(bloodGroup);
        studentDetails.display(1);

        System.out.println();

        Student student1=new Student("Rahul Vats","18-05-1998","AB -ve");
        String name1=student1.getName();
        String dob1=student1.getDob();
        String bloodGroup1=student1.getBloodGroup();
        StudentDetails studentDetails1=new StudentDetails();
        studentDetails1.setName(name1);
        studentDetails1.setDob(dob1);
        studentDetails1.setBloodGroup(bloodGroup1);
        studentDetails1.display(2);

    }
}
