public class LinkedList {
    private Node head;
    private int count = 0;

    public void add(int item) {
        addInGeneral(item);
//        if (count == 0) {
//            Node node = new Node();
//            node.data = item;
//            node.next = null; // unnecessary
//            head = node;
//        } else if (count == 1) {
//            addSecondNode(item);
//        } else if (count == 2) {
//            addThird(item);
//        }
        count++;
    }

    private void addSecondNode(int item) {
        Node node = new Node();
        node.data = item;
        node.next = null; // unncessary
        head.next = node;
    }

    private void addThird(int item) {
        Node node = new Node();
        node.data = item;
        node.next = null; // unncessary
        head.next.next = node;
    }

    private void addInGeneral(int item) {
        Node node = new Node();
        node.data = item;
        node.next = null; // unncessary

        // special cast for 1st item
        if (head == null) {
            // another way of asking the question
            // if the list is empty
            // we could also re-write this as
            // if (count == 0)
            head = node;
            return;
            // don't do the rest of the stuff... exit this
            // method immediately
        }

        // we want to iterate to the "end" or "tail"
        Node itr = head; // i=0
        for (int i = 0; i < count-1; i++) {
            // "i++"
            itr = itr.next;
        }
        // once the for loop finishes running
        // itr should point at the tail
        // aka last item in this list
        // aka... i can attach this node here now
        itr.next = node;
    }

    public void remove(int index) {

    }

    @Override
    public String toString() {
        return "";
    }

    // nested, inner class
    // inner class has access to type params
    // the outer class will have access
    // to all its members
    class Node {
        int data;
        Node next;
    }
}

class LabTester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        System.out.println(list); // should display 1 2
        list.add(3);
        list.add(4);
        System.out.println(list); // should display 1 2 3 4
        list.remove(2); // should remove value 3, index 2
        System.out.println(list); // should display 1 2 4
    }
}
