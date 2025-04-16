import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTwo {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long val = 1;
        row.add(1); // C(k, 0) is always 1

        for (int i = 1; i <= rowIndex; i++) {
            val = val * (rowIndex - i + 1) / i;
            row.add((int) val);
        }

        return row;
    }
}
