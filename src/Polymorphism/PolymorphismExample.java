package Polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Classes c = new Classes();
        //same object behaving differently
        //(Dynamic method dispatch)
        // Run-time Polymorphism
        c.show(20,20);
        c = new ChildClass();
        c.show(20,20);
    }
}