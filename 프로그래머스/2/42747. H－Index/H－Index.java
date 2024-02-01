import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        
        Arrays.sort(citations);
        
        for (int i=0; i<length; i++) {
            answer = Math.max(answer, Math.min(citations[i], length-i));
        }
        return answer;
    }
}