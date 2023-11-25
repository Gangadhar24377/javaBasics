public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is " + calculateScore(gameOver, score, levelCompleted, bonus));


// one of the approach, not best one as we're assigning new variables hence takes up storage which is not efficient.
//        boolean gameOver2 = true;
//        int score2 = 10000;
//        int levelCompleted2 = 8;
//        int bonus2 = 200;
//        int finalScore2 = score2;
//        if (gameOver2) {
//            finalScore2 += (levelCompleted2 * bonus2);
//            System.out.println("Your final score was " + finalScore2);
//        }

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

}