package abstaction;

//can not create obj of abstract class.
//An abstract method must e written in
//the abstract class.
//An abstract class may or may not have
//an abstract methods.
abstract class AbstactionInJava {
    int a = 20;
    void marks(){
        System.out.println(a);
    }
    abstract void name();
}
//the class which extends the abstract class
// is known as concreate class : "is thre class
// which allow to create its refernce object".
class Defination extends AbstactionInJava{
    String name = "aditya";
    void name(){
        System.out.println(name);
    }
}
