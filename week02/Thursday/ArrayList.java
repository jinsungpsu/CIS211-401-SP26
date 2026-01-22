public class ArrayList<T> implements List<T> {
    // this is implementation details
    // there's no "right" or "wrong" answer
    /* what goes here? */

    // arbitrarily have a default size
    private final int DEFAULT_SIZE = 6;

    // this is a single reference variable that CAN
    // point to an array of type T
    // some code like list[0] = something <-- error
    private T[] list;

    // this is not the capacity of how many things I can store
    // this is a counter for how many things I currently have
    private int count = 0;


    // somewhere I will need something new T[5]

    public ArrayList() {
        // list = new T[6]; // almost there! this doesn't work
        // java won't let us do this... we need an actual type...
        // can't create an array of unknown type
        list = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T item) {  /* what goes here? */
        // can I add it?  is the array full?
        if (count < list.length) {
            /*
            this is one possible approach if we don't shift things
            when removing from the list

            for (int i = 0; i < list.length; i++) {
                if (list[i] == null) {
                    // means i found an empty spot!
                    list[i] = item;
                }
            }

             */
            list[count] = item;
            count++;
        } else {
            // do some fancy stuff
            // "to make my array bigger" <-- no such thing +
        }
    }
    public void remove(int index) {  /* what goes here? */
        list[index] = null;
        count--;
        // let's shift stuff back one spot
        // so that... we don't have to add extra logic
        // to the add method
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i+1];
        }

        list[count] = null;
    }

    @Override
    public String toString() {
        if (count == 0) {
            return "[]";
        }

        // return "A, B, C, E"
        //return list[0] + ", " + list[1];
        // return "list contents.. obviously more work to do here....";
        // String output = "";
// a string is an array of characters...

        // so.... the length of a String (or char array) is IMMUTABLE
        // so we can use a similar class like ArrayList
        // which facilitates some better way of handling changing lengths of a string
        StringBuilder o = new StringBuilder();

        o.append("[");

        for (int i = 0; i < count -1; i++) {
            o.append(list[i] + ", ");
        }

        o.append(list[count-1] + "]");

        return o.toString();

//        output += "[";
//
//        for (int i = 0; i < count-1; i++) {
//            output += list[i] + ", ";
//        }
//
//        output += list[count-1] + "]";

//        System.out.print("[");
//        for (int i = 0; i < count-1; i++) {
//            System.out.print(list[i] + ", ");
//        }
//        System.out.print(list[count-1] + "]");

        //return output;
    }

    public int size()  {  /* what goes here? */
        return count;
    }
}

class Driver {
    public static void main(String[] args) {
        List<Character> grades = new ArrayList<>();

        System.out.println(grades);

        grades.add('A');
        grades.add('B');
        grades.add('C');
        grades.add('D');
        grades.add('F');
        grades.add('G');
        grades.add('X'); // this should not actually add

        System.out.println(grades); // create a toString method
        // should output A B C D F G

        grades.remove(2); // should remove the 'C'

        System.out.println(grades); // should output
        // A B D F

    }
}
