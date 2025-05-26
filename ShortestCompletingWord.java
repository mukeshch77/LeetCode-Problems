import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase().replaceAll("[^a-z]", "");
        Map<Character, Integer> lPMap = new HashMap<>();
        for (char c : licensePlate.toCharArray()) {
            lPMap.put(c, lPMap.getOrDefault(c, 0) + 1);
        }

        String result = "";
        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<>();
            for (char c : word.toLowerCase().toCharArray()) {
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }
            if (canComplete(lPMap, wordMap)) {
                if (result.isEmpty() || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        
        return result;
    }
    
    private boolean canComplete(Map<Character, Integer> lPMap, Map<Character, Integer> wordMap) {
        for (Map.Entry<Character, Integer> entry : lPMap.entrySet()) {
            char letter = entry.getKey();
            int count = entry.getValue();
            if (wordMap.getOrDefault(letter, 0) < count) {
                return false;
            }
        }
        return true;
    }
}
