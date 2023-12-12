import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Map<Character, Integer> map = new HashMap<>();
        
        for (char a : my_string.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        
        for (char a='A'; a<='Z'; a++) {
			answer[a-65] = map.getOrDefault(a, 0);
		}
		for (char a='a'; a<='z'; a++) {
			answer[a-71] = map.getOrDefault(a, 0);
		}
        
        return answer;
    }
}