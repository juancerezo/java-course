public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1756, -3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int places = 1000;

        double a_truncated = a < 0 ? Math.ceil(a * places) / places : Math.floor(a * places) / places;
        double b_truncated = b < 0 ? Math.ceil(b * places) / places : Math.floor(b * places) / places;

        return a_truncated == b_truncated;
    }

}
