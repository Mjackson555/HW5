/**Class: IsPalindrome
 * @author Maurice
 * @version 1.0
 * Course: Itec section 10 fall 2024
 * Written: November 5, 2024
 * This will determine if a phrase is a palindrome
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
    public static boolean isPalindrome(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (reverse.equals(s)) {
            return true;
        }else{
            return false;
        }
    }
}
