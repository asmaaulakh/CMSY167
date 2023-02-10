package exc1;

// This program has a purpose of helping young students learn to alphabetize words.

import java.util.Scanner;

public class Alphabetize {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        boolean continueComparing = true;

        // Get user input for word1 and word 2
        while (continueComparing) {

            // Prompt user for first word
            System.out.println("Please enter a word: ");
            String firstWord = input.nextLine();

            // Prompt user for second word
            System.out.println("Please enter another word: ");
            String secondWord = input.nextLine();

            // Compare first and second word- make sure it is not case sensitive
            int compareResult = firstWord.compareToIgnoreCase(secondWord);

            // Compare word1 and word2 and observe comparison
            if (compareResult == 0) {
                System.out.println(firstWord + " and " + secondWord + " are the same word");
            }
            else if(compareResult < 0) {
                System.out.println(firstWord + " comes before " + secondWord);
            }
            else {
                System.out.println(secondWord + " comes before " + firstWord);
            }

            // Ask user if they would like to compare more words and store it
            System.out.println("Would you like to compare more words? Answer Yes/No. ");
            String answer = input.nextLine();

            // If the user says no then exit the program
            if (answer.equalsIgnoreCase("No")) {
                continueComparing = false;
                System.out.println("Goodbye!");
            }

        }

    }
}
