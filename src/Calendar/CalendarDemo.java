package Calendar;

import java.time.LocalDateTime;

/**
 * Created by Сергей on 31.01.2017.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        InMemoryDemo e = new InMemoryDemo();


        LocalDateTime ldt = LocalDateTime.parse("2017-02-01T10:00:00");
        System.out.println("Date: " + ldt);

//        e.addEvent(ldt, "test event","Room 100");
    }
}
