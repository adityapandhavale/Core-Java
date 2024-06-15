package CollectionInterfaces;

import  java.util.*;

public class Collect implements Comparable<Collect> {
    int age;
    String name;

    public int compareTo(Collect that) {
        if(this.age > that.age){
            return 1;
        }else{
            return -1;
        }
    }
    public String toString() {
        return "age=" + age +
                ", name='" + name + '\'';
    }

    public Collect(int age, String name) {
        this.age = age;
        this.name = name;
    }
       public void byusingcomparableinterface () {
            ArrayList<Collect> nums = new ArrayList<>();
            nums.add(new Collect(21, "Aditya"));
            nums.add(new Collect(24, "Jditya"));
            nums.add(new Collect(22, "Zditya"));
            nums.add(new Collect(20, "Yditya"));
            Collections.sort(nums);
            for (Collect c : nums) {
                System.out.println(c);
            }
        }
    }