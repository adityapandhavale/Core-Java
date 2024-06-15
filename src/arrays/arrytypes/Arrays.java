package arrays.arrytypes;

class Array {
    int singleDimentionalArray() {
        int array[] = {1, 2, 3, 8, 5, 6};
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }
        return 0;
    }

    int multidimentionalArray(){
        int array[][]={{1,2},{3,4},{5,6}};
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2 ; j++) {
                System.out.print(array[i][j]+"\t ");
            }
            System.out.println("");
        }
        return 0;
    }
}
public class Arrays {
    public static void main(String[] args) {
        Array a = new Array();
//        a.singleDimentionalArray();
        a.multidimentionalArray();
    }
}