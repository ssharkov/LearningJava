package LinkedList;

/**
 * Created by ssharkov on 02.12.2016.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List i = new List();

        i.insertFirst(4);
        i.insertFirst(3);
        i.insertFirst(2);
        i.insertFirst(1);
        i.deleteElement(3);

        i.printList();

    }
}
