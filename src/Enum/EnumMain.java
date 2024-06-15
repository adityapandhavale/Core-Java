package Enum;

import com.sun.net.httpserver.Authenticator;

import static Enum.Status.*;

public class EnumMain {
    public static void main(String[] args) {
        Status s = Running;
        System.out.println(s);

        //Use of if-else and Switch

        if (s == Running) {
            System.out.println("All set");
        } else if (s == Status.Success) {
            System.out.println("Done");
        } else if (s == Status.Pending) {
            System.out.println("Wait for server response");
        } else {
            System.out.println("Connection Failed");
        }

        switch (s) {
            // Lambda Expressions
            case Running -> System.out.println("All set");
            case Pending -> System.out.println("wait for response");
            case Failed -> System.out.println("Sorry can not connect");
            default -> System.out.println("Done");
        }
        for(UseOfConstructorUsingEnum n : UseOfConstructorUsingEnum.values()) {
            System.out.println(n +" : "+n.price);
        }
    }
}