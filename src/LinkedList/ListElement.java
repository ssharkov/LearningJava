package LinkedList;

/**
 * Created by ssharkov on 01.12.2016.
 */
public class ListElement<T> {
    T value;
    ListElement<T> nextElement;


    @Override
    public String toString() {
        return  value + " " + nextElement ;
    }
}


