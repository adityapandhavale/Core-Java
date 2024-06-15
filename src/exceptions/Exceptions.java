package exceptions;

//Try catch() block
class OutOfBoundsException extends Exception{
    OutOfBoundsException(String s){
        super(s);
    }
}

public class Exceptions {
    int i=0;
    int j ;
    int arr[]={1,2,3,4};
    Exceptions(){
        try {
            j = 10 / i;
            System.out.println(j);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Number can not be devide by "+i);
        }
        try {
            if (j == 0) {
                throw new OutOfBoundsException("extend the array size");
            }
            System.out.println(arr[5]);
        }
        catch (OutOfBoundsException e){
            System.out.println(e);
            System.out.println("The array length is : "+arr.length);
        }
    }
}
