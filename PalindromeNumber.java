import java.util.Scanner;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
  
        int sum = 0, target = x;
        while (x > 0) {
            int temp = x % 10;
            sum = sum * 10 + temp;
            x = x / 10;
        }
        return target == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        scanner.close();

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(x);

        System.out.println("Is " + x + " a palindrome? " + result);
    }
}
