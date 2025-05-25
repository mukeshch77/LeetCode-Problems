public class GoatLatin {
    public String toGoatLatin(String S) {
        StringBuilder res = new StringBuilder();
        String[] words = S.split(" ");
        
        for (int i = 0; i < words.length; i++) { 
            String word = words[i];
            StringBuilder modifiedWord = new StringBuilder();
            
            if (isVowel(word.charAt(0))) {
                modifiedWord.append(word).append("ma");
            } else {
                modifiedWord.append(word.substring(1)).append(word.charAt(0)).append("ma");
            }
            
            for (int j = 0; j <= i; j++) {
                modifiedWord.append("a");
            }
            
            res.append(modifiedWord);
            if (i < words.length - 1) {
                res.append(" ");
            }
        }
        
        return res.toString();
    }
    
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
