package Calendar;

import java.time.LocalDateTime;

/**
 * Created by Сергей on 31.01.2017.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        InMemoryDemo e = new InMemoryDemo();

        LocalDateTime startTime0 = LocalDateTime.parse("2017-02-01T10:00:00");
        LocalDateTime endTime0 = LocalDateTime.parse("2017-02-01T11:00:00");
        LocalDateTime startTime1 = LocalDateTime.parse("2017-02-02T10:00:00");
        LocalDateTime endTime1 = LocalDateTime.parse("2017-02-02T10:30:00");
        LocalDateTime startTime2 = LocalDateTime.parse("2017-02-03T10:00:00");
        LocalDateTime endTime2 = LocalDateTime.parse("2017-02-03T10:30:00");
        LocalDateTime startTime3 = LocalDateTime.parse("2017-02-04T10:00:00");
        LocalDateTime endTime3 = LocalDateTime.parse("2017-02-04T12:00:00");
        LocalDateTime isOccupiedDate = LocalDateTime.parse("2017-02-03T10:29:00");

        Event event0 = new Event(startTime0, endTime0, "test event zero", "101", CallType.CALL);
        Event event1 = new Event(startTime1, endTime1, "test event one ", "101", CallType.MEETING);
        Event event2 = new Event(startTime2, endTime2, "test event two", "102", CallType.PERSONAL);
        Event event3 = new Event(startTime3, endTime3, "test event three", "103", CallType.CALL);


        e.addEvent(event0);
        e.addEvent(event1);
        e.addEvent(event2);
        e.addEvent(event3);
//        e.remove(startTime0);
//        e.remove(startTime1);


//        System.out.println(e.getEventByDate(startTime0,endTime1));
        System.out.println(e.getEventByLocation("101"));
//        System.out.println(e.isOccupied("102",isOccupiedDate));


//        System.out.println(e);


    }
}
