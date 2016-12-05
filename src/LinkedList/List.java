package LinkedList;

/**
 * Created by ssharkov on 02.12.2016.
 */
public class List {
    ListElement firstElement;
    ListElement lastElement;
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

    void insertLast(int elementValue) {
        ListElement el = new ListElement();
        ListElement i = firstElement;
        if (firstElement == null) {
            el.value = elementValue;
            firstElement = el;
        }
        while (i != null) {
            if (i.nextElement == null) {
                i.nextElement = el;
                el.value = elementValue;
                lastElement = el;
                break;
            }
            i = i.nextElement;
        }
    }

    void deleteElement(int elementValue) {
//delete first element
        ListElement i = firstElement;

        if (firstElement.value == elementValue) {
            firstElement = firstElement.nextElement;
        }
//delete last element
        while (i != null && i.nextElement != null) {
            if (i.nextElement.value == elementValue) {
                i.nextElement = i.nextElement.nextElement;
                break;
            }
            i = i.nextElement;
        }
    }

    void deleteFirst() {
        firstElement = firstElement.nextElement;
    }

    void deleteLast() {
        ListElement i = firstElement;
        while (i.nextElement.nextElement != null)
            i = i.nextElement;
        i.nextElement = null;
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
