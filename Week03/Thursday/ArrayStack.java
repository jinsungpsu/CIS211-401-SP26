import java.util.NoSuchElementException;

public class ArrayStack<T> implements Stack<T> {
    /*
    Refer to Shafer text chapter 4, section 2
    BUT
    this version is going to be slightly different...
    The textbook version has a variable called "top"

    our classroom version will use a variable called "count"

    they perform similar roles, but are slightly different

    (FYI, exam questions will use count, not top)
     */
    private T[] stackContents;

    private final int DEFAULT_CAPACITY = 5;

    private int count = 0;

    public ArrayStack() {
        stackContents = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public ArrayStack(int initialSize) {
        stackContents = (T[]) (new Object[initialSize]);
    }

    @Override
    public void push(T item) throws IllegalStateException{
        // so, if index 0 is the bottom
        // then the insertion point will keep shifting
        // to the "right"

        // let's make sure there's enough space

        if (count < stackContents.length) {
            stackContents[count] = item;
            count++;
        } else {
            // array is full
            throw new IllegalStateException("The array that stores stuff in this stack implementation is full.  I am not gonna resize anything, because that takes work.");
        }

    }

    @Override
    public T pop() {
        // how do you know if the stack is empty?
        if (count == 0) {
            // don't do this... not because it's "wrong"
            // in terms of does it work or not
            // it's wrong, because the interface documentation defined it as
            // returning null instead
            // throw new NoSuchElementException();
            return null;
        } else {
            // do something else
            // aka return the top item
            // and remove
        }
        return null;
    }

    @Override
    public T peek() {

        return stackContents[0];
    }
}

interface Stack<T> {
    void push(T item) throws IllegalStateException;
    T pop();
    T peek();
}
