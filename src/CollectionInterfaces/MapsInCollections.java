package CollectionInterfaces;

import java.util.*;

public class MapsInCollections {
   MapsInCollections(){
        Map <String, Integer> Students= new HashMap<>();
        Students.put("Aditya",27);
        Students.put("Jatin",34);
        Students.put("Manoj",38);
        Students.put("Rupesh",55);
        for(String key : Students.keySet()){
            System.out.println(key + " : " + Students.get(key));
        }
    }
}
