public class Main {
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else if (score >= 5000 && score < 10000) {
            System.out.println("Your score was between 5000 and 10000");
        } else {
            System.out.println("Your score was greater than or equal to 10000");
        }
    }
}
