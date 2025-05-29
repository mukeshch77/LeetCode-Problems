public class MaximumNumberofBalloons {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        int b = countMap.getOrDefault('b', 0);
        int a = countMap.getOrDefault('a', 0);
        int l = countMap.getOrDefault('l', 0) / 2;
        int o = countMap.getOrDefault('o', 0) / 2;
        int n = countMap.getOrDefault('n', 0);

        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}
