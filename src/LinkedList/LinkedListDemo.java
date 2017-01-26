package LinkedList;

/**
 * Created by ssharkov on 02.12.2016.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List<Object> i = new List<>();

        i.insertFirst(4.1);
        i.insertFirst(3);
        i.insertFirst("java");
        i.insertFirst(2.2);
        i.insertFirst(1.1);
        i.insertFirst("test");
//        i.insertLast(5);
//        i.insertLast(7);
        i.deleteElement("test1");
//        i.deleteFirst();
//        i.deleteLast();

        System.out.println(i);

        System.out.println(i.getFirstElement());




    }
}
