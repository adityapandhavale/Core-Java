package inputFromUsers;

import java.io.*;
import java.util.Scanner;


public class InputFromUser{
    public InputFromUser() throws IOException {
        System.out.println("Enter a number");
//       int a = System.in.read();
//        System.out.println(a);
//        InputStreamReader is = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(is);
//        int num =Integer.parseInt(bf.readLine());
//        System.out.println(num);
//        bf.close();
        //After 1.5 we got Scanner class
        Scanner sc = new Scanner(System.in);
        int pf = sc.nextInt();
        System.out.println(pf-2);
    }
}
