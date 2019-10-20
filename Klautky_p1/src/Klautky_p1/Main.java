package Klautky_p1;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) { // So I know this main looks awful, at least for me. However, I'm not smart
        // enough to make it look better!
        boolean runProgram = true; // infinite loop

        while(runProgram) {

            int userLevel = PromptUserLevel(); // Retrieve the user's desired level
            int userType = PromptProblemType(); // Retrieve the user's desired problem type

            int correctAnswers = 0;

            if(userType == 1) {
                for (int i = 0; i < 10; i++) {
                    correctAnswers = AdditionQ(correctAnswers, userLevel); // goes in with the level, brings back
                }                                                          // the number of correct Answers.
            }

            if(userType == 2) {
                for (int i = 0; i < 10; i++) {
                    correctAnswers = MultiplicationQ(correctAnswers, userLevel);
                }
            }

            if(userType == 3) {
                for (int i = 0; i < 10; i++) {
                    correctAnswers = SubtractionQ(correctAnswers, userLevel);
                }
            }

            if(userType == 4) {
                for (int i = 0; i < 10; i++) {
                    correctAnswers = DivisionQ(correctAnswers, userLevel);
                }
            }

            if(userType == 5) {

                Random rndNum = new Random();

                for (int i = 0; i < 10; i++) {

                    int rndQuestion = rndNum.nextInt(4) + 1;

                    switch (rndQuestion) { // Not the most clever way to do this I think, but it worked first try!
                        case 1:
                            correctAnswers = AdditionQ(correctAnswers, userLevel);
                            break;

                        case 2:
                            correctAnswers = MultiplicationQ(correctAnswers, userLevel);
                            break;

                        case 3:
                            correctAnswers = SubtractionQ(correctAnswers, userLevel);
                            break;

                        case 4:
                            correctAnswers = DivisionQ(correctAnswers, userLevel);
                            break;
                    }
                }
            }

            float finalScore = (correctAnswers / 10.0f) * 100;

            System.out.println("Your score is " + finalScore + "% ... ");

            if (finalScore <= 75.0f) {
                System.out.println("Please ask your teacher for extra help.");
                System.out.println("Next student please.");
            }

            else {
                System.out.println("Congratulations, you are ready to go to the next level!");
                System.out.println("Next student please");
            }
        }

    }


    public static int PromptUserLevel() { // moving this stuff into other methods so it's easier to follow

        System.out.println("Choose a difficulty level:");
        System.out.println("Level-1");
        System.out.println("Level-2");
        System.out.println("Level-3");
        System.out.println("Level-4");

        Scanner input = new Scanner(System.in);
        int userLevel = input.nextInt();

        return userLevel;
    }


    public static int PromptProblemType() {

        System.out.println("Choose a Type of Arithmetic:");

        System.out.println("Addition - 1");
        System.out.println("Multiplication - 2");
        System.out.println("Subtraction - 3");
        System.out.println("Division - 4");
        System.out.println("Everything - 5");

        Scanner input = new Scanner(System.in);
        int type = input.nextInt();

        return type;
    }


    public static int MultiplicationQ(int numOfCorrectAnswers, int userLevel) { // each type has it's own copy/paste code
        // with some tweaks to it depending on the arithmetic
        int num1 = 0;
        int num2 = 0;

        Scanner in = new Scanner(System.in);
        SecureRandom randNum = new SecureRandom();

        if(userLevel == 1) {
            num1 = randNum.nextInt(10);
            num2 = randNum.nextInt(10);
        }

        if(userLevel == 2) {
            num1 = randNum.nextInt(100);
            num2 = randNum.nextInt(100);
        }

        if(userLevel == 3) {
            num1 = randNum.nextInt(1000);
            num2 = randNum.nextInt(1000);
        }

        if(userLevel == 4) {
            num1 = randNum.nextInt(10000);
            num2 = randNum.nextInt(10000);
        }
        // Get the student's input
        System.out.println("How much is " + num1 + " times " + num2 + "?");
        int userAns = in.nextInt();

        // Check the answer and see if it's right or wrong
        if (userAns == (num1 * num2)) {

            QResponses(true);
            numOfCorrectAnswers++;
        }

        else if (userAns != (num1 * num2)) {

            QResponses(false);
        }


        return numOfCorrectAnswers;
    }


    public static int AdditionQ(int numOfCorrectAnswers, int userLevel) {

        int num1 = 0;
        int num2 = 0;

        Scanner in = new Scanner(System.in);
        SecureRandom randNum = new SecureRandom();

        if (userLevel == 1) {
            num1 = randNum.nextInt(10);
            num2 = randNum.nextInt(10);
        }
        if (userLevel == 2) {
            num1 = randNum.nextInt(100);
            num2 = randNum.nextInt(100);
        }

        if (userLevel == 3) {
            num1 = randNum.nextInt(1000);
            num2 = randNum.nextInt(1000);
        }

        if (userLevel == 4) {
            num1 = randNum.nextInt(10000);
            num2 = randNum.nextInt(10000);
        }

        System.out.println("How much is " + num1 + " plus " + num2 + "?");
        int userAns = in.nextInt();

        if (userAns == (num1 + num2)) {

            QResponses(true);
            numOfCorrectAnswers++;
        } else if (userAns != (num1 * num2)) {

            QResponses(false);
        }

        return numOfCorrectAnswers;
    }


    public static int SubtractionQ(int numOfCorrectAnswers, int userLevel) {

        int num1 = 0;
        int num2 = 0;

        Scanner in = new Scanner(System.in);
        SecureRandom randNum = new SecureRandom();

        if (userLevel == 1) {
            num1 = randNum.nextInt(10);
            num2 = randNum.nextInt(10);
        }

        if (userLevel == 2) {
            num1 = randNum.nextInt(100);
            num2 = randNum.nextInt(100);
        }

        if (userLevel == 3) {
            num1 = randNum.nextInt(1000);
            num2 = randNum.nextInt(1000);
        }

        if (userLevel == 4) {
            num1 = randNum.nextInt(10000);
            num2 = randNum.nextInt(10000);
        }

        System.out.println("How much is " + num1 + " minus " + num2 + "?");
        int userAns = in.nextInt();

        if (userAns == (num1 - num2)) {

            QResponses(true);
            numOfCorrectAnswers++;
        } else if (userAns != (num1 - num2)) {

            QResponses(false);
        }

        return numOfCorrectAnswers;
    }


    public static int DivisionQ(int numOfCorrectAnswers, int userLevel) {

        int num1 = 0;
        int num2 = 0;

        Scanner in = new Scanner(System.in);
        SecureRandom randNum = new SecureRandom();

        if (userLevel == 1) {
            num1 = randNum.nextInt(10);
            num2 = randNum.nextInt(10);
        }

        if (userLevel == 2) {
            num1 = randNum.nextInt(100);
            num2 = randNum.nextInt(100);
        }

        if (userLevel == 3) {
            num1 = randNum.nextInt(1000);
            num2 = randNum.nextInt(1000);
        }

        if (userLevel == 4) {
            num1 = randNum.nextInt(10000);
            num2 = randNum.nextInt(10000);
        }

        System.out.println("How much is " + num1 + " divided by " + num2 + "?");
        double userAns = in.nextDouble();

        final double threshold = 0.1;
        if (Math.abs(((double) num1 / num2) - userAns) < threshold) { // will students be able to calculate up to one
            // decimal place? I could flip the numbers so that
            QResponses(true);                               // the bigger one is in the denominator... I could.
            numOfCorrectAnswers++;
        } else {

            QResponses(false);
        }

        return numOfCorrectAnswers;
    }


    private static void QResponses(boolean userAnswer) {

        Random rndNum = new Random();
        int rndResponse = rndNum.nextInt(4) + 1;

        if (userAnswer == true) {

            switch (rndResponse) {
                case 1:
                    System.out.println("Very good!"); // random words of encouragement based on the rubric
                    break;

                case 2:
                    System.out.println("Excellent!");
                    break;

                case 3:
                    System.out.println("Nice work!");
                    break;

                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }

        }


        else if (userAnswer == false){

            switch(rndResponse) {

                case 1:
                    System.out.println("No. Please try again");
                    break;

                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;

                case 3:
                    System.out.println("Don't give up!");
                    break;

                case 4:
                    System.out.println("No. Keep trying.");
                    break;
            }

        }


    }
}
// This was fun, figuring out how to make division work was a little bit of a pain, but as long as you are accurate to
// one decimal place it will count as correct.
// I got more practice in multiplication out of testing this program than I'd like to admit...

// Made by Noah Klautky, COP3330-19, TueThu 6:00PM - 7:15PM
