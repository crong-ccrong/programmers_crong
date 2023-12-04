class Solution {
    public int[] solution(int[] sequence, int k) {
        int start = 0;
        int end = -1;
        int count = 0;
        int size = sequence.length+1;
        int[] answer = new int[2];
        
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
                if (size > end-start+1) {
                    size = end-start+1;
                    answer[0] = start;
                    answer[1] = end;
                }
                ++end;
                if (end == sequence.length) {
                    break;
                }
                count += sequence[end];
                continue;
            }
        }
        return answer;
    }
}