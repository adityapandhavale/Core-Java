package operators;
public class Operators {
    public static void main(String[] args) {
        //relational operators
        int a=100;
        int b=300;
        int aa=200;
        int bb=200;
        boolean c=(a<b);
        boolean d=(a>b);
        boolean e=(a==b);
        boolean f=(a!=b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //logical operators
        //AND operators
        boolean g= a>b && aa<bb;
        System.out.println(g);

//        OR OPERATOES
        boolean h=a>b||aa==bb;
        System.out.println(h);

//        NOT operator
        System.out.println(!h);

    }
}
