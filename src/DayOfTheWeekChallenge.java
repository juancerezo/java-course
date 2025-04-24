public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2021));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2023));
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(2025));
        System.out.println(isLeapYear(2026));
        System.out.println(isLeapYear(2027));
        System.out.println(isLeapYear(2028));
        System.out.println(isLeapYear(2029));

    
    }

    public static void printDayOfTheWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println(dayOfWeek);
    }

    public static void printWeekday(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }

        
        if (year % 400 == 0) {
            return true;
        }
        
        return false;
    }

}
