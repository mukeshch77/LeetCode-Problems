import java.util.ArrayList;
import java.util.Stack;

public class OnlineStockSpan {
    Stack<Integer> stack;
    ArrayList<Integer> list;
    public OnlineStockSpan() {
        stack = new Stack<>();
        list = new ArrayList<>();
        
    }
    
    public int next(int price) {
        list.add(price);
        // index = stack.peek()
        // list.get(index) -> value

        while (!stack.isEmpty() && list.get(stack.peek()) <= price) {
            stack.pop();
        }

        int preGreaterIndex = (stack.isEmpty()) ? -1 : stack.peek();
        int currentIndex = list.size()-1;
        int ans = currentIndex - preGreaterIndex;
        stack.push(currentIndex);
        return ans;
    }
}
