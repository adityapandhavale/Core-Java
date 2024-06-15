package superandthiskeywords;
class A{
   A(){
       System.out.println("Constructor In A");
   }
    A(int a){
        System.out.println("In A int");
    }
}
class B extends A{
    B(){
        //by default executes and calls the super class methods
        super();
        System.out.println("Constructor in B");
    }
    B(int a){
        //represents current object of the class
        this();
        System.out.println("In B int");
    }
}
public class SuperAndThis {
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B(2);
    }
}
