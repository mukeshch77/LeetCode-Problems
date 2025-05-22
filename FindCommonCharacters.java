import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        int[] minmumFreq = new int[26];
        Arrays.fill(minmumFreq, Integer.MAX_VALUE);
        
        for (String word : words) {
            int[] chCount = new int[26];
            for (char c : word.toCharArray()) {
                chCount[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minmumFreq[i] = Math.min(minmumFreq[i], chCount[i]);
            }
        }
        
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minmumFreq[i]; j++) {
                result.add(String.valueOf((char)(i + 'a')));
            }
        }
        
        return result;
    }
}
