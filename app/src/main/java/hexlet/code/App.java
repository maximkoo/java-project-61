package hexlet.code;

import java.util.Scanner;

public class App {
    //String username;
    public static void main(String[] args) {
        System.out.println("Please enter the game name and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        System.out.println("Your choice: " + choice);
        System.out.println();
        //sc.close();
        if (choice.equals("1")) {
            String username = greet();
        } else if (choice.equals("2")) {
            even();
        } else if (choice.equals("3")) {
            calc();
        }
    }


    public static String greet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = sc.next();
        System.out.println("Hello, " + username);
        return username;
    }

    public static void even() {
        String username = greet();
        String correctAnswer;
        int cnt = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (cnt < 3) {
            int num = (int) (100 * Math.random());
            if (num % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            System.out.println("Question: " + num);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if (answer.equals(correctAnswer)) {
                cnt++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + username);
                return;
            }
        }
    }

    public static void calc() {
        String username = greet();
        String correctAnswer;
        System.out.println("What is the result of the expression?");
        int cnt = 0;
        while (cnt < 3) {
            int n1 = 1+(int) (20 * Math.random());
            int n2 = 1+(int) (20 * Math.random());
            //int sgnN = (int) (4 * Math.random());
            String sgn = switch ((int) (3 * Math.random())) {
                case 0 -> "+";
                case 1 -> "-";
                case 2 -> "*";
                default -> "+";
            };
            correctAnswer = switch (sgn){
                case "+" -> Integer.valueOf(n1+n2).toString();
                case "-" -> Integer.valueOf(n1-n2).toString();
                case "*" -> Integer.valueOf(n1*n2).toString();
                default -> "0";
            };
            System.out.printf("Question: %d %s %d%n",n1, sgn, n2);
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if (answer.equals(Integer.valueOf(correctAnswer).toString())) {
                cnt++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + username);
                return;
            }
        }
    }
}

