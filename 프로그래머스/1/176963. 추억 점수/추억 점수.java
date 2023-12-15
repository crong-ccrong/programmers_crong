import java.util.*;

class Solution {
    public List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<yearning.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++) {
            int score = 0;
            for (String person : photo[i]) {
                score += map.getOrDefault(person, 0);
            }
            answer.add(score);
        }
        return answer;
    }
}