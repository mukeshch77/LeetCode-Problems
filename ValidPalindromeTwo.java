public class ValidPalindromeTwo {
    public boolean validPalindrome(String s) {

        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return isPalind(s, l + 1, r) || isPalind(s, l, r - 1);
            }
        }

        return true;
    }

    boolean isPalind(String str, int l, int r) {
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
