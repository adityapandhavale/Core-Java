package arrays.arrayrefrences;
import java.lang.String;
class Student{
    int roll_no,marks;
    String name;
}
public class ArrayOfReference {
    public static void main(String[] args) {
        char name;
        Student s1= new Student();
        s1.roll_no=1;
        s1.name="Aditya";
        s1.marks=10;

        Student s2= new Student();
        s2.roll_no=2;
        s2.name="Rupesh";
        s2.marks=8;

        Student s3= new Student();
        s3.roll_no=3;
        s3.name="Rajesh";
        s3.marks=9;

        Student student[]={s1,s2,s3};
         for (Student n:student){
             System.out.println(n.name+" : "+n.roll_no+" : "+n.marks);
         }
    }
}