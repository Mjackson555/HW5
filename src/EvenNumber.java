/**Class: EvenNumber
 * @author Maurice
 * @version 1.0
 * Course: Itec section 10 fall 2024
 * Written: November 5, 2024
 * This will determin if a number is even or odd
 */

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isEven(num);
    }
    public static void isEven(int number) {
        if(number % 2 == 0) {
            printEven(true);
        }else {
            printEven(false);
        }
    }
    public static void printEven(boolean isEven) {
        if(isEven) {
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
