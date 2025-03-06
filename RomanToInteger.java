import java.util.Scanner;

public class RomanToInteger {

    public static int getVal(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int romanToInt(String s) {
        int n = s.length(), sum = 0, i = 0;

        while (i < n) {
            char ch1 = s.charAt(i);
            if ((i + 1) < n && getVal(ch1) < getVal(s.charAt(i + 1))) {
                sum -= getVal(ch1);
            } else {
                sum += getVal(ch1);
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();
        int result = romanToInt(roman);
        System.out.println("Integer value: " + result);
        sc.close();
    }
}
