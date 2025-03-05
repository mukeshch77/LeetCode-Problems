import java.util.Scanner;

public class FirstOccurrenceString {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();

        if (l1 < l2) 
            return -1;

        for (int i = 0; i <= l1 - l2; i++) {
            String substr = haystack.substring(i, i + l2);
            if (substr.equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the haystack string: ");
        String haystack = scanner.nextLine();

        System.out.print("Enter the needle string: ");
        String needle = scanner.nextLine();
        scanner.close();

        FirstOccurrenceString fos = new FirstOccurrenceString();
        int result = fos.strStr(haystack, needle);

        if (result != -1) {
            System.out.println("First occurrence of \"" + needle + "\" in \"" + haystack + "\" is at index: " + result);
        } else {
            System.out.println("Substring not found.");
        }
    }
}
