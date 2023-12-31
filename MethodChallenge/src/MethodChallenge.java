// Question: Create 2 methods:
/*the first method should be named displayHighScorePosition.
* This method should have 2 parameters, one for player's name and one for player's position in a high score list.
* This method should print a message like "Tim managed to get into position 2 on high score list."
* The second method should be named calculateHighScorePosition.
* This method should have only one parameter, the player's score.
* This method should return a number between 1 and 4, based on the score values shown in this table.
*
* Score: (column 1)                                          Result (Column 2)
*Score greater than or equal to 1000                             1
*Score greater than or equal to 500 but less than 1000           2
* Score greater than or equal to 100 but less than 500          3
*All other scores                                                4
*
* Finally, we'll call both methods  and display the results for the following scores: 1500, 1000, 500, 100, and 25.
* */


public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition);
    }

    public static  void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position " + highScorePosition + " on the high score list.");

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