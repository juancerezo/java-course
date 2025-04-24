public class OveloadedMethodChallenge {
    public static void main(String[] args) {
        System.out.println("32 inches = " + convertToCentimeters(32) + " cm");
        System.out.println("5 feet and 8 inches = " + convertToCentimeters(5, 8) + " cm");

    }

    public static double convertToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(double feet, double inches) {
        inches = feet * 12 + inches;
        return convertToCentimeters(inches);
    }
}
