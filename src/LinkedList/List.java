package LinkedList;

/**
 * Created by ssharkov on 02.12.2016.
 */
class List<T> {
    private ListElement<T> firstElement;
    //    ListElement lastElement;

    @Override
    public String toString() {
        return firstElement + " ";
    }

    // insert  first element
    void insertFirst(T elementValue) {
        ListElement<T> el = new ListElement<>();
        if (firstElement == null) {
            el.value = elementValue;
            firstElement = el;
        } else {
            el.nextElement = firstElement;
            el.value = elementValue;
            firstElement = el;
        }
    }

    // insert  last element
    void insertLast(T elementValue) {
        ListElement<T> el = new ListElement<>();
        ListElement<T> i = firstElement;
        if (firstElement == null) {
            el.value = elementValue;
            firstElement = el;
        }
        while (i != null) {
            if (i.nextElement == null) {
                i.nextElement = el;
                el.value = elementValue;
//                lastElement = el;
                break;
            }
            i = i.nextElement;
        }
    }

    //delete by value
    void deleteElement(T elementValue) {
        //delete if only 1 element in our list element
        ListElement<T> i = firstElement;
        if (firstElement.value == elementValue) {
            firstElement = firstElement.nextElement;
        }
        //delete  element
        while (i != null && i.nextElement != null) {
            if (i.nextElement.value == elementValue) {
                i.nextElement = i.nextElement.nextElement;
                break;
            }
            i = i.nextElement;
        }
    }

    //delete first element
    void deleteFirst() {
        firstElement = firstElement.nextElement;
    }

    //delete last element
    void deleteLast() {
        ListElement<T> i = firstElement;
        //delete if only 1 element in our list element - ELSE - delete if more than 1 element
        if (firstElement.nextElement == null) {
            firstElement = null;
        } else {
            while (i.nextElement.nextElement != null) {
                i = i.nextElement;
            }
            i.nextElement = null;
        }
    }

    T getFirstElement() {
        ListElement<T> i = firstElement;
        return i.value;
    }

    T getLastElement() {
        ListElement<T> i = firstElement;
        while (i != null) {
            if (i.nextElement == null) {
                break;
            }
            i = i.nextElement;
        }
        return i.value;

    }


    //    // print our list
//    void printList() {
//        ListElement i = firstElement;
//        while (i != null) {
//            System.out.print("[" + i.value + "]" + " ");
//            i = i.nextElement;
//        }
//    }

}
