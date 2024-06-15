package methodoverloading;
class Addition{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
      /*  Method Overloading : It is the concept where methods
        belongs to the same class has same method name
        but different parameters */
        Addition addtion= new Addition();
        System.out.println(addtion.add(5,60));
        System.out.println(addtion.add(5,60,3));
    }
}