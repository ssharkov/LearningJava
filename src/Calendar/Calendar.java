package Calendar;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Сергей on 31.01.2017.
 */
public interface Calendar {
    void  addEvent(Event event);
    List<Event> getEvent(LocalDateTime from, LocalDateTime to);
//    List<Event> getEvent(String location);
//    remove(starttime);



}
