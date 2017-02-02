package Calendar;

import java.time.LocalDateTime;

/**
 * Created by Сергей on 31.01.2017.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        InMemoryDemo e = new InMemoryDemo();

        LocalDateTime ldt = LocalDateTime.parse("2017-02-01T10:00:00");
        LocalDateTime ldt1 = LocalDateTime.parse("2017-02-02T10:00:00");
        LocalDateTime ldt2 = LocalDateTime.parse("2017-02-03T10:00:00");

        Event event = new Event(ldt, "test event", "Room 100");
        Event event1 = new Event(ldt1, "test event one ", "Room 101");
        Event event2 = new Event(ldt2, "test event two", "Room 102");

        e.addEvent(event);
        e.addEvent(event1);
        e.addEvent(event2);

        System.out.println(e.getEvent(ldt,ldt2));
        System.out.println();
        System.out.println();


//        System.out.println(e);




    }
}
