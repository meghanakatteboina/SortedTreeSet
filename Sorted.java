import java.util.Set;
import java.util.TreeSet;

public class Sorted {
    public static void main(String args[]) {
        //Sorted TreeSet = a collection of unique elements
        //              in sorted order, allowing for efficient
        //              insertion, deletion, and lookup operations

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(99);
        nums.add(33);
        nums.add(55);
        nums.add(44);
        nums.add(77);

        nums.add(33);

        for(int n : nums){
            System.out.println(n);
        }
    }
}
