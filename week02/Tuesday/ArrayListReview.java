import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ArraylistReview {
    public static void main(String[] args) {
        // what kind of "thing" will
        // this ArrayList hold?
        // must be inside the <>
        // MUST be a class
        // cannot be a primitive type
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list.add(10);

        list.add(20);

        list.remove(1); // removes index 1, or the value 20

        System.out.println(list); // toString method
        // don't have to use a loop!

        // arrays are fixed in size
        // ArrayList - I don't have to "worry" about size

        // primitive types
        int num = 5;
        double num2 = 5.5;

        // corresponding reference type
        // aka wrapper class
        Integer num3 = 5;
        // similar to Integer num3 = new Integer();
    }
}
