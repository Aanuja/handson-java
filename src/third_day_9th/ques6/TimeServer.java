package  third_day_9th.ques6;

import java.time.LocalDateTime;

public interface TimeServer {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                        int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}
