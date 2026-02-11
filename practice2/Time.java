import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time parameters.");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int stdHour = ((hour == 0 || hour == 12) ? 12 : hour % 12);
        String period = (hour < 12 ? "AM" : "PM");
        return String.format("%02d:%02d:%02d %s", stdHour, minute, second, period);
    }

    public void add(Time other) {
        int totalSeconds = this.second + other.second;
        this.second = totalSeconds % 60;
        int carryMin = totalSeconds / 60;

        int totalMinutes = this.minute + other.minute + carryMin;
        this.minute = totalMinutes % 60;
        int carryHr = totalMinutes / 60;

        this.hour = (this.hour + other.hour + carryHr) % 24;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("--- Creating Time Object 1 ---");
            System.out.print("Enter hour (0-23): ");
            int h1 = input.nextInt();
            System.out.print("Enter minute (0-59): ");
            int m1 = input.nextInt();
            System.out.print("Enter second (0-59): ");
            int s1 = input.nextInt();
            
            Time t1 = new Time(h1, m1, s1);
            System.out.println("Time 1 created: " + t1.toUniversal());

            System.out.println("\n--- Creating Time Object 2 (to add) ---");
            System.out.print("Enter hour: ");
            int h2 = input.nextInt();
            System.out.print("Enter minute: ");
            int m2 = input.nextInt();
            System.out.print("Enter second: ");
            int s2 = input.nextInt();
            
            Time t2 = new Time(h2, m2, s2);
            
            System.out.println("\nResults:");
            System.out.println("Time 1 (Standard): " + t1.toStandard());
            System.out.println("Time 2 (Standard): " + t2.toStandard());

            t1.add(t2);
            System.out.println("\nNew Time 1 after adding Time 2:");
            System.out.println("Universal: " + t1.toUniversal());
            System.out.println("Standard:  " + t1.toStandard());

        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}