import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String str : intStrs) {
            if (k < Integer.parseInt(str.substring(s, s+l))) {
                answer.add(Integer.parseInt(str.substring(s, s+l)));
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}