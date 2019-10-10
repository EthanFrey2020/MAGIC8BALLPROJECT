import java.util.Scanner;

public class Magic8Ball {


    public static void main(String[]args){
        //TODO DECLARE VARIABLES
            Scanner keyboard;
            String first,second,third,four,five,six,seven,eight,nine,ten;


        //TODO INITIALIZE VARIABLES MANUALLY
            keyboard = new Scanner(System.in);
            int number;
            String responseOne = "Absolutely";
            String responseTwo = "You should do that";
            String responseThree = "HOW IT DO BABY!!!";
            String responseFour = "You can do it!";
            String responseFive = "Stay Golden Pony Boy";
            String responseSix = "Don't Even try";
            String responseSeven = "That's not intelligent";
            String responseEight = "That's a bad idea";
            String responseNine = "You shouldn't do that";
            String responseTen = "Negative Go Staters Buckaroo";

         //TODO ASK QUESTIONS
                System.out.println("Pick a number 1-100");
                        number = keyboard.nextInt();

        //TODO IF/THEN STATEMENT LADDERS
                if (number > 1 && number <= 10) {
                        System.out.println(responseEight);
            }
                if (number > 11 && number <= 20) {
                        System.out.println(responseFive);
            }
                if (number > 21 && number <=30) {
                        System.out.println(responseFour);
                }
                if (number > 31 && number <=40) {
                    System.out.println(responseNine);
            }
                if (number > 41 && number <=50) {
                    System.out.println(responseOne);
            }
                if (number > 51 && number <=60) {
                    System.out.println(responseSeven);
            }
                if (number > 61 && number <=70) {
                    System.out.println(responseSix);
            }
                if (number > 71 && number <=80) {
                    System.out.println(responseTen);
            }
                if (number > 81 && number <=90) {
                    System.out.println(responseThree);
            }
                if (number > 91 && number <=100) {
                    System.out.println(responseTwo);
            }







        //TODO PRINT RESULTS





    }
}
