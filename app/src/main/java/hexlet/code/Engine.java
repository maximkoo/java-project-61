package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void flow(String gameType) {
        String username = greet();
        int cnt = 0;
        String answer;
        String correctAnswer;
        while (cnt < 3) {
            Scanner sc = new Scanner(System.in);
            correctAnswer = switch (gameType) {
                case "even" -> even(username);
                case "calc" -> calc(username);
                default -> "";
            };
            answer = sc.next();
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


    public static String greet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = sc.next();
        System.out.println("Hello, " + username);
        return username;
    }

    public static String even(String username) {
        //String username = greet();
        String correctAnswer;
        //int cnt = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        //while (cnt < 3) {
        int num = (int) (100 * Math.random());
        if (num % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        System.out.println("Question: " + num);
        return correctAnswer;
    }

    public static String calc(String username) {
        String correctAnswer;
        System.out.println("What is the result of the expression?");
        int cnt = 0;
        int n1 = 1 + (int) (20 * Math.random());
        int n2 = 1 + (int) (20 * Math.random());
        String sgn = switch ((int) (3 * Math.random())) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> "+";
        };
        correctAnswer = switch (sgn) {
            case "+" -> Integer.valueOf(n1 + n2).toString();
            case "-" -> Integer.valueOf(n1 - n2).toString();
            case "*" -> Integer.valueOf(n1 * n2).toString();
            default -> "0";
        };
        System.out.printf("Question: %d %s %d%n", n1, sgn, n2);
        return correctAnswer;
    }
}
