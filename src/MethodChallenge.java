public class MethodChallenge {
    public static void main(String[] args) {
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Alice", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Charlie", highScore);

        highScore = calculateHighScorePosition(-50);
        displayHighScorePosition("Dave", highScore);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

}
