import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            answer[i] = i - map.getOrDefault(s.charAt(i), i+1);
            map.put(s.charAt(i), i);
        }
        return answer;
    }
}