package typecastingAndConverions;
public class TypeCastingAndConversion {
    public static void main(String[] args) {
        //Type Conversion
        byte a=12;
        int b=a;
        System.out.println(b);
        //Type casting
        int c=10;
        byte d= (byte)c;
        System.out.println(d);
        //type promotion
        byte n=10;
        byte m=30;
        int o=n*m;
        System.out.println(o);
    }
}
