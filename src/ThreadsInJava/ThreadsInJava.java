package  ThreadsInJava;
public class ThreadsInJava extends Thread {
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Threads in Java");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("In B class");
        }
    }
}