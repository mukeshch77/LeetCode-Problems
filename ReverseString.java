public class ReverseString {
    public void reverseString(char[] s) {
        int l = s.length - 1;
        char temp;
        for(int i = 0; i < s.length/2; i++, l--){
            temp = s[i];
            s[i] = s[l];
            s[l] = temp;
        }
    }
}
