public class ArrayStack<T> implements Stack<T> {
    private T[] stackContents;

    @Override
    public void push(T item) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {

        return stackContents[0];
    }
}

interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
}
