package hexlet.code;

import java.util.Scanner;

public class App {
    //String username;
    public static void main(String[] args) {
        System.out.println("Please enter the game name and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        System.out.println("Your choice: " + choice);
        System.out.println();
        //sc.close();
        if (choice.equals("1")) {
            Engine.greet();
        } else if (choice.equals("2")) {
            Engine.flow("even");
        } else if (choice.equals("3")) {
            Engine.flow("calc");
        } else if (choice.equals("4")) {
            Engine.flow("GCD");
        } else if (choice.equals("0")) {
            return;
        }
    }
}

