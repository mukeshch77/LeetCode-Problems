public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int c = 0;

        while (i >= 0 || j >= 0 || c != 0) {
            int dig1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int dig2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int sum = dig1 + dig2 + c;
            res.append(sum % 10);
            c = sum / 10;
        }

        return res.reverse().toString();
    }
}
