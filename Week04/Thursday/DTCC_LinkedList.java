public class DTCC_LinkedList {
    private int count = 0;

    private Node head;

    public void add(int item) {
        Node node = new Node(item);

        count++;

        if (head == null) {
            head = node;
        } else {
            Node itr = head;
            while (itr.next != null) {
                itr = itr.next;
            }

            itr.next = node;
        }
    }

    public int get(int index) {
        Node itr = head;

        // it would make sense to use a for loop
        // because it's a counter based loop
        // specifically - using index

        return itr.data;
    }

    @Override
    public String toString() {
        StringBuilder o = new StringBuilder();

        // for inspiration
        // https://github.com/jinsungpsu/CIS211-401-SP26/blob/main/week02/Thursday/ArrayList.java

        return o.toString();
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}

class DTCC_LinkedLisTester {
    public static void main(String[] args) {
        DTCC_LinkedList list = new DTCC_LinkedList();
        list.add(99);
        list.add(199);
        System.out.println(list.get(0)); // print 99
        list.add(0);
        list.add(77);
        System.out.println(list.get(3)); // print 77
    }
}
