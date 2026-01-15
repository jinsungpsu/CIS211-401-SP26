import java.util.ArrayList;

public class List {
    private int num1;
    private int num2;
    private int count = 0;
    public void add(int number) {
        if (count == 0) {
            num1 = number;
            count++;
        } else if (count == 1) {
            num2 = number;
            count++;
        } else {
            // this dumb list is full
            // can't add anymore
        }
    }

    @Override
    public String toString() {
        if (count == 0) {
            return "{}";
        } else if (count == 1) {
            return "{" + num1 + "}";
        } else if (count == 2) {
            return "{" + num1 + ", " + num2 + "}";
        }
        return "";
    }
}

class Tester {
    public static void main(String[] args) {
        System.out.println("ArrayList example: ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(99);
        System.out.println(list);

        System.out.println("Dumb list example: ");
        List mylist = new List();

        mylist.add(1);
        mylist.add(99);

        System.out.println(mylist);

    }
}
