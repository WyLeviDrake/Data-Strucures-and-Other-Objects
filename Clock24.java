// File: Clock24.java
public class Clock24 {
    private int time;

    public Clock24() {
        time = 0;
    }

    public void setTime(int currentHour, int currentMinute, String currentAmPm) {
        if (currentHour > 12 || currentHour < 1) {
            throw new IllegalArgumentException("Not an hour between 1 and 12");
        } else if (currentMinute > 59 || currentMinute < 0) {
            throw new IllegalArgumentException("Not a minute between 0 and 59");
        } else if (currentAmPm != "A.m." && currentAmPm != "P.m.") {
            throw new IllegalArgumentException("Not A.m. or P.m.");
        } else {
            time = convert12To24(currentHour, currentMinute, currentAmPm);
        }
    }
    public void advanceTime(int minutes) {
        time = (minutes % 1440 + time) % 1440;
    }
    public void advanceHoursMinutes(int hours, int minutes, String ampm) {
        advanceTime(convert12To24(hours, minutes, ampm));
    }

    public int getTime1440() {
        return time;
    }
    public int getHour() {
        int timeHours = time / 60;
        if (timeHours == 0) {
            return 12;
        } else if (timeHours > 12) {
            return timeHours - 12;
        } else {
            return timeHours;
        }
    }
    public int getMinute() {
        return time % 60;
    }
    public boolean isBeforeNoon() {
        return time <= 720;
    }

    private int convert12To24(int currentHour, int currentMinute, String currentAmPm) {
        int ampmvalue = 0;
        if (currentAmPm == "P.m.") {
            ampmvalue = 720;
        }
        if (currentHour == 12) {
            currentHour = 0;
        }
        return (currentHour * 60 + currentMinute + ampmvalue) % 1440;
    }
}   
