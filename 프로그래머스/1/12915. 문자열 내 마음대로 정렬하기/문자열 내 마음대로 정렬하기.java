import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> answer = new ArrayList<>();
        Map<Character, List<String>> map = new HashMap<>();
        
        for (String s : strings) {
            List<String> list = map.getOrDefault(s.charAt(n), new ArrayList<>());
            list.add(s);
            map.put(s.charAt(n), list);
            
            Collections.sort(list);
        }
        
        List<Character> sort = new ArrayList<>(map.keySet());
        Collections.sort(sort);
        
        for (char c : sort) {
            for (String s : map.get(c)) {
                answer.add(s);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}