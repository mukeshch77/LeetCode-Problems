public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNo) {
        String result = "";
        
        while (columnNo > 0) {
            columnNo--;
            int rem = columnNo % 26;
            char curChar = (char) ('A' + rem);
            result = curChar + result;
            columnNo = columnNo / 26;
        }

        return result;
    }
}
