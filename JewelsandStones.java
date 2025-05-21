import java.util.HashSet;
import java.util.Set;

public class JewelsandStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jSet.add(c);
        }

        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jSet.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
