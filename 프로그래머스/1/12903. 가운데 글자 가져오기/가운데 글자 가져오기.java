import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            list.add(s.charAt(i));
        }
        if (s.length()%2 == 0) {
            answer = "" + (list.get((s.length()/2)-1)) + (list.get(s.length()/2));
        } else {
        	answer = "" + list.get(s.length()/2);
        }
        return answer;
    }
}