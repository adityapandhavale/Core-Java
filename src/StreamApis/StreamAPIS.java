package StreamApis;

import java.util.*;
import java.util.function.*;

public class StreamAPIS {
    StreamAPIS() {
        Consumer<Integer> con =  (n)-> System.out.println(n);
        var sum = 0;
        List<Integer> arrayList = Arrays.asList(2, 3, 4, 5);
//        for (int n : arrayList) {
//            if (n % 2 == 0) {
//                n = n + 2;
//                sum = sum + n;
//                System.out.println(sum);
//            }
//        }
//        arrayList.forEach(n-> System.out.println(n));
        for(Integer c :arrayList) {
            System.out.println(c);
        }
    }
}
