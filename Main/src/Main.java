public class Main {
    public static void main(String[] args) {

        /*
            Exercise 1
           ------------
           Write a program that prints a receipt.
           The receipt should have a border, date, items purchased & name of the store
           ** Hint: The 'pipe' character (shift + forward-slash) is useful for the side border **
         */

        // Exercise 1 code below
        System.out.println("----------------------");
        System.out.println("| Date: 9/4/2020     |");
        System.out.println("| Wegmans            |");
        System.out.println("| Items Purchased:   |");
        System.out.println("| 1 x Banana         |");
        System.out.println("| 2 x Bread          |");
        System.out.println("| 1 x Orange         |");
        System.out.println("| 1 x Banana         |");
        System.out.println("----------------------");
        /*
            Exercise 2
            ----------
            Write a program that prints your name, and the position of the vowels in your name
            ** Hint: https://docs.oracle.com is your friend **
         */
        String name = "CARINA";
        System.out.println(name);
        int i = 0;
        //iterates through the name
        while (i < name.length()) {
            char letter = name.charAt(i);
            //checks to see if the letter is a vowel and prints the location if it is
            if (letter == 'A'|| letter == 'E' || letter == 'I'|| letter == 'O' || letter == 'u') {
                System.out.println(i);
            }
            //increment counter
            i++;
        }
    }
}