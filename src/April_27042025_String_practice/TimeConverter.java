package April_27042025_String_practice;
public class TimeConverter {

    public static void main(String[] args) {
        int totalMinutes = 93; // Example input: 93 minutes
        convertMinutesToHoursMinutesSeconds(totalMinutes);
    }

    public static void convertMinutesToHoursMinutesSeconds(int totalMinutes) {
        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        int seconds = 0; // Assuming the initial input is only in minutes

        System.out.println(hours + "hr " + remainingMinutes + "min " + seconds + "secs");
    }
}
