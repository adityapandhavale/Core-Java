package constructors;
class ConstructorExample{
    public ConstructorExample(){
        System.out.println("hello");
    }
    public ConstructorExample(int roll_no, String name){
        int rn =roll_no;
        String n =name;
        System.out.println(rn+" : "+n);
    }
}
class Constructers {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        ConstructorExample ce1 = new ConstructorExample(11,"Aditya");
    }
}
