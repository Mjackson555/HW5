/**Class: ReverseString
 * @author Maurice
 * @version 1.0
 * Course: Itec section 10 fall 2024
 * Written: November 5, 2024
 * This will print an input given by the user backwords
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
