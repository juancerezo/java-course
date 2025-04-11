public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Juan!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 81;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Ether or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double totalValue = (firstValue + secondValue) * 100.00d;
        System.out.println("Total Value: " + totalValue);
        double remainder = totalValue % 40.00d;
        System.out.println("Remainder: " + remainder);
        boolean isNoReminder = (remainder == 0) ? true : false;
        System.out.println("Is no reminder: " + isNoReminder);
        if (!isNoReminder) {
            System.out.println("Got some remainder");
        }

    }

}
