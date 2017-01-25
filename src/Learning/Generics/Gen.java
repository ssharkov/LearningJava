package Learning.Generics;

/**
 * Created by ssharkov on 24.01.2017.
 */
public class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
    void showType(){
        System.out.println("Type T is " +ob.getClass().getName());
    }
}
