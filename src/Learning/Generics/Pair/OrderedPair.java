//package Learning.Generics.Pair;
//
//import Learning.OOP.Comparable;
//
///**
// * Упорядоченная пара. Структура данных, содержащая два элемента, которые можно сравнивать
// * между сообой. Так же содержит методы для получения минимального и максимального элемента.
// * <p>
// * Comparable - это стандартный java'овский интерфейс, который реализуют классы, экземпляры которых
// * можно сравнивать. Все стандартные джава классы обычно реализуют этот интерфейс: классы обертки
// * приметиыных типов (Integer, Double, ...), String, Date.
// * Параметр типа T в интерфейсе Comparable описывает тип, с которым можно сравнивать объект текущего
// * типа. Например, в объявлении класса String описано
// * <p>
// * class String extends Comparable,
// * <p>
// * то есть строки можно сравнивать только со строками.
// * <p>
// * В нашем классе OrderedPair мы ограничиваем возможные типы элементов нашей пары:
// * <p>
// * T extends Comparable,
// * <p>
// * подразумевая "любой тип T, который можно сравнивать с T"
// */
//public class OrderedPair<T extends Comparable<T>>{
//    private final T elem1;
//    private final T elem2;
//
//    public OrderedPair(T elem1, T elem2) {
//        this.elem1 = elem1;
//        this.elem2 = elem2;
//    }
//
//    public T getMax() {
//        // Стандартный джавовский интерфейс Comparable немного отличается от нашего,
//        // который мы реализовывали на лекции. В нем определен метод
//        //
//        //    int compareTo(T other)
//        //
//        // который должен вернуть
//        //  число<0, если this строго "меньше" чем other,
//        //  число>0, если this строго "больше" чем other,
//        //  0      , если this и other равны.
//        return elem1.compareTo(elem2) < 0 ? elem2 : elem1;
//    }
//
//    public T getMin() {
//        return elem2.compareTo(elem1) < 0 ? elem2 : elem1;
//    }
//}