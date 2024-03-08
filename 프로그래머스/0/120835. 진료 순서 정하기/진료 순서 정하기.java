import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<emergency.length; i++) {
            map.put(emergency[i], Math.abs(emergency.length-i));
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        
        for (int i=0; i<emergency.length; i++) {
            answer[i] = map.get(list.get(i));
        }
        return answer;
    }
}