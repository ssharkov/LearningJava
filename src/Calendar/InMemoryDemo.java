package Calendar;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by Сергей on 31.01.2017.
 */
public class InMemoryDemo implements Calendar {
    TreeMap<LocalDateTime,Event> ev = new TreeMap<LocalDateTime, Event>();


    @Override
    public void addEvent(Event event) {
        ev.put(event.startTime,event);
    }

    @Override
    public List<Event> getEvent(LocalDateTime from, LocalDateTime to) {
        SortedMap<LocalDateTime, Event> sortedEvents = ev.subMap(from, to);
        // create list and add all results
        List<Event> list = new ArrayList<Event>(sortedEvents.values());

        return list;
    }


    @Override
    public String toString() {
        return ev + "\n";
    }
}
