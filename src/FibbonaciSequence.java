/**Class: FibbonaciSequence
 * @author Maurice
 * @version 1.0
 * Course: Itec section 10 fall 2024
 * Written: November 5, 2024
 * This will do the Fibbonaci sequence till number
 */

import java.util.Scanner;

public class FibbonaciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(n != -1){
            System.out.print("Enter number(-1 to stop): ");
            n = sc.nextInt();
            fib(n);
        }
    }
    public static void fib(int n) {
        int num = 0;
        int num1 = 1;
        for(int i=0;i<n;i++){
            System.out.print(num + ",");
            int num2 = num + num1;
            num = num1;
            num1 = num2;
        }
        System.out.println("");
    }
}
