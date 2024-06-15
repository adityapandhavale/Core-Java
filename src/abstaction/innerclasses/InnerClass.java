package abstaction.innerclasses;
public class InnerClass {
    public static void main(String[] args) {
        SourceCode sc = new SourceCode();
        sc.studentName();
        SourceCode.MarksOfStudent marksOfStudent = sc.new MarksOfStudent();
        marksOfStudent.studentMarks();
    }
}
