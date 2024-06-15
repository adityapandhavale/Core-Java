package encapsulation;
class Humen{
    int age;
    String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age,String name,Humen hu) {
        hu.age = age;
        hu.name=name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Humen hu = new Humen();
        hu.setAge(2,"aditya",hu);
        int age = hu.getAge();
        String name = hu.getName();
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
