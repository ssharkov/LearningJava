package Calendar;

import java.time.LocalDateTime;

/**
 * Created by Сергей on 31.01.2017.
 */
public class Event {
    LocalDateTime startTime;
    LocalDateTime endTime;
    String subject;
    String location;
    CallType type;


    public Event(LocalDateTime startTime, LocalDateTime endTime, String subject, String location, CallType type) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.subject = subject;
        this.location = location;
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return startTime + "\n" + endTime + "\n" + subject + "\n" + location + "\n" + type + "\n";
    }
}
