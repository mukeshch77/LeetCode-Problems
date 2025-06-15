public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        char found = '$';
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(letters[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
                found = letters[mid];
            }
        }
        return (found == '$') ? letters[0] : found;
    }
}
