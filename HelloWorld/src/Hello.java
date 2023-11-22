public class Hello {

    public static void main (String[] args){
        System.out.println("Hello World");

        boolean isAlien = true;
        if (isAlien == false) {                                 // code block
            System.out.println("It is not an alien!");
            System.out.println("Scared of aliens");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than 2nd top scorer and less than 100");

        }
    }

}
