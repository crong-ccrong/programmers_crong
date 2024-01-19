import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (c>='0' && c<='9') {
                list.add(Integer.parseInt(c+""));
            }
        }
        
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
        return answer;
    }
}