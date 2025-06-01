public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] l = new int[26]; 

        for (char c : magazine.toCharArray()) {
            l[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (l[c - 'a'] == 0) {
                return false;
            }
            l[c - 'a']--;
        }

        return true;
    }
}
