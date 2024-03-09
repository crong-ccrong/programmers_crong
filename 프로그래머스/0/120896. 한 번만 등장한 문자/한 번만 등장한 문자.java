import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        List<Character> removeList = new ArrayList<>();
        for (Character c : map.keySet()) {
            if (map.get(c) > 1) {
                removeList.add(c);
            }
        }
        for (char c : removeList) {
            map.remove(c);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (char c : list) {
            answer += c+"";
        }
        return answer;
    }
}