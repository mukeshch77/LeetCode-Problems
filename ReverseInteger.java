public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            
            rev = rev * 10 + temp;
        }

        return rev;
    }
}
