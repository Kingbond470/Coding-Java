/*
https://www.hackerrank.com/challenges/grading/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    // find the length of list and and iterate through each number, find quotent and remainder... if the no is greater than 38 then do rounding or not rounding( if else) if no/5 && n%5 if remainder==0 then print no, if remainder!=0 then no/5=q and n%5=r then r-3<=0 then q+1*5 else n return 
    int length_list=grades.size();
    for(int i=0; i<length_list; i++){
        //System.out.println(grades.get(i));
        int number =grades.get(i);
        int quotient=number/5;
        int remainder=number%5;
        if(number < 38){
            grades.set(i,number);
        }
        else{
            
            int new_number=(quotient+1)*5;
            int value=new_number-number;
                if (value<3){
                grades.set(i,new_number);
               // System.out.println(new_number);
                }
                else{
                    grades.set(i,number);
                 //   System.out.println(number);
                }
            
        }
    }
    return grades;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
