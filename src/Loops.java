
public class Loops {

    public static void main(String[] args) {

        int x = 0;
        // While loop that prints all even # from 0 - 100
        while ( x <= 100 ) {
            System.out.println(x);
            x += 2;
        }

        // Making X equal to 100
        x = 100;
        // While loop that prints every 3rd number backwards from 100 - 0
        while ( x >= 0 ) {
            System.out.println(x);
            x -= 3;
        }
        // For loop that prints every other number from 1 - 100
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
        // For loop that prints every number 0 - 100
        for (int i = 0; i <= 100; i ++) {
            System.out.println(i);

            if (i % 3 == 0) { // if statement, printing "World" on number divisible by 3 instead of the number
                System.out.println("Hello");

            } else if (i % 5 == 0) { // else if statement, printing "World" on number divisible by 5 instead of the number
                System.out.println("World");

            } else if (i % 3 == 0 && i % 5 == 0) { // else if statement, printing "Hello World" on number divisible by both 3 & 5
                    System.out.println("Hello World");

                } else {
                    System.out.println(i);
                }

            }
        }
    } // Main
} // Class
