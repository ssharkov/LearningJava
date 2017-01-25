package Learning.Generics.Pair;
/**
 * Структура данных "пара". Содержит два элемента разных типов.
 */
public class Pair<T,Q>{
    private final T elem1;
    private final Q elem2;
    public Pair(T elem1, Q elem2) {
        this.elem1 = elem1;
        this.elem2 = elem2;
    }
    public T getElem1() {
        return elem1;
    }
    public Q getElem2() {
        return elem2;
    }
}