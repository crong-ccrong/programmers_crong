import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int start = 0;
        int end = -1;
        int count = 0;
        Map<Integer, int[]> answers = new HashMap<>();
        
        while (start < sequence.length && end < sequence.length) {
            if (count < k) {
                ++end;
                if (end == sequence.length) {
                    break;
                }
                count += sequence[end];
            } else if (count > k) {
                count -= sequence[start++];
            } else {
                int[] answer = {start, end};
                answers.put(end-start+1, answers.getOrDefault(end-start+1, answer));
                ++end;
                if (end == sequence.length) {
                    break;
                }
                count += sequence[end];
                continue;
            }
        }
        return answers.get(Collections.min(answers.keySet()));
    }
}