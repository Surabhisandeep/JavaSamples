public class Palindrome {
    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return str.equals(reversed.reverse().toString());
    }

    public static void main(String[] args) {
        String input = "racecar";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
