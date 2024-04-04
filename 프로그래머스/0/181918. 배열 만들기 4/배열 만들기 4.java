import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i : arr) {
            while (!stk.empty() && stk.peek() >= i) {
                stk.pop();
            }
            stk.push(i);
        }
        return stk.stream().mapToInt(i -> i).toArray();
    }
}