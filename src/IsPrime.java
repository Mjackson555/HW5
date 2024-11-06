/**Class: IsPrime
 * @author Maurice
 * @version 1.0
 * Course: Itec section 10 fall 2024
 * Written: November 5, 2024
 * This will print if an input is prime
 */
public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
