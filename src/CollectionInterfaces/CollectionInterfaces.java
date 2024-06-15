package CollectionInterfaces;

import java.util.*;


public class CollectionInterfaces {
    CollectionInterfaces() {
        Collection<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(4);
        for (int n : num){
            System.out.println(n);
        }
    }
    CollectionInterfaces(int i, int j, int k, int o) {
        Collection<Integer> nums = new TreeSet<>();
        nums.add(i);
        nums.add(j);
        nums.add(k);
        nums.add(o);

        Iterator<Integer> values =nums.iterator();

        while (values.hasNext()){
            System.out.println(values.next());
        }
    }
}