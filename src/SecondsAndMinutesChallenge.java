public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.err.println(getDurationString(65, 45)); // 1h 5m 45s
        System.err.println(getDurationString(3945)); // 1h 5m 45s
        System.err.println(getDurationString(65, 99)); // Invalid data for seconds(99), must be between 0 and 59
        System.err.println(getDurationString(65, -1)); // Invalid data for seconds(-1), must be between 0 and 59
        System.err.println(getDurationString(-1, 45)); // Invalid data for minutes(-1), must be a positive integer value
        System.err.println(getDurationString(-1)); // Invalid data for seconds(-1), must be a positive integer value
        System.err.println(getDurationString(0, 0)); // 0h 0m 0s
        System.err.println(getDurationString(0)); // 0h 0m 0s
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }
}
