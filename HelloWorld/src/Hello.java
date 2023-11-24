public class Hello {

    public static void main (String[] args){
        System.out.println("Hello World");

        boolean isAlien = true;
        if (isAlien == true) {                                 // code block
            System.out.println("It is not an alien!");
            System.out.println("Scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than 2nd top scorer and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is supposed to happen");

        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        Double var1 = 20.00d;
        Double var2 = 80.00d;
        Double add = (var1 + var2)*100.00d;
        System.out.println("My add is: " + add);
        double rem = add % 40.00d;
        System.out.println("The rem is: " + rem);
        boolean rem2 = (rem == 0) ? true : false;
        System.out.println("The rem2 is: " + rem2);
        if (!rem2) {
            System.out.println("Got some reminder");
        }
    }
}
