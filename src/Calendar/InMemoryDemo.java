package Calendar;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by Сергей on 31.01.2017.
 */
public class InMemoryDemo implements Calendar {
    TreeMap<LocalDateTime, Event> ev = new TreeMap<LocalDateTime, Event>();
    HashMap<String, List<Event>> index = new HashMap<String, List<Event>>();


    @Override
    public void addEvent(Event event) {
        ev.put(event.startTime, event);
        List<Event> events = index.get(event.location);

        if (events == null) {
            events = new ArrayList<Event>();
            index.put(event.location, events);
        }
        events.add(event);
    }

    @Override
    public List<Event> getEventByDate(LocalDateTime from, LocalDateTime to) {
        SortedMap<LocalDateTime, Event> sortedEvents = ev.subMap(from, to);
        // create list and add all results
        return new ArrayList<Event>(sortedEvents.values());
    }

    @Override
    public List<Event> getEventByLocation(String location) {
        return index.get(location);
    }

    @Override
    public void remove(LocalDateTime startTime) {

        String loc = ev.get(startTime).getLocation();
        List<Event> events = index.get(loc);
        int i = 0;
        for (Event e : events) {
            if (e.getStartTime().equals(startTime)) {
                break;
            }
            i++;
        }
        events.remove(i);

        ev.remove(startTime);
    }

    @Override
    public boolean isOccupied(String location, LocalDateTime time) {
        boolean success = false;

        List<Event> events = index.get(location);
        for (Event e : events) {
            if (time.isAfter(e.getStartTime()) && time.isBefore(e.getEndTime())) {
                success = true;
            }
        }
        return success;
    }

    @Override
    public String toString() {
        return ev + "\n";
    }
}
