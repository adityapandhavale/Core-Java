package conditionalStatements;
import java.lang.String;
public class CondtionalStatements {
    public static void main(String[] args) {
        int x=12;
        String result;

//        If-Else Statements
        if(x>10){
            System.out.println("Welcome There!");
        }
        else {
            System.out.println("Bye!");
        }

//        Ternary Operators
        result=x!=12?"Welcome There!":"Bye!";
        System.out.println(result);

        int n =2;
        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Sorry day not found");
        }
    }
}

