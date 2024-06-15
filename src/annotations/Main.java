package annotations;

public class Main {
    public static void main(String[] args) {
        Annotations MC = new Annotations()
        {
            /* method Level Annotations */
            @Override
            String name (String s)
            {
                return  s;
            }
        };
        String aditya = MC.name("Aditya");
        System.out.println(aditya);
    }
}