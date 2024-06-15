package inheritance;
/*Single Level Inheritance :
When child class inherits the property of single parent class
class Parent{
    public void parent(){
        String parent= "This is parent class";
        System.out.println(parent);
    }
}
class Child extends Parent {
    public void child() {
        parent();
    }
}*/

/* Multi-Level Inheritance:
When the feature of the one class are inherited by another class and another class is extended
by another class like grand-parent to parent to child then it is known to as
multi-level inheritance.
 */
class GrandParent{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class Parent extends GrandParent{
    public void sub(int a, int b){
        if(a>b) {
            System.out.println(a - b);
        }
        else {
            System.out.println(b - a);
        }
    }
}
class Child extends Parent{
    public int multiply(int a,int b){
        add(a,b);
        sub(a,b);
        return a*b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        int calc = c.multiply(6,5);
        System.out.println(calc);
    }
}

