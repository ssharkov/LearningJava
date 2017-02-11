package Calendar;

import java.time.LocalDateTime;

/**
 * Created by Сергей on 31.01.2017.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        InMemoryDemo e = new InMemoryDemo();

        LocalDateTime ldt0 = LocalDateTime.parse("2017-02-01T10:00:00");
        LocalDateTime ldt1 = LocalDateTime.parse("2017-02-02T10:00:00");
        LocalDateTime ldt2 = LocalDateTime.parse("2017-02-03T10:00:00");
        LocalDateTime ldt3 = LocalDateTime.parse("2017-02-04T10:00:00");

        Event event0 = new Event(ldt0, "test event zero", "100");
        Event event1 = new Event(ldt1, "test event one ", "101");
        Event event2 = new Event(ldt2, "test event two", "102");
        Event event3 = new Event(ldt3, "test event three", "103");

        e.addEvent(event0);
        e.addEvent(event1);
        e.addEvent(event2);
        e.addEvent(event3);
//        e.remove(ldt1);

//        System.out.println(e.getEventByDate(ldt,ldt2));
        System.out.println(e.getEventByLocation("101"));


//        System.out.println(e);


    }
}
