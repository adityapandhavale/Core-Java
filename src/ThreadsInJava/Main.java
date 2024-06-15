package ThreadsInJava;

public class Main {
    public static void main(String[] args) {
        ThreadsInJava tj = new ThreadsInJava();
        tj.setPriority(10);
        B b = new B();
        b.setPriority(1);
        tj.start();
        b.start();

            Runnable r1 = () -> {
                for (int i = 0; i < 4; i++) {
                    System.out.println("hi");
                }
        };
            Runnable r2 = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hello");
                }
            };

            Thread t1 = new Thread(r1);
            Thread t2 = new Thread(r2);

            t1.start();
            t2.start();
    }
}