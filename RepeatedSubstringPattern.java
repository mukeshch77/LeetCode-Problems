public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        String DS = s + s;
     
        String subS = DS.substring(1, DS.length() - 1);

        return subS.contains(s);
    }
}
