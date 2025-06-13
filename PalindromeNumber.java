import java.util.Scanner;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int temp = x;
        int res = 0;
        while(x > 0){
            int digit = x % 10;
            res = res * 10 + digit;
            x /= 10;
        }
        return ((res == temp)? true : false);
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
