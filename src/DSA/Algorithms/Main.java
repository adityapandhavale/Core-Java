package DSA.Algorithms;


class LinearSearch{
    public int linearSearch(){
        int[] nums ={1,2,3,4};
        int target=2;
        var steps= 0;
        for(int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                return i;
            }
        }
        System.out.println(steps);
        return -1;
    }
}

class BinarySearch {
    static int[] nums = {11,12, 13, 14, 15, 16, 17, 18, 19, 20};
    static int mid = 0;
    static int target = 11;
    int left = 0;
    int right = nums.length - 1;

    public int binarySearch()  {
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target){
                left = mid+1;
            }
           else{
                right = mid-1;
            }
        }
        return -1;
    }
}
public class Main  {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
       LinearSearch ls = new LinearSearch();
        int result1 = ls.linearSearch();
        if (result1 != -1) {
            System.out.println("Element found at : " + result1);
        }
        else {
            System.out.println("Element not found");
        }

       BinarySearch bs = new BinarySearch();
       int result2 = bs.binarySearch();
        if (result2 != -1) {
            System.out.println("Element found at : " + result2);
        }
        else {
            System.out.println("Element not found");
        }
    }
}