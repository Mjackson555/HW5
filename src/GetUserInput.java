/**Class: GetUserInput
 * @author Maurice
 * @version 1.0
 * Course: Itec section 10 fall 2024
 * Written: November 5, 2024
 * This will print an input given by the user
 */

import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = sc.nextLine();
        getInput(phrase);
    }

    public static void getInput(String phrase){
        printString(phrase);
    }

    public static void printString(String phrase){
        System.out.println(phrase);
    }
}
