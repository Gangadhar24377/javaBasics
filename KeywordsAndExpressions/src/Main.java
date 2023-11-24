public class Main {

    public static void main(String[] args) {
// This below code block is for understanding what expressions are. As an exercise u can count no.of expressions in the below code block
        double kilometers = ( 100 * 1.609344);

        int highScore = 50;

        if (highScore > 25) {
         highScore = 1000 + highScore;   // add bonus points
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}
