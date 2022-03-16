// File: Clock.java
public class Clock
{
    private int hour;      //The current hour of the clock in 12 hour time
    private int minute;    //The current minute of the clock
    private String ampm;   //Indicator of time before or after noon
    public Clock() {
        hour = 12;
        minute = 00;
        ampm = "A.m.";
    }
    public void setHour(int currentHour) {
        if (currentHour > 12 || currentHour < 1) {
            throw new IllegalArgumentException("Not an hour between 1 and 12.");
        } else {
            hour = currentHour;
        }
    }
    public void setMinute(int currentMinute) {
        if (currentMinute > 59 || currentMinute < 0) {
            throw new IllegalArgumentException("Not a minute between 0 and 59.");
        } else {
            minute = currentMinute;
        }
    }
    public void setAmPm(String currentAmPm) {
        if (currentAmPm != "A.m." || currentAmPm != "P.m.") {
            throw new IllegalArgumentException("Not A.m. or P.m.");
        } else {
            ampm = currentAmPm;
        }
    }
    public boolean isAfterNoon() {
        return (ampm == "P.m.");
    }
    public int getHour() {
        return (hour);
    }
    public int getMinute() {
        return (minute);
    }
    public void advance(int amount) {
        int ampm1440 = 0;
        if (ampm == "P.m.") {
            ampm1440 = 720;
        }
        int minutes1440 = hour * 60 + minute + ampm1440;
        int result1440 = (amount % 1440 + minutes1440) % 1440;
        if (result1440 > 720) {
            ampm = "P.m.";
            result1440 -= 720;
        } else {
            ampm = "A.m.";
        }
        hour = result1440 / 60;
        minute = result1440 % 60;
    }
}




