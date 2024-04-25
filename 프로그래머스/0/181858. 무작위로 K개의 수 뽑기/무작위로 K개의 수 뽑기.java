import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int [] answer = new int[k];
        Arrays.fill(answer, -1);
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
            if (map.get(i) == 1 && index < k) {
                answer[index++] = i;
            }
        }
        return answer;
    }
}