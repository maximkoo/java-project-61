package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println("Hello, " + username);
        sc.close();
    }

}
