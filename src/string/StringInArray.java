package string;
public class StringInArray {
    public static void main(String[] args) {
        String name =new String("Aditya");
        System.out.println(name.hashCode());
        String name1 =new String("Aditya");
        System.out.println(name1.hashCode());
        System.out.println("Hello "+name);
        System.out.println(name.charAt(3));

        /*String Constant Pool*/

        StringBuffer sb = new StringBuffer("Aditya");
        System.out.println(sb.hashCode());
        StringBuffer sb1 = new StringBuffer("Aditya");
        System.out.println(sb1.hashCode());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" are You Serious?"));
        System.out.println(sb.insert(0,"Hello "));
    }
}