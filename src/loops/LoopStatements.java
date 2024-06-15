package loops;
public class LoopStatements {
    public static void main(String[] args) {

//        While loop
        int i = 1;
        while (i <= 2) {
            System.out.println(i);
            i++;
        }
//        Nested while loop
        int k = 1;
        while (k <= 4) {
            System.out.println("Hi");
            int j = 1;
            while (j <= 2) {
                System.out.println("Hello");
                j++;
            }
            k++;
        }

//        Do... While loop
        int a = 1;
        do {
            System.out.println("Aditya ran this code");
            a++;
        } while (a <= 2);

//        for loop
        for (int f = 1; f <= 10; f++) {
            System.out.println(f);
        }

//        Nested for loop
        for (int l = 0; l <= 2; l++) {
            for (int o = 0; o <= l; o++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
