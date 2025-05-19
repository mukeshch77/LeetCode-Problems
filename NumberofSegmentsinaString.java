public class NumberofSegmentsinaString {
    public int countSegments(String s) {
        if (s == null || s.length() == 0) return 0;
        
        String[] segments = s.trim().split("\\s+");
        
        return s.trim().isEmpty() ? 0 : segments.length;
    }
}
