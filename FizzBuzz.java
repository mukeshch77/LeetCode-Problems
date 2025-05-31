import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean divBy3 = (i % 3 == 0);
            boolean divBy5 = (i % 5 == 0);

            if (divBy3 && divBy5) {
                res.add("FizzBuzz");
            } else if (divBy3) {
                res.add("Fizz");
            } else if (divBy5) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
