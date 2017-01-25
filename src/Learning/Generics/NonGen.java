package Learning.Generics;

/**
 * Created by ssharkov on 24.01.2017.
 */
public class NonGen {
    Object ob;

    public NonGen(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }
    void showType(){
        System.out.println("Type ob = " + ob.getClass().getName());
    }
}
