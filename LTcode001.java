import java.util.Scanner;
public class LTcode001 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome:");
        int number = scanner.nextInt();
        LTcode001 solution = new LTcode001();
        boolean result = solution.isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
        scanner.close();
}
}