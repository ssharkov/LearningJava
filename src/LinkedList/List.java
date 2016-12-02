package LinkedList;

/**
 * Created by ssharkov on 02.12.2016.
 */
public class List {
    ListElement firstElement;
//    ListElement nextElement;

    // insert as first element
    void insertFirst(int elementValue) {
        ListElement el = new ListElement();

        if (firstElement == null) {
            el.value = elementValue;
            firstElement = el;
        } else {
            el.nextElement = firstElement;
            el.value = elementValue;
            firstElement = el;
        }
    }

    void deleteElement(int elementValue) {
//delete first element
        ListElement i = firstElement;

        if (firstElement.value == elementValue) {
            firstElement = firstElement.nextElement;
        }
//delete last element
        while (i != null) {
            if (i.nextElement.value == elementValue) {
                i.nextElement = i.nextElement.nextElement;
                i = i.nextElement;
            }
        }
    }

    // print our list
    void printList() {
        ListElement i = firstElement;
        while (i != null) {
            System.out.print(i.value + " ");
            i = i.nextElement;
        }
    }
}
