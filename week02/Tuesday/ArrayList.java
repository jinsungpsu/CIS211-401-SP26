public class ArrayList<T> implements List<T> {
    // this is implementation details
    // there's no "right" or "wrong" answer
    /* what goes here? */

    // arbitrarily have a default size
    private final int DEFAULT_SIZE = 5;

    // this is a single reference variable that CAN
    // point to an array of type T
    // some code like list[0] = something <-- error
    private T[] list;

    // this is not the capacity of how many things I can store
    // this is a counter for how many things I currently have
    private int count = 0;


    // somewhere I will need something new T[5]

    public ArrayList() {
        // list = new T[5]; // almost there! this doesn't work
        // java won't let us do this... we need an actual type...
        // can't create an array of unknown type
        list = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T item) {  /* what goes here? */
        // can I add it?  is the array full?
        if (count < list.length) {
            list[count] = item;
            count++;
        }
    }
    public void remove(int index) {  /* what goes here? */
        list[index] = null;
        count--;
        // let's shift stuff back one spot
    }

    @Override
    public String toString() {
        return "list contents.. obviously more work to do here....";
    }

    public int size()  {  /* what goes here? */

        return count;
    }
}

class Driver {
    public static void main(String[] args) {
        List<Character> grades = new ArrayList<>();
        grades.add('A');
        grades.add('B');
        grades.add('C');
        grades.add('D');
        grades.add('F');
        grades.add('X'); // this should not actually add

        System.out.println(grades); // create a toString method
        // should output A B C D F

        grades.remove(2); // should remove the 'C'

        System.out.println(grades); // should output
        // A B D F

    }
}
