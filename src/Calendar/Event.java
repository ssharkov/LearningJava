package Calendar;

import java.time.LocalDateTime;

/**
 * Created by Сергей on 31.01.2017.
 */
public class Event {
    LocalDateTime startTime;
    String subject;
    String location;

    public Event(LocalDateTime startTime, String subject, String location) {
        this.startTime = startTime;
        this.subject = subject;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return startTime + "\n" + subject + "\n" + location + "\n";
    }
}
