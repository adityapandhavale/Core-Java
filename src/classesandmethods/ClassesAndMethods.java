package classesandmethods;
class Add{
    public int add(int a, int b){
      return a+b;
    }
}
public class ClassesAndMethods {
    public static void main(String[] args) {

//        Object Creation
        Add addtion= new Add();
        int r;
//        method calling
        r=addtion.add(1,4);
        System.out.println(r);
    }
}