package Learning.Generics.Pair;
/**
 * Структура данных "пара". Содержит два элемента одного и того же типа.
 * "Mutable" в названии класса означает "изменяемая", то есть состояние объекта может меняться
 * после его создания с помощью setter'ов.
 */
public class MutablePair<T> {
    private T elem1;
    private T elem2;
    public MutablePair(T elem1, T elem2) {
        this.elem1 = elem1;
        this.elem2 = elem2;
    }
    public T getElem1() {
        return elem1;
    }
    public T getElem2() {
        return elem2;
    }
    public void setElem1(T elem1) {
        this.elem1 = elem1;
    }
    public void setElem2(T elem2) {
        this.elem2 = elem2;
    }
}