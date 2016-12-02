package Learning;

/**
 * Created by ssharkov on 22.11.2016.
 */
public class Example3_IF {
    public static void main(String[] args) {
        int x,y;

        x = 10;
        y = 20;

        if  (x<y) System.out.println("x less than y");

        x = x*2;
        if (x==y) System.out.println("now x = y");

        x = x+1;
        if (x>y) System.out.println("now x bigger y");
    }
}
