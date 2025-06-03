public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
    
        for (char c : s.toCharArray()) {
            if (c != '-') {
                sb.append(Character.toUpperCase(c));
            }
        }

        sb.reverse();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            if (i > 0 && i % k == 0) {
                res.append('-');
            }
            res.append(sb.charAt(i));
        }
                    
        return res.reverse().toString();
    }
}
