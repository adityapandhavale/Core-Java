package staticKeyworda;
class Mobile{
    static String brand="IPHONE";
    String name="Aditya";
    int price;
    static void name(){
        System.out.println(brand);
    }
    static {
        System.out.println("Hello Aditya");
    }
}
public class StaticKeyWord {
    public static void main(String[] args) throws ClassNotFoundException {

        Mobile mb= new Mobile();
        mb.name="IPHONE 12";
        mb.price=10_000;

        Mobile mb1= new Mobile();
        mb1.name="note 12";
        mb1.price=12_000;

        Mobile[] mobile ={mb,mb1};

        for (Mobile m :mobile){
            System.out.println(Mobile.brand +" "+m.price+" "+m.name);
        }
        Class.forName("Mobile");
    }
}
