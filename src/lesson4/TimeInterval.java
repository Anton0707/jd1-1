package lesson4;

/**
 * Created by admin on 6/18/17.
 */
public class TimeInterval {

    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(70);
        printTimeInterval(timeInterval.getFullSeconds());

    }

    public int seconds;
    public int minutes;
    public int hours;

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeInterval(int seconds) {
        this.seconds = seconds;
    }

    public int getFullSeconds() {
        return (seconds + minutes * 60 + hours * 3600);
    }

    public static void printTimeInterval(int fullSeconds) {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        if (fullSeconds >= 3600) {
            hours = fullSeconds / 3600;
            minutes = (fullSeconds % 3600) / 60;
            seconds = ((fullSeconds % 3600) % 60);
        } else if (fullSeconds < 3600 || fullSeconds >= 60) {
            hours = 0;
            minutes = fullSeconds / 60;
            seconds = fullSeconds % 60;
        } else if (fullSeconds < 60){
            hours = 0;
            minutes = 0;
            seconds = fullSeconds;
        }
            System.out.println(hours + ":" + minutes + ":" + seconds);
    }

}
